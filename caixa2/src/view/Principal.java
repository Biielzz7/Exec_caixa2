package view;
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Principal {
		 static double[] valorProd = new double [1000];
		 static String res = "S";
		 static int cont = 0;
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
	
			Caixaa caixa = new Caixaa();
			
			System.out.println("Digite o seu saldo atual: ");
			caixa.saldo = scan.nextDouble();
			while (res.equals("S")) {
					System.out.println("Digite o valor do produto: ");
				valorProd [cont] = scan.nextDouble();
				cont++;
				//res = JOptionPane.showInputDialog("Deseja continuar adicionando produtos (S sim / N não): ");
				System.out.print("Deseja continuar adicionando produtos (S sim / N não): ");
				  res = scan.next();
			}
			
			double novoSaldo;
			novoSaldo = caixa.venda(valorProd);
			
				if(novoSaldo < 0) {
					System.out.println("Saldo insuficiente, para realizar a compra do produto!");
					}else {
					     System.out.println("O novo saldo é: " + novoSaldo);
				   
			}

		}
}

	

