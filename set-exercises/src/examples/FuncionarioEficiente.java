package examples;

public class FuncionarioEficiente implements Comparable<FuncionarioEficiente> {
	private String nome;
	private Double salario;
	private CargoEnum cargo;

	public FuncionarioEficiente(String nome, Double salario, CargoEnum cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	// -1 ,0 , 1 - servem mais como indicadores de ordem crescente ou decrescente na lista
	@Override
	public int compareTo(FuncionarioEficiente f) {
		return f.getCargo().getCodigo().compareTo(this.getCargo().getCodigo()); 
	}

	public String getNome() {
		return nome;
	}

	public CargoEnum getCargo() {
		return cargo;
	}

	@Override
	public String toString() {
		return "FuncionarioEficiente [\n\tnome=" + nome + ", \n\tsalario=" + salario + ", \n\tcargo=" + cargo + "]\n";
	}

}
