package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel =0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want?");

		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for (int i =0; i<7;i++){
				int task = JOptionPane.showOptionDialog(null, "What do you want to do?", "Action", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "cuddle", "food", "water", "take a walk", "groom", "clean up poop" }, null);
				if (task==0){
					cuddle(pet);
				}
				if (task==1){
					food(pet);
				}
				if (task==2){
					water(pet);
				}
				if (task==3){
					walk(pet);
				}
				if (task==4){
					groom(pet);
				}
				if (task==5){
					clean(pet);
				}
				if(happinessLevel==35){
					JOptionPane.showMessageDialog(null, "You must love your "+pet+"! She's very happy!");
				}
			}
			
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void cuddle (String pet) {
		JOptionPane.showMessageDialog(null,"You cuddled your "+pet);
		happinessLevel+=5;
	}
	public static void food (String pet) {
		JOptionPane.showMessageDialog(null,"You fed your "+pet);
		happinessLevel+=5;
	}
	public static void water (String pet) {
		JOptionPane.showMessageDialog(null,"You gave water to your "+pet);
		happinessLevel+=5;
	}
	public static void walk (String pet) {
		JOptionPane.showMessageDialog(null,"You walked your "+pet);
		happinessLevel+=5;
	}
	public static void groom (String pet) {
		JOptionPane.showMessageDialog(null,"You groomed your "+pet);
		happinessLevel+=5;
	}
	public static void clean (String pet) {
		JOptionPane.showMessageDialog(null,"You cleaned up your "+pet+"'s poop.");
		happinessLevel+=5;
	}
}