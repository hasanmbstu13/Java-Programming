import java.util.Scanner;


public class GetUserInput {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.println("May I know your name please?\n");
		String name = myInput.nextLine();
		System.out.println("Your name is " + name);
	}

}
