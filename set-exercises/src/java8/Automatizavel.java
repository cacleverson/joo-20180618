package java8;

public interface Automatizavel {
	void dirigirAutomaticamente();
	
	// 1)
	void trocarModoDeDirecao();
	
	// 2)
	default void desligar() {
		System.out.println("Desligando automaticamente");
	}
	
	// 3) Não é possível esconder métodos de object, pois mesmo a interface não sendo uma 
	// classe, ela precisa de uma pra ser utilizada, e essa sim, será descendente de OBj
//	static boolean equals(Object o) {
		
//	}
	// 3) Podem existir dois métodos estáticos iguais em interfaces diferentes
	// e ainda assim serem implementadas pela mesma classe sem erros,
	// pois esses métodos não são herdados
	static boolean abastecer() {
		return false;
		
	}
	
}
