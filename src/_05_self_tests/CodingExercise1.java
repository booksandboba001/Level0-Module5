package _05_self_tests;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class CodingExercise1 {
    public static void main(String[] args) {
        Robot rob = new Robot();
        rob.setSpeed(1000);
        String col = JOptionPane.showInputDialog("What color would you like the robot to draw in?");
        if (col.equalsIgnoreCase("red")){
            rob.setPenColor(255,0,0);
        }
        if (col.equalsIgnoreCase("blue")){
            rob.setPenColor(0,0,255);
        }
        if (col.equalsIgnoreCase("green")){
            rob.setPenColor(0,255,0);
        }
        rob.setPenWidth(10);
        rob.penDown();
        for (int i = 4; i>0;i--){
            rob.move(50);
            rob.turn(90);
        }
    }
}
