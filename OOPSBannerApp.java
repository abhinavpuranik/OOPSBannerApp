//@author: Developer
//version 8.0


import java.util.HashMap;
//public class
public class OOPSBannerApp {

	public static void main(String[] args) {
		HashMap<Character, String[]> charMap = createCharacterMap();
		String message = "OOPS";
		displayBanner(message, charMap);
	}

//static function to create character map and load it with patterns for letters
	public static HashMap<Character, String[]> createCharacterMap() {

		HashMap<Character, String[]> charMap = new HashMap<>();
		charMap.put('O', new String[] {
			"   ***   ",
			" **   ** ",
			"**     **",
			"**     **",
			"**     **",
			" **   ** ",
			"   ***   "
		});

		charMap.put('P', new String[] {
			"******  ",
			"**   ** ",
			"**   ** ",
			"******  ",
			"**      ",
			"**      ",
			"**      "
		});
		charMap.put('S', new String[] {
			"  *****  ",
			" **   ** ",
			"**       ",
			"  *****  ",
			"       **",
			" **   ** ",
			"  *****  "
		});
		return charMap;
	}
//static function to display the banner by iterating through each line of the pattern and printing the corresponding characters using StringBuilder for efficient string concatenation
	public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
		int patternHeight = charMap.get('O').length;

		for(int line = 0; line < patternHeight; line++) {
			StringBuilder sb = new StringBuilder();
			for(char ch : message.toCharArray()) {
				String[] pattern = charMap.get(ch);
				sb.append(pattern[line]).append(" ");

			}
			System.out.println(sb.toString());

		}
	}





	
	
}