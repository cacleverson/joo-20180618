package main;

public class multitriangler
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 0; j < 4; j++) {
			String letraA = "a";
			String letraB = "a";
			for (int i = 0; i < 3; i++) {
				System.out.println(letraA);
				letraA = letraA + letraB;
			}
		}
	}
}
