package model;

public class Animal {

	protected class Estomago {
		public void digerir(final String coisa) {
			System.out.println("Digerindo " + coisa);
		}
	}

	public class Cerebro {
		public void pensarEm(final String coisa) {
			System.out.println("Pensando em " + coisa);
		}

	}

	public class Coracao {
		public void bater() {
			System.out.println("Palpitando");
		}
	}

}
