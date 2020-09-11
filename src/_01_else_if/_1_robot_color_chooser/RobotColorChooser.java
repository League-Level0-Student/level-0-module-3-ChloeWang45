
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		rob.setPenWidth(5);
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		for(int i = 0; i < 3; i++) {
		String color = JOptionPane.showInputDialog("Choose a color");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equals("red")) {
			rob.setPenColor(Color.RED);
		}
		else if(color.equals("orange")) {
			rob.setPenColor(Color.ORANGE);
		}
		else if(color.equals("yellow")) {
			rob.setPenColor(Color.YELLOW);
		}
		else if(color.equals("green")) {
			rob.setPenColor(Color.GREEN);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(Color.BLUE);
		}
		else if(color.equals("purple")) {
			rob.setPenColor(Color.MAGENTA);
		}
		else if(color.equals("black")) {
			rob.setPenColor(Color.BLACK);
		}
		else if(color.equals("white")) {
			rob.setPenColor(Color.WHITE);
		}
		else if(color.equals("pink")) {
			rob.setPenColor(Color.PINK);
		}
        //6. If the user doesn't enter anything, choose a random color
		else {
			rob.setRandomPenColor();
		}
		rob.move(80);
		rob.turn(90);
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
