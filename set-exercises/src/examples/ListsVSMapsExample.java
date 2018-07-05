package examples;

import java.util.ArrayList;
import java.util.HashMap;

public class ListsVSMapsExample {
	public static void main(String[] args) {
		
		// tem 6 zeros aqui
		System.out.println("================= Adicionando � lista ================= ");
		ArrayList<String> lista = new ArrayList<>();
		TimeCounter.iniciarCronometro();
		for (int i = 0; i < 1000000; i++) {
			lista.add("Item" + i);
		}
		TimeCounter.encerrarCronometro("Adi��o � lista");

		System.out.println("================= Adicionando ao mapa ================= ");
		HashMap<String, Integer> mapa = new HashMap<>();
		TimeCounter.iniciarCronometro();
		for (int i = 0; i < 1000000; i++) {
			mapa.put("Item" + i, i);
		}
		TimeCounter.encerrarCronometro("Adi��o ao mapa");

		// tem 6 numeros 9 aqui
		String itemProcurado = "Item999999";

		System.out.println("================= Procurando na lista ================= ");
		TimeCounter.iniciarCronometro();
		for (String item : lista) {
			if (item.equals(itemProcurado)) {
				TimeCounter.encerrarCronometro("Procurar em Lista " + itemProcurado);
				break;
			}
		}
		System.out.println("================= Procurando no mapa ================= ");
		TimeCounter.iniciarCronometro();
		mapa.get(itemProcurado);
		TimeCounter.encerrarCronometro("Procurar no mapa " + itemProcurado);

		// Capacidade inicial
	
		System.out.println("================= Adicionando � lista c/ capacidade inicial ================= ");
		ArrayList<String> listaFixa = new ArrayList<>(1200000);
		TimeCounter.iniciarCronometro();
		for (int i = 0; i < 1000000; i++) {
			lista.add("Item" + i);
		}
		TimeCounter.encerrarCronometro("Adi��o � listaFixa");

		System.out.println("================= Adicionando ao mapa c/ capacidade inicial ================= ");
		HashMap<String, Integer> mapaFixa = new HashMap<>(1200000);
		TimeCounter.iniciarCronometro();
		for (int i = 0; i < 1000000; i++) {
			mapa.put("Item" + i, i);
		}
		TimeCounter.encerrarCronometro("Adi��o ao mapaFixa");

		
	}
}
