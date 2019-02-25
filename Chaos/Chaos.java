/*
 *Programed By: Teague Wingfelder, Justin Sousa, Martin Horciak
 *Programed For: Mr. L. Calomeni
 *Corse: ICS201
 *Date: Thursday, January 12, 2017.
 *Program discription:	The program prompts the user for a number between 0 and 1 then
 *						preforms the chaos theory.
 */

 import java.util.Scanner;												//import statment - Scanner class

 class Chaos {															//Class decoration

 	public static void main (String [] args) {							//main method

 		double x = 0.5;													//Double varable Decloration
 		int num;														//Integer varable decloration

 		Scanner input = new Scanner (System.in);						//creates a scanner

 		System.out.print ("Please enter a number between 2 and 4: ");	//asks the user to input a number
 		num = input.nextInt();											//allows user to input number
 		input.close();													//closes scanner

 		for (int i = 1; i <=50; i++){									//for statment looping 50 times
 			x = num*x*(1-x);											//logistic equation
 			System.out.println(x);										//displays the varable x after the equation is done.
 		}
 	}
 }

 /* Question a)
  *After trying the equation one I predict that any other number I put in will
  *eventually end up displaying 0.5 and when at 0.5 will continuously display 0.5.
  * Question b)
  *When I put in 3 I get a bunch of random number but when I input 4 the first
  *number is 1 then the rest of the numbers displayed are 0.
  */

