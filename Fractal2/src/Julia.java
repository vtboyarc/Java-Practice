import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Julia extends JFrame
{ 
    private static final double phi = (Math.sqrt(5)+1)/2;
    public Julia()
    {
	this((new Complex(phi-2, phi-1)));
    }
    public Julia(Complex z)
    {
	setTitle("Fractal");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(1000, 1000);
	setLayout(new BorderLayout());
	DrawingArea canvas = new DrawingArea(z);
	add(canvas, BorderLayout.CENTER);
	setVisible(true);
    }

    public static void main(String[] args)
    {
	try{
	double re = Double.parseDouble(args[0]);
	double im = Double.parseDouble(args[1]);
	Julia window = new Julia(new Complex(re, im));}
	catch (ArrayIndexOutOfBoundsException e) {
	    Julia window = new Julia(); }
    }
}

class DrawingArea extends JPanel implements MouseListener
{
    private Complex c;
    private static double max;
    private double xMin, xMax, yMin, yMax, xScale, yScale;
    private double XMIN, XMAX, YMIN, YMAX;

    public DrawingArea(Complex z)
    {
	XMIN = -2;
	XMAX = 2;
	YMIN = -2;
	YMAX = 2;
	c = z;
	xMin = XMIN;
	xMax = XMAX;
	yMin = YMIN;
	yMax = YMAX;
	double absc = c.abs();
	if (absc > 2)
	    max = absc;
	else
	    max = 2;
	addMouseListener(this);
	ConstantWindow wind = new ConstantWindow();
    }

    public Color paintPixel(Complex z, Graphics g)
    {
	int i = 0;
	int ITERATIONS = 50;
	for(;i <= ITERATIONS; i++)
	    {
		if (z.abs() > max)
		    {
			int color = ITERATIONS-i;
			int red = (color*100)%256;
			int green = (color*110)%256;
			int blue = (color*40)%256;
			return new Color(red, green, blue);
		    }
		z = (z.mul(z)).add(c);
	    }
	return new Color(0, 0, 0);
    }

    public void paintComponent(Graphics g)
    {
	super.paintComponent(g);
	xScale = (xMax-xMin)/getWidth();
	yScale = (yMax-yMin)/getHeight();
	Complex z;
	Color col;

	for (int y = 0; y < getHeight(); y++)
	    {
		for (int x = 0; x < getWidth(); x++)
		    {
			z = new Complex(xMin+x*xScale, yMax-y*yScale);
			col = paintPixel(z, g);
			g.setColor(col);
			g.drawRect(x, y, 1, 1);
		    }
	    }
    }

    public void draw()
    {
	repaint();
    }

    public void mouseClicked(MouseEvent e)
    {
	double width = xMax-xMin;
	xMin = xMin+e.getX()*xScale-width/4;
	xMax = xMin + width/2;

	double height = yMax-yMin;
	yMax = yMax-e.getY()*yScale+height/4;
	yMin = yMax - height/2;

	repaint();
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    private class ConstantWindow extends JFrame
    {
	public ConstantWindow()
	{
	    setTitle("Constant selecter");
	    setResizable(false);
	    setLayout(new BorderLayout());
	    Selecter select = new Selecter();
	    add(select, BorderLayout.CENTER);
	    setSize(406, 426);
	    setVisible(true);
	}
    }

    private class Selecter extends JPanel implements MouseListener, MouseMotionListener
    {
	private double xScale, yScale, currentX, currentY;
	DecimalFormat format;
	public Selecter()
	{
	    addMouseListener(this);
	    addMouseMotionListener(this);
	    currentX = 0;
	    currentY = 0;
	    format = new DecimalFormat("#.####");
	}
    
	public void paintComponent(Graphics g)
	{
	    super.paintComponent(g);
	    g.drawLine(0, 200, 400, 200);
	    g.drawLine(200, 0, 200, 400);
	    g.drawLine(100, 195, 100, 205);   // re -1
	    g.drawString("-1", 95, 190);
	    g.drawLine(300, 195, 300, 205);   // re 1
	    g.drawString("1", 298, 190);
	    g.drawLine(195, 300, 205, 300);   // im -1
	    g.drawString("-1", 210, 304);
	    g.drawLine(195, 100, 205, 100);   // im 1
	    g.drawString("1", 210, 104);
	    g.drawLine(193, 7, 200, 0);
	    g.drawLine(200, 0, 207, 7);
	    g.drawLine(392, 193, 399, 200);
	    g.drawLine(399, 200, 392, 207);
	    g.drawString("Re: " + format.format(currentX) + ", Im: " + format.format(currentY), 250, 390);
	    setSize(400, 400);
	}

	public void mouseClicked(MouseEvent e)
	{
	    xMin = XMIN;
	    xMax = XMAX;
	    yMin = YMIN;
	    yMax = YMAX;
	    xScale = (xMax-xMin)/getWidth();
	    yScale = (yMax-yMin)/getHeight();
	    c = new Complex(xMin+e.getX()*xScale, yMax-e.getY()*yScale);
	    System.out.println("Re: " + c.real() + ", Im: " + c.imaginary());
	    draw();
	}

	public void mouseMoved(MouseEvent e)
	{
	    currentX = xMin+e.getX()*xScale;
	    currentY = yMax-e.getY()*yScale;
	    repaint();
	}

	public void mouseDragged(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
    }
	
}

class Complex
{
    private double re;
    private double im;
    public Complex()
    {
	re = 0;
	im = 0;
    }

    public Complex(double a, double b)
    {
	re = a;
	im = b;
    }

    Complex add(Complex z)
    {
	Complex sum = new Complex();
	sum.re = re + z.re;
	sum.im = im + z.im;
	return sum;
    }

    Complex sub(Complex z)
    {
	Complex difference = new Complex();
	difference.re = re + z.re;
	difference.im = im + z.im;
	return difference;
    }

    Complex mul(Complex z)
    {
	Complex product = new Complex();
	product.re = re*z.re - im*z.im;
	product.im = re*z.im + im*z.re;
	return product;
    }
    
    double abs()
    {
	return Math.sqrt(re*re + im*im);
    }

    double real()
    {
	return re;
    }

    double imaginary()
    {
	return im;
    }
}