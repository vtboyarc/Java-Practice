public class App {
	public static void main(String[] args) {

		// making an object from the UrlLibrary class
		UrlLibrary urlLibrary = new UrlLibrary();

		// for String html in urlLibrary, the object we created above
		// this will print out everything we stored in the Constructor in the
		// UrlLibrary class
		for (String html: urlLibrary) {
			System.out.println(html.length());
			//prints out the HTML from the urls
			System.out.println(html);
		}
	}
}
