package process1.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import process1.interfaces.Condicao;
import process1.models.Pessoa;

// https://www.youtube.com/watch?v=YC82QKigdsY
// solution: https://www.youtube.com/watch?v=YC82QKigdsY

public class Processo1 {
	public static void main(String[] args) {
		List<Pessoa> pessoas = Arrays.asList(new Pessoa("Charles", "Babbage", 80), new Pessoa("Claude", "Shannon", 85),
				new Pessoa("Alan", "Turing", 42), new Pessoa("John", "von Neumann", 54),
				new Pessoa("William", "Shockley", 79), new Pessoa("Douglas", "Engelbart", 88),
				new Pessoa("Robert", "Noyce", 63), new Pessoa("Steve", "Wozniak", 67),
				new Pessoa("Grace", "Hopper", 86), new Pessoa("Vint", "Cerf", 74), new Pessoa("Steve", "Jobs", 56),
				new Pessoa("Linus", "Torvalds", 48), new Pessoa("Bill", "Gates", 62),
				new Pessoa("Ada", "Lovelace", 36));

		// Passo 1: Vamos ordenar a lista por sobrenome
		Collections.sort(pessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa p1, Pessoa p2) {
				return p1.getSobreNome().compareTo(p2.getSobreNome());
			}
		});

		// Passo 2: Imprimir todos os elementos da lista
		System.out.println("\nImprimindo todas as pessoas:");
		imprimirTodas(pessoas);

		// Passo 3: Imprimir todas as pessoas cujo sobrenome começa com C
		// 1
		System.out.println("Imprimindo todas as pessoas cujo sobrenome começa com C:");
		imprimirSobrenomeComecandoComC(pessoas);

		// 2
		System.out.println("\nImprimindo todas as pessoas condicionalmente:");
		imprimirSobrenomeCondicionalmente(pessoas, new Condicao() {
			@Override
			public boolean testar(final Pessoa p) {
				return p.getSobreNome().startsWith("C");
			}

		});
	}

	// 1
	public static void imprimirSobrenomeComecandoComC(final List<Pessoa> pessoas) {
		for (Pessoa p : pessoas) {
			if (p.getSobreNome().startsWith("C")) {
				System.out.println(p);
			}
		}
	}

	// 2
	public static void imprimirSobrenomeCondicionalmente(final List<Pessoa> pessoas, final Condicao condicao) {
		for (Pessoa p : pessoas) {
			if (condicao.testar(p)) {
				System.out.println(p);
			}
		}
	}

	public static void imprimirTodas(final List<Pessoa> pessoas) {
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
	}

}

//
