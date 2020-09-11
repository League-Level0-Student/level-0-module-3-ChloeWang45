package _02_loop_variables._1_years_alive;

public class YearsAlive {

	public static void main(String[] args) {
		
		int num = 0;
		for(int i = 0; i < 13; i++) {
			int age = num + 1;
			System.out.println(age);
			num = age;
		}
		
	}
}
