package java8;

public interface Automatizavel {
	void dirigirAutomaticamente();
	
	// 1)
	void trocarModoDeDirecao();
	
	// 2)
	default void desligar() {
		System.out.println("Desligando automaticamente");
	}
	
	// 3) N�o � poss�vel esconder m�todos de object, pois mesmo a interface n�o sendo uma 
	// classe, ela precisa de uma pra ser utilizada, e essa sim, ser� descendente de OBj
//	static boolean equals(Object o) {
		
//	}
	// 3) Podem existir dois m�todos est�ticos iguais em interfaces diferentes
	// e ainda assim serem implementadas pela mesma classe sem erros,
	// pois esses m�todos n�o s�o herdados
	static boolean abastecer() {
		return false;
		
	}
	
}
