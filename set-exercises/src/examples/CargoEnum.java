package examples;

public enum CargoEnum {
	GERENTE(1),
	ARQUITETO(2),
	DESENVOLVEDOR(3),
	ANALISTA_DE_TESTE(4);
	
	private Integer codigo;
	
	private CargoEnum(final Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return this.codigo;
	}
}
