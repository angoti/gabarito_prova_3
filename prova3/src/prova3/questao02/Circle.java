package prova3.questao02;

public class Circle extends Shape {

	public Circle(Cor cor) {
		super(cor);
	}

	@Override
	void desenha() {
		System.out.println("Círculo " + cor.cor());
	}

}
