package prova3.questao02;

public abstract class Shape {
	protected Cor cor;
	
	public Shape(Cor cor) {
		super();
		this.cor = cor;
	}

	abstract void desenha();
}
