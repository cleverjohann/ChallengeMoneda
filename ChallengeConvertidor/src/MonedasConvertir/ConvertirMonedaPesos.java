package MonedasConvertir;

import javax.swing.JOptionPane;

public class ConvertirMonedaPesos {

	public void DolaresPesos(double valor) {
		double monedaDolar = valor * 3739.00;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaDolar+" Pesos colombianos");
	}
	
	public void EurosPesos (double valor) {
		double monedaEuro = valor * 4050.48;
		monedaEuro = (double) Math.round(monedaEuro*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaEuro+" Pesos colombianos");
	}
	public void LibroPesos(double valor) {
		double monedaLibra = valor * 4890.52;
		monedaLibra = (double) Math.round(monedaLibra*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaLibra+" Pesos colombianos");
	}
	public void YenPesos(double valor) {
		double monedaYen = valor * 29.68;
		monedaYen = (double) Math.round(monedaYen*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaYen+" Pesos colombianos");
	}
	public void WonPesos(double valor) {
		double monedaWon = valor * 3.04;
		monedaWon = (double) Math.round(monedaWon*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaWon+" Pesos colombianos");
	}
}
