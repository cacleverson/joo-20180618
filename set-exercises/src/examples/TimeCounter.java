package examples;

public class TimeCounter {

	private static long inicio = 0L;
	
	public static void iniciarCronometro() {
		System.out.println("Inicio da medicao!");
		inicio = System.currentTimeMillis();
	
	}
	public static void encerrarCronometro(final String mensagem) {
		long fim = System.currentTimeMillis();
		long resultado = fim -inicio;
		System.out.println("Fim da medição de: " + mensagem + " em " + resultado + "ms\n");
		inicio =0;
	}
	
	
	
}
