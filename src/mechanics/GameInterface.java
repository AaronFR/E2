package mechanics;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameInterface {
	
	private static boolean inputSensible;
	
	public static void main(String[] args) {
		
		// SHIT I get it, you can put objects, beans in containers thats the use of it. You don't need to create the complicated hierarchies you've been creating
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Scanner input = new Scanner(System.in);
	
		System.out.println(">: ");
		String textInput = input.next();
		
		textInput = inputCorrection(textInput);
		
		if (!textInput.equals("quit")) {
			// will need to create objects - SPRING!
			main_gameplay_loop(textInput);
			
			main(args);
		}
		else {
			input.close();
		}
		
	}
	
	public static String inputCorrection(String textInput) {
		textInput = textInput.toLowerCase();
		inputSensible = false;
		
		if (textInput.equals("check")) {
			inputSensible = true;
		}
		// the ideal solution would be to use a dictionary of names and then set a method externally depending on which one matches
		
		return textInput;
	}
	
	public static void main_gameplay_loop(String textInput) {
		
		if (!inputSensible) {
			System.out.println("what?");
		}
		else {
			System.out.println("Nothing to check");
		}
		
	}
}
