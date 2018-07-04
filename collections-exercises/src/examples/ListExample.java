package examples;

import java.util.ArrayList;

import javax.swing.plaf.FontUIResource;

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
		listaDeInteiros.add(5);
		listaDeInteiros.add(9);
		
		System.out.println("add: " + listaDeInteiros);
		
		// add(index) - adiciona um elemento na lista em posicao especifica
		//              ... adiciona que essa posicao seja (no maximo) uma a mais do maximo indice da lista
		listaDeInteiros.add(2, 14);
		
		System.out.println("Add(Index): " + listaDeInteiros);
		
        // size - mostra a quantidade de elementos na lista
		int quantidade = listaDeInteiros.size();
        System.out.println("size: " + quantidade);
	
        // clear - remove os elementos da lista
        listaDeInteiros.clear();
        quantidade = listaDeInteiros.size();
        System.out.println("clear: " + quantidade);
        
        // Enchendo a lista novamente
        listaDeInteiros.add(10);
        listaDeInteiros.add(11);
        listaDeInteiros.add(12);
        
        // contains(obj) - verifica se um elemento existe na coleção        
        boolean resultado = listaDeInteiros.contains(10);
        System.out.println("contains(obj): " + resultado);
        
         
        // remove(obj) - remove um determinado objeto da lista
        // Porque fazer o Integer.valueOf()? Porque o construtor é ligeiraente mais caro
        // Se não fizermos isso, o Eclipse chama o outro método "remove" (sobrecarga)
               
        boolean foiRemovido = listaDeInteiros.remove(Integer.valueOf(11));
        System.out.println("Remove(obj): "+ listaDeInteiros);
        System.out.println("removido? " + foiRemovido);
        
        Integer itemRemovido = listaDeInteiros.remove(0);
        System.out.println("remove(obj): " + listaDeInteiros);
        System.out.println("removido: " + itemRemovido);
        
        //set(index,obj) - coloca um elemento em um determinado indice
        // não pode ser um indice inexistente na lista !
                Integer elementoQueEstavaLaAntes = listaDeInteiros.set(0, 32);
        System.out.println("set(index,obj): " + listaDeInteiros);
        System.out.println("elementoQueEstavaLaAntes: " + elementoQueEstavaLaAntes);
        
         // Enchendo a lista novamente
        listaDeInteiros.add(10);
        listaDeInteiros.add(11);
        listaDeInteiros.add(12);	
        
        
        // get (index) - devolve o elemento que está na posição especifica
        Integer elementoQueEstanoIndice = listaDeInteiros.get(1);
        System.out.println("listaDeInteiros: " + listaDeInteiros);
        System.out.println("elementoQueEstaNoIndice: " + elementoQueEstanoIndice);
        
        int index = listaDeInteiros.indexOf(11);
        System.out.println("listaDeInteiros: " + listaDeInteiros);
        System.out.println("index: " + index);
        
        // Criando outra lista de números
        ArrayList<Integer> outraLista = new ArrayList<>();
        outraLista.add(100);
        outraLista.add(99);
        outraLista.add(98);
        
        // addAll(colletion) - adiciona uma coleção dentro de outra, desde que tenham parametrizações semelhantes
        listaDeInteiros.addAll(outraLista);
        
        System.out.println("listaDeInteiros com outraLista: " + listaDeInteiros);
        
        
        
        
        
        
        
        
        
        
	}

}
