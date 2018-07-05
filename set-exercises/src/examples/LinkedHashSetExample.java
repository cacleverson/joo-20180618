package examples;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
			LinkedHashSet<String> nomes = new LinkedHashSet<>();
			System.out.println(nomes.add("Cleverson"));
			System.out.println(nomes.add("Enouque"));
			System.out.println(nomes.add("Simone"));
			System.out.println(nomes.add("Diego"));

			System.out.println(nomes);
		
			nomes.add("João");
			nomes.add("Maria");
			
			System.out.println(nomes);

	}

}
