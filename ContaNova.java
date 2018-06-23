package interitance;

import java.math.BigDecimal;

public class ContaNova {

	protected int codigo;
	protected String correntista;
	protected BigDecimal saldo;
	protected String banco;

	protected BigDecimal obterSaldo() {
		return this.saldo;

	}

}
