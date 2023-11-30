package view;

public class Caixaa {
	
	double saldo;
	double valorProd;
	double venda(double ... valorProd) {
			double novoSaldo = saldo;
				for (int i = 0; i < valorProd.length; i++) {
					novoSaldo -= valorProd[i];
					}
				    return(novoSaldo);
	  		}

}

