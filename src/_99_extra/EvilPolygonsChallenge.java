package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		rob.setY(600);
		rob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "Choose your color", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue"}, 0);
		if (colorChoice==0){
			rob.setPenColor(255,0,0);
		}
		if (colorChoice==1){
			rob.setPenColor(0,128,0);
		}
		if (colorChoice==2){
			rob.setPenColor(0,0,255);
		}
		String poly = JOptionPane.showInputDialog("How many polygons do you want");
		
		for (int gon = Integer.parseInt(poly); gon>0; gon--){
			polygon(rob, gon);
		}
		rob.move(30);
	}
	public static void polygon(Robot rob, int gon) {
		rob.penDown();
		for (int i =0; i<4;i++){
			rob.move(100);
			rob.turn(90);
		}
		rob.penUp();
		rob.move(110);
		
		
	}
}


		
		//2. Set the speed to 100

		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		
		//4. Ask the use how many polygons they want to be drawn.
		
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap
		
		//7. Challenge: add more colors to the Option Dialog.