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
		// Servem para dar mais segurança às implementações
		// pois esse método não pode ser sobrescrito na classe implementadora
		// essa precisa chamar o método através da própria interface, como no
		// exemplo em Automovel
		static boolean abastecer() {
			return false;
			
		}
		
		default void test() {
			
		}
	}