package Main;

import javax.swing.JOptionPane;

import MonedasConvertir.Funcion;
public class Principal {
	public static void main(String[] args) {
		Funcion monedas = new Funcion();
		String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
        if(ValidarNumero(input) == true) {
            double Minput = Double.parseDouble(input);
            monedas.ConvertirMonedas(Minput);

            int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
            if (JOptionPane.OK_OPTION == respuesta){
            	System.out.println("Selecciona opción Afirmativa");
            }else{
               	JOptionPane.showMessageDialog(null, "Programa terminado");                         
            }

           } else {
               JOptionPane.showMessageDialog(null, "Valor inválido");                
           }
	
	}
	public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
