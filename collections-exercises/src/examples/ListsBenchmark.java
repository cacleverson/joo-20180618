package examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsBenchmark {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		// 1) Adiciona no Final
		long tempo = ListsBenchmark.adicionaNoFinal(arrayList);
		System.out.println("ArrayList (final): " + tempo + " ms");

		tempo = ListsBenchmark.adicionaNoFinal(linkedList);
		System.out.println("LinkedList (final): " + tempo + " ms");

		// 2) Adiciona no Começo
		
		
		tempo = ListsBenchmark.adicionaNoComeco(arrayList);
		System.out.println("ArrayList (comeco): " + tempo + " ms");

		tempo = ListsBenchmark.adicionaNoComeco(linkedList);
		System.out.println("LinkedList (comeco): " + tempo + " ms");

		// 3) GET

		tempo = ListsBenchmark.get(arrayList);
		System.out.println("ArrayList (get): " + tempo + " ms");

		tempo = ListsBenchmark.get(linkedList);
		System.out.println("LinkedList (get): " + tempo + " ms");

		
	}

	public static long adicionaNoFinal(List<Integer> lista) {
		long inicio = System.currentTimeMillis();
		int tamanho = 100000;

		for (int i = 0; i < tamanho; i++) {
			lista.add(i);
		}

		long fim = System.currentTimeMillis();

		return fim - inicio;

	}

	public static long adicionaNoComeco(final List<Integer> lista) {
		long inicio = System.currentTimeMillis();
		int tamanho = 100000;

		for (int i = 0; i < tamanho; i++) {
			lista.add(0, i);
		}

		long fim = System.currentTimeMillis();

		return fim - inicio;

		
		
	}

	public static long get(final List<Integer> lista) {
		int tamanho = 100000;

		for (int i = 0; i < tamanho; i++) {
			lista.add(i);
		}

		long inicio = System.currentTimeMillis();

		for (int i = 0; i < tamanho; i++) {
			lista.get(i);

		}
		long fim = System.currentTimeMillis();

		return fim - inicio;

	}

}