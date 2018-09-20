package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String name;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		name = JOptionPane.showInputDialog("what pet do you want to buy");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy pet", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "groom", "cuddle", "take a walk" }, null);
		System.out.println(task);
		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		for (int i = 0; i < 100; i++) { // user that he loves his pet and use break; to exit for loop.
			if (task == 2) {
				walk();
			} else if (task == 1) {
				cuddle();
			} else if (task == 0) {
				groom();
			}
			if (happinessLevel >= 25) {
				JOptionPane.showMessageDialog(null, "you love your pet.");
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void walk() {
		JOptionPane.showMessageDialog(null, name + " might wag his tail, when goes on a walk");
		happinessLevel += 20;
	}

	static void cuddle() {
		JOptionPane.showMessageDialog(null, name + " might purr when cuddled");
		happinessLevel += 10;
	}

	static void groom() {
		JOptionPane.showMessageDialog(null, name + " migt sleep after groomed");
		happinessLevel += 15;
	}
}