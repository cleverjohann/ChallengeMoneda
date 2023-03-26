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
		switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.PesosDolares(Minput);
        	break;
        case "De Pesos a Euro":
        	monedas.PesosEuros(Minput);
        	break;
        case "De Pesos a Libras":
        	monedas.PesosLibras(Minput);
        	break;
        case "De Pesos a Yen":
        	monedas.PesosYen(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.PesosWon(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesos.DolaresPesos(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.EurosPesos(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.LibroPesos(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.YenPesos(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.WonPesos(Minput);
            break;
        }
		
	}
}
