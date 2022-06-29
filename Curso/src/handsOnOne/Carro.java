package handsOnOne;

public class Carro {

	int potencia;
	int velocidade;
	String nome;
	
	void acelerar() {
		velocidade = velocidade + potencia;
	}
	void frear() {
		velocidade = velocidade/2;
	}
	
	int getVelocidade() {
		return velocidade;
	}

	
	public void imprimir() {
		System.out.println("O carrro " +nome+ " está na velocidade de "+ velocidade +"Km/h");

	}
	
	
}
