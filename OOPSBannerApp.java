public class OOPSBannerApp {
	static class CharacterPatternMap{
		char character;
		String[] pattern;

		CharacterPatternMap(char character, String[] pattern) {
			this.character = character;
			this.pattern = pattern;

		}
	}

	public static CharacterPatternMap[] createCharacterPatternMaps() {
		OOPSBannerApp.CharacterPatternMap[] charMap = new OOPSBannerApp.CharacterPatternMap[26];

		charMap[14] = new CharacterPatternMap('O', new String[] {
			"   ***   ",
			" **   ** ",
			"**     **",
			"**     **",
			"**     **",
			" **   ** ",
			"   ***   "
		});

		charMap[15] = new CharacterPatternMap('P', new String[] {
			"******   ",
			"**    ** ",
			"**     **",
			"**    ** ",
			"******   ",
			"**       ",
			"**       "
		});
		charMap[18] = new CharacterPatternMap('S', new String[] {
			"   ***** ",
			" **      ",
			"**       ",
			"  ****   ",
			"     **  ",
			"**    ** ",
			"  ****   "
		});

		return charMap;
		
	}

	public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMap) {
		return charMap[ch - 'A'].pattern;
	}

	public static void printMessage(String message, CharacterPatternMap[] charMap) {

		int len = message.length();
		String[][] ans = new String[len][7];
		int i = 0;
		for(char ch:message.toCharArray()) {
			ans[i++] = getCharacterPattern(ch, charMap);

		}

		for(int j = 0; j < 7; j++) {
			for(int k = 0; k < len; k++) {
				System.out.print(ans[k][j]);
				System.out.print(" ");

			}
			System.out.println();

		}
		

	}
	public static void main(String[] args) {
			CharacterPatternMap[] charMap = createCharacterPatternMaps();
			String message = "OOPS";
			printMessage(message,charMap);

		}
}