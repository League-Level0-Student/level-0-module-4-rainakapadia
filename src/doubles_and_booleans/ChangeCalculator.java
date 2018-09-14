package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String a=JOptionPane.showInputDialog("how many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nickels=Integer.parseInt(a);
double nValue= nickels*0.05;
		// Ask the user how many dimes they have, and convert their answer
String b=JOptionPane.showInputDialog("how many dimes do you have?");
int dimes=Integer.parseInt(b);
double dValue= dimes+0.10;
		// Ask the user how many quarters they have, and convert their answer
String c=JOptionPane.showInputDialog("how many quarters do u have?");
int quarters=Integer.parseInt(c);
double qValue= quarters*0.25;
		// Calculate how much money the user has and save it in a double variable 
double q=(nValue+dValue+qValue);
JOptionPane.showMessageDialog(null, q);
		// Tell the user how much money they have

	}
}
