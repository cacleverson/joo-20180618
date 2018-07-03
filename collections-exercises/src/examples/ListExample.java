package examples;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		// Voce pode criar uma lista assim:
		ArrayList listaSemParametrizacao = new ArrayList<>();
		listaSemParametrizacao.add(12);
		listaSemParametrizacao.add("Java");
		listaSemParametrizacao.add(Boolean.FALSE);
		
		System.out.println(listaSemParametrizacao);
        // Ela vai funcionar como se estivesse recebendo Object 
		
		// Dessa forma, nao:
		ArrayList<Integer> listaDeInteiros = new ArrayList<>();
		
		// add - adiciona um elemento no final da lista
		listaDeInteiros.add(1);
		listaDeInteiros.add(2);
		
		System.out.println("add: " + listaDeInteiros);
		
		// add(index) - adiciona um elemento na lista em posicao especifica
		//              ... adiciona que essa posicao seja (no maximo) uma a mais do maximo indice da lista
		listaDeInteiros.add(2, 3);
		
		System.out.println("Add(Index): " + listaDeInteiros);
		
	}

}
