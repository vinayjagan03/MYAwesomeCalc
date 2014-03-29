package org.practice.vj;

// This is the import used called a "scanner"
import java.util.Scanner;

public class MyAwesomeCalc {
	/*
	 * In this program, I very well took some advantage of the Math
	 * class provided by Java
	 */
	static Scanner scan = new Scanner(System.in);
	static double add, sub, mul, div, power, circ, root, area; // Operators
	static int operator;
	static double number1, number2; // User Input Numbers

	public static void start() {
		System.out.println("Enter your number: ");
		number1 = scan.nextDouble();
		System.out.println("Enter operator");
		System.out.println("");
		System.out.println("Addition + | Enter <1>");
		System.out.println("Subtraction - | Enter <2>");
		System.out.println("Multiplication * | Enter <3>");
		System.out.println("Division / | Enter <4>");
		System.out.println("Power of x² | Enter <5>");
		System.out.println("Square root | Enter <6>");
		System.out.println("Circumference of a Circle () | Enter <7>");
		// Done like a boss
		System.out.println("Run a for loop through user input (First number won't be used)| Enter <8>");
		System.out.println("Area of a Square [] | Enter <9>");
		System.out.println("Area of a Rectangle [ ] | Enter <10>");
		operator = scan.nextInt();
	}

	public static void calculate() {
		start();
		if (operator == 1) {
			System.out.println("Enter another number: ");
			number2 = scan.nextDouble();
			// Addition variable
			add = number1 + number2;
			System.out.println("Answer: " + add);
		}
		if (operator == 2) {
			System.out.println("Enter another number: ");
			number2 = scan.nextDouble();
			// Subtraction variable
			sub = number1 - number2;
			// Code below is not needed!!
			/*
			 * 
			 * if (sub < 0) { System.out.println("Answer: " + "-" +
			 * Math.abs(sub)); } else { System.out.println("Answer: "
			 * 
			 * }
			 */
			System.out.println("Answer: " + sub);
		}
		if (operator == 3) {
			System.out.println("Enter another number: ");
			number2 = scan.nextDouble();
			// Multiplication variable
			mul = number1 * number2;
			System.out.println("Answer: " + mul);
		}

		if (operator == 4) {
			System.out.println("Enter another number: ");
			number2 = scan.nextDouble();
			// Division variable
			div = number1 / number2;
			System.out.println("Answer: " + div);
		}

		if (operator == 5) {
			System.out.println("Power of what?: ");
			number2 = scan.nextDouble();
			// Set number1 to the power of number 2
			power = Math.pow(number1, number2);
			System.out.println("Answer: " + power);
		}

		if (operator == 6) {
			// Math.sqrt is used
			root = Math.sqrt(number1);
			System.out.println("Answer: " + root);
		}

		if (operator == 7) {
			System.out.println("Is Diameter <1> or Radius <2> is given?: ");
			double chooseDR = scan.nextDouble();

			if (chooseDR == 1) {
				// Circumference variable
				circ = number1 * Math.PI; // 3.14159265359
			}

			if (chooseDR == 2) {
				// Circumference variable
				circ = 2 * number1 * Math.PI;
			}

			System.out.println("Answer: " + circ);
		}
		if (operator == 8) {
			 /* This would seem weird in a sense but you know what, I
			 definitely got bored of the operators I should do in
			 this calculator */
			System.out.println("Starting: ");
			double starte = scan.nextDouble();
			System.out.println("Ending: ");
			double ende = scan.nextDouble();
			System.out.println("Increment: ");
			double inc = scan.nextDouble();
			for (double i = starte; i < ende + inc; i += inc) {
				if (i > ende) i = ende;
				System.out.println("");
				System.out.println("Loop: " + i);
			}
		}
		if (operator == 9) {
			area = number1 * number1;
			System.out.println("Answer: " + area);
		}
		if (operator == 10) {
			System.out.println("Width: ");
			double width = scan.nextDouble();
			System.out.println("Height: ");
			double height = scan.nextDouble();
			area = width * height;
			if (width == height) System.out.println("You are inputing a square formula!!");
			System.out.println("Answer: " + area);
		}
	}

	// Main method "BIG Need-Need!!"
	public static void main(String[] args) {
		System.out.println("Welcome to Calculator in Java | By: Vinay Jagan");
		System.out.println("");
		calculate();
		System.out.println("");
		System.out.println("Thank you for using Calculator in Java | By: Vinay Jagan");
		System.out.println("");
	}
}
