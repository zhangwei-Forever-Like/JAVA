
public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = { 'l', 'o', 'v', 'e' };
		for (int i = 0; i < array.length; i++) {
			int character=array[i];
			if ((character >= 'a' && character <= 'z') || ( character > 'A' && character <= 'Z')) {
				character = character + 4;
				if ((character > 'Z' && character <= 'Z' + 4)) {
					character = character - 26;
				}
			}
			System.out.print((char)character);
		}
	
	}

}
