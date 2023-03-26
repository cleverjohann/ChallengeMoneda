package MonedasConvertir;

import javax.swing.JOptionPane;

public class Funcion {

	ConvertirMoneda monedas = new ConvertirMoneda();
	ConvertirMonedaPesos pesos = new ConvertirMonedaPesos();
	
	public void ConvertirMonedas (double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
		
	}
}
