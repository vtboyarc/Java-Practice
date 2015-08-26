import world.Plant;


public class Grass extends Plant{
	public Grass() {
		//still won't work, Grass isn't in same package as plant, which is where height is
		//System.out.println(this.height);
	}

}
