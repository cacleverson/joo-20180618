package examples;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		HashMap<String, Double> acoesEmpresasHash = new HashMap<>();
		acoesEmpresasHash.put("Aplle", new Double(91.98));
		acoesEmpresasHash.put("Sony", new Double(16.76));
		acoesEmpresasHash.put("Dell", new Double(30.67));
		acoesEmpresasHash.put("HP", new Double(33.91));
		acoesEmpresasHash.put("IBM", new Double(181.71));
	
	System.out.println(acoesEmpresasHash);
	
	HashMap<String, Double> acoesEmpresasLinked = new LinkedHashMap<>();
	acoesEmpresasLinked.put("Aplle", new Double(91.98));
	acoesEmpresasLinked.put("Sony", new Double(16.76));
	acoesEmpresasLinked.put("Dell", new Double(30.67));
	acoesEmpresasLinked.put("HP", new Double(33.91));
	acoesEmpresasLinked.put("IBM", new Double(181.71));
	
	System.out.println(acoesEmpresasLinked);
	
	
	}

}
