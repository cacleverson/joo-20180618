package java8;

	public interface Dirigivel {
		void dirigir();
//		// 1)
		void trocarModoDeDirecao();
		
//		// 2)
		default void desligar() {
			System.out.println("Desligando manualmente");
		}
		
		// 3)
		// Servem para dar mais seguran�a �s implementa��es
		// pois esse m�todo n�o pode ser sobrescrito na classe implementadora
		// essa precisa chamar o m�todo atrav�s da pr�pria interface, como no
		// exemplo em Automovel
		static boolean abastecer() {
			return false;
			
		}
		
		default void test() {
			
		}
	}