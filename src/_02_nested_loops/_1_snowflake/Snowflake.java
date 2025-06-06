package _02_nested_loops._1_snowflake;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class Snowflake {
	
	public static void main(String[] args) {

		// #1. Make a new Robot
		Robot rob = new Robot();
		rob.setX(300);
		rob.setY(300);
		rob.penDown();
		rob.setSpeed(100);

		// #5. use a for loop below to do everything ( #6, #7, #8, #9, #12, #13, #14 ) 6 times (use i as the counter)

		for (int i=6; i>0; i--){
			rob.setPenColor(0,0,0);
			rob.move(50);
			rob.turn(60);
			if(i % 2 ==0){
				rob.setPenColor(135,206,235);
			}
			else if(i % 2 !=0){
				rob.setPenColor(255,160,122);
			}
			for(int j = 6; j>0; j--){
				rob.turn(-60);
				rob.move(50);
			}
		rob.setPenColor(0,0,0);
			
		}	// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
		
			// #6. Set the pen color to black

			
			// #7. move the robot by 50

			
			// #8. turn the robot to the right by 60
			
			
			// #12. set the pen color to blue for even numbers of i

			
			// #13. set the pen color to red for all odd numbers of i
			
			
			// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
			
			
					// #10. turn the robot to the left by 60
		
					
					// #11. move the robot by 50 (play the start button)
					
				
			
			// #14. set the pen color to black
				
		
	}
}
