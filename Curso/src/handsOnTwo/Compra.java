package handsOnTwo;

public class Compra {
	int valorTotal;
	int numeroParcelas;
	
	// A vista
	public Compra (int valor){
		valorTotal = valor;
		numeroParcelas =1 ;
	}	
	
	//Parcelado
	public Compra (int qtdParcelas, int valorParcela){
		numeroParcelas = qtdParcelas;
		valorTotal = valorParcela * qtdParcelas;
		
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	
	public int getValorParcela() {
		return valorTotal/numeroParcelas;
	}
}
