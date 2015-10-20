/**
 * This is an example of Varargs which was introduced in Java 5.
 * @author Chad Adams <https://github.com/Adams94>
 */
public class VarargsExample {

	public static void main(String[] args) {
		displayTest("I can enter multiple string arugments", "Varargs is a very nice feature.",
				"Introduced in Java 5.");
	}
	
	/**
	 * This method displays lines of text using Varargs.
	 * @param text
	 * 		The infinite amount of lines you want to display.
	 */
	public static void displayTest(String... text) {
		for(String s : text) {
			System.out.println(s);
		}
	}

}
