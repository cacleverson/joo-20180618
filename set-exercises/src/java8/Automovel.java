package java8;

import java8.Automatizavel;
import java8.Dirigivel;

public class Automovel implements Dirigivel, Automatizavel {
	//Sources: 
	// https://www.youtube.com/watch?v=4e_RsZWdiSc
	@Override
	public void dirigirAutomaticamente() {
		
	}

	@Override
	public void dirigir() {
		// 3) 
		Dirigivel.abastecer();
		Automatizavel.abastecer();
	
	}
	// 1) Mostrar que a ambiguidade � resolvida aqui na classe
	// OBS: Se houver heran�a, o m�todo herdado tem preced�ncia sobre os default da Interface
	// OBS2: Se quiser implementar os m�todos de mesmo nome das duas interfaces, � preciso fazer atrav�s de classes internas ou externas
	// OBS3: Se tentar sobrescrever um m�todo de Objct, por exemplo, na sua interface, voc� levar� um erro
	@Override
	public void trocarModoDeDirecao() {
		// TODO Auto-generated method stub
		
	}

	// 2) Dessa forma abaixo podemos resolver a ambiguidade dos m�todos default
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		Dirigivel.super.desligar();
	}
	
	public void desligarAutomatico() {
		Automatizavel.super.desligar();
	}
	
}