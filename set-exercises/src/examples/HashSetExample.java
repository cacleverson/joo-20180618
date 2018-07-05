package examples;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> nomes = new HashSet<>();
		System.out.println(nomes.add("Cleverson"));
		System.out.println(nomes.add("Enouque"));
		System.out.println(nomes.add("Simone"));
		System.out.println(nomes.add("Diego"));
		
		System.out.println(nomes);
	
		System.out.println(nomes.add("Cleverson"));
	
		nomes.add("João");
		nomes.add("Maria");
		
		System.out.println(nomes);
		
		
	}

}
