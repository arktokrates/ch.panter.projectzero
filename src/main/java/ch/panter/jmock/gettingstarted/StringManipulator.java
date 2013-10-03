package ch.panter.jmock.gettingstarted;


public class StringManipulator implements IMdpJunitDemo{

	@Override
	public boolean isEmpty(String s) {
		// Plausibility check
		return s.isEmpty() || (s==(null));
	}

	@Override
	public String capitalize(String s) {
		// Capitalize a string
		return (Character.toUpperCase(s.charAt(0))+s.substring(1).toLowerCase());
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		// Reverse chars of a String
		return new StringBuilder(s).reverse().toString();
	}

	@Override
	public String join(String... strings) {
		// Joins given Strings to one String and seperates them with a whitespace.
		String temp = "";
		for(String s:strings){
			temp+=s+" ";
		}
		return temp;
	}

}
