package prova3.questao02;

public class Square extends Shape {

	public Square(Cor cor) {
		super(cor);
	}

	@Override
	void desenha() {
		System.out.println("Quadrado " + cor.cor());
	}

}
