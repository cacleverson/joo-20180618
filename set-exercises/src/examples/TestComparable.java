package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
	public static void main(String[] args) {
		List<Funcionario> empresa = new ArrayList<>();
		Funcionario f2 = new Funcionario("Ciclano", 2000.0, CargoEnum.DESENVOLVEDOR);
		Funcionario f1 = new Funcionario("Fulano", 3000.0, CargoEnum.GERENTE);
		Funcionario f3 = new Funcionario("João", 2000.0, CargoEnum.DESENVOLVEDOR);
		Funcionario f4 = new Funcionario("Maria", 3000.0, CargoEnum.GERENTE);
		
		empresa.add(f2);
		empresa.add(f1);
		empresa.add(f3);
		empresa.add(f4);
		
		System.out.println("Antes:" + empresa);
		
		Collections.sort(empresa);
		
		System.out.println("Depois" + empresa);
		
		List<FuncionarioEficiente> empresaEficiente = new ArrayList<>();
		FuncionarioEficiente fe1 = new FuncionarioEficiente("João", 5000.0, CargoEnum.DESENVOLVEDOR);
		FuncionarioEficiente fe2 = new FuncionarioEficiente("Maria", 10000.0, CargoEnum.GERENTE);
		FuncionarioEficiente fe3 = new FuncionarioEficiente("Pedro", 8000.0, CargoEnum.ARQUITETO);
		FuncionarioEficiente fe4 = new FuncionarioEficiente("Bia", 4000.0, CargoEnum.ANALISTA_DE_TESTE);
		
		empresaEficiente.add(fe1);
		empresaEficiente.add(fe2);
		empresaEficiente.add(fe3);
		empresaEficiente.add(fe4);
		
		Collections.sort(empresaEficiente);
		
		System.out.println(empresaEficiente);
	}
}
