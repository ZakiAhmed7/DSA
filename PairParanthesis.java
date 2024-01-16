import java.io.Console;
import java.util.Scanner;

class PairParanthesis {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input only () {} [] in this format");

		String input = scanner.nextLine();

        if (input.contains("{") || input.contains("}") || input.contains("(") 
		|| input.contains(")") || input.contains("[") || input.contains("]") ) {

			boolean check = checkForValidity(input);

			if (check)
				System.out.println(check);
			else 
				System.out.println(check);
		}
	}

	private static boolean checkForValidity(String input) {

		char inputCharacters[] = input.toCharArray();
		boolean trueCounter = false;
		for (int i = 0, j = inputCharacters.length - 1; i < (inputCharacters.length / 2); i++, j--) {
			char startingParanthesis = inputCharacters[i];
			char endingParanthesis = inputCharacters[j];
				if (startingParanthesis == '(') {
					if (endingParanthesis == ')') 
						trueCounter = true;
					else
						return false;
				} else if (startingParanthesis == '[') {
					if (endingParanthesis == ']')
						trueCounter = true;
					else
						return false;
				} else if (startingParanthesis == '{') {
					if (endingParanthesis == '}')
						trueCounter = true;
					else
						return false;
				} else 
					 return false;	
			}
			if (trueCounter)
				return true;
			else 
				return false;

	}
}
