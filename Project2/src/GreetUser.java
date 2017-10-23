import java.util.Scanner;

public class GreetUser
	{
		public static String name;
		
		public static void greetUser()
			{
				System.out.println("Hello! What is your name?");
				Scanner userInput = new Scanner(System.in);
				name = userInput.nextLine();
				name = name.substring(0).toUpperCase();
				System.out.println("Hello, " + name + "! Welcome to five card draw poker!");
			}
	}
