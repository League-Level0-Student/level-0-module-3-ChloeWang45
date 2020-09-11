package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Are you happy?");
		if(a.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what your are doing!");
		}
		else {
			String b = JOptionPane.showInputDialog("Do you want to be happy?");
			if(b.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Keep doing what your are doing.");
			}
			
		}
		
	}
}
