package prova3.questao01;

import java.util.ArrayList;
import java.util.List;

public class ReplicaSaldo extends Saldo {

	private List<Transacao> assinantes;

	public ReplicaSaldo() {
		super();
		assinantes = new ArrayList<Transacao>();
	}

	void meCadastre(Transacao assinante) {
		assinantes.add(assinante);
	}

	@Override
	public void movimento(float valorMovimento) {
		super.movimento(valorMovimento);
		for (Transacao assinante : assinantes) {
			assinante.movimento(valorMovimento);
		}
	}

}
