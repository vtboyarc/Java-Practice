import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;


public class UrlLibrary implements Iterable<String> {
	private LinkedList<String> urls = new LinkedList<String>();
	
	//Inner Class
	private class UrlIterator implements Iterator<String> {
		
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {
			
			StringBuilder sb = new StringBuilder();
			
			//URL is an import 
			//this actually gets the HTML from the urls
			try {
				URL url =  new URL(urls.get(index));
				
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				
				
				String line = null;
				
				while((line =br.readLine()) != null) {
					sb.append(line);
					sb.append("\n");
				}
				
				br.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//need to increment to next index
			index++;
			
			return sb.toString();
		}

		@Override
		public void remove() {
			urls.remove(index);
			
		}
		
	}
	
	//Constructor
	public UrlLibrary() {
		urls.add("http://www.google.com");
		urls.add("http://www.facebook.com");
		urls.add("http://www.gizmodo.com");
	}

	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
	}

	//added this by clicking error on the class after implementing iterable,
	//chose to add unimplemented methods
	/*@Override
	public Iterator<String> iterator() {
		return urls.iterator();
	}*/
}
