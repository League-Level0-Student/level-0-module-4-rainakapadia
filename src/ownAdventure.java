import javax.swing.JOptionPane;

public class ownAdventure {
	static String plot;
	static String two;
public static void main(String[] args) {
	plot= "One upon a time there was a girl nanmed red. She was on her way to her grandmothers house. She was";
	two= "She was walking and met a big wolf. the wolf";
	JOptionPane.showMessageDialog(null, plot);
	String a=JOptionPane.showInputDialog("who was she with(alone./with the hunter.");
	if (a.equals("alone.")) {
	plot= plot+a;
	JOptionPane.showMessageDialog(null, plot+two);
	String answer=JOptionPane.showInputDialog("what did the big bad wolf do?(ate her./ helped red get to her grandmothers house.)");
	if(answer.equals("ate her.")) {
		plot=plot+answer;
		JOptionPane.showMessageDialog(null, plot);
		}else {
			plot=plot+answer;
		JOptionPane.showMessageDialog(null, plot+ "the end");
	}
	
	}else {
		plot=plot+a;
		JOptionPane.showMessageDialog(null, plot+"The hunter helped red and caught her some food to eat. They saw a man that needed help.they  ");
		String b=JOptionPane.showInputDialog("what did red and the hunter do?(could not help him./ helped him) ");
		if (b.equals("could not help him")) {
			plot=plot+b;
			JOptionPane.showMessageDialog(null, plot+". the end");
		}else {
			plot=plot+b;
			JOptionPane.showMessageDialog(null, plot+"the end");
			
		}
	}
	
}
}
