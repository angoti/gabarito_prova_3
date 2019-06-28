package prova3.questao01;

public class Sistema {
	public static void main(String[] args) {
		ReplicaSaldo replicaSaldo = new ReplicaSaldo();
		AssinanteUm assinanteUm = new AssinanteUm();
		replicaSaldo.meCadastre(assinanteUm);
		replicaSaldo.movimento(100);
	}
}
