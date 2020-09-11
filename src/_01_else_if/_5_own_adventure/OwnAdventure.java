package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Are you stressed?");
		if(a.equals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing what your are doing!");
		}
		else {
			String b = JOptionPane.showInputDialog("Do you want to be carefree?");
			if(b.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Find time for yourself for self-care and relaxation.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Keep doing what your are doing!");
			}
		}
		
	}
}
