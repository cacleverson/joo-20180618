package main;

public class GameOfPI {

	public static void main(String[] args) {

		int x = 0;
		String p = "PI";

		for (int j = 0; j < 101; j++) {
			int resto = j % 4;

			if (resto == 0) {
				System.out.println(p);

			} else {

				System.out.println(j);

			}

		}
	}

}
