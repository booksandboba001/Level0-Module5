package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
    public static void main(String[] args) {
        Robot rob = new Robot();
        rob.setSpeed(1000000000);
        drawSquare(rob);
        rob.penUp();
        drawTriangle(rob);
    }
    public static void drawSquare(Robot rob){
            rob.setX(100);
            rob.setY(550);
            rob.penDown();
        for (int i =0; i<4;i++){
            rob.move(500);
            rob.turn(90);
        }
    }
    public static void drawTriangle(Robot rob) {
        rob.setX(165);
        rob.setY(550);
        rob.penDown();
        for (int i=0; i<3;i++){
            rob.move(500);
            rob.turn(120);
        }
    }
}
