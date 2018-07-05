package examples;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// Mapa representacao (companhia, valor das acoes) como para chave/valor
		HashMap<String, Double> acoesEmpresas = new HashMap<>();
		acoesEmpresas.put("Aplle", new Double(91.98));
		acoesEmpresas.put("Sony", new Double(16.76));
		acoesEmpresas.put("Dell", new Double(30.67));
		acoesEmpresas.put("HP", new Double(33.91));
		acoesEmpresas.put("IBM", new Double(181.71));

		// Mostra o conteudo do HashMap
		System.out.println("Conteudo do Hashmap: " + acoesEmpresas);

		// Imprime a chave e seu valor correspondente no mapa
		System.out.println("\nChaves e seus Valores no mapa");
		for (String chave : acoesEmpresas.keySet()) {
			System.out.println(chave + ":\t " + acoesEmpresas.get(chave));
		}
		// Recuperando valor para uma chave
		System.out.println("\nO preço da ação da HPE é: " + acoesEmpresas.get("HPI"));

		// Exibe a quantidade de elementos que mapa possui
		System.out.println("\nO tamanho do mapa é: " + acoesEmpresas.size());

		// Mostra se o mapa esta vazio ou não
		System.out.println("\nO mapa está vazio? " + acoesEmpresas.isEmpty());

		System.out.println("\nO mapa possui a chave Dell? " + acoesEmpresas.containsKey("Dell"));

		System.out.println("\nAlguma empresa possui acao de valor 99,99? " + acoesEmpresas.containsValue(99.99));

        System.out.println("\nRemover Dell: " + acoesEmpresas.remove("Dell"));        
	    System.out.println("\nEstado do mapa: " + acoesEmpresas);
	
	    acoesEmpresas.clear();
	    System.out.println("\nConteudo do mapa apos \"clear\":" + acoesEmpresas);
	
	}

}
