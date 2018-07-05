package examples;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> nomes = new TreeSet<>();
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
