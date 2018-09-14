package extra;

import javax.swing.JOptionPane;

public class testScores {
	public static void main(String[] args) {
		
	String a=JOptionPane.showInputDialog("input test score");
	double b= Double.parseDouble(a);
	if(b>85) {
		JOptionPane.showMessageDialog(null, "Wow! You must have studied hard for the test");
	}
	
	
	

}}
