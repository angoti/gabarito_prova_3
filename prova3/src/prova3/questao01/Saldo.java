package prova3.questao01;

public class Saldo implements Transacao {
	private float valor;

	public float getValor() {
		return valor;
	}

	public void movimento(float valorMovimento) {
		valor += valorMovimento;
	}
}


