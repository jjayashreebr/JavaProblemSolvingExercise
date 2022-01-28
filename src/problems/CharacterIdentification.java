package problems;

public class CharacterIdentification {

	public static void main(String[] args) {
		char ch = 'A';

		if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
			System.out.println("Alphabet");
		} else if (ch >= 48 && ch <= 57) {
			System.out.println("Digit");
		} else {
			System.out.println("Special Character");
		}
	}

}
