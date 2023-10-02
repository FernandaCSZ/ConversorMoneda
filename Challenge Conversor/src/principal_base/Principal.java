package principal_base;

import javax.swing.JOptionPane;

import conversor_moneda.Programa;

public class Principal {

	public static void main(String[] args) {
		
		Programa conversion = new Programa();
		
		String input = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");
		if(NumeroValido(input) == true) {
			double uInput = Double.parseDouble(input);
			conversion.ConversionMoneda(uInput);
		}
	}
	public static boolean NumeroValido(String input) {
 	    try {
 	        double x = Double.parseDouble(input);
 	        if(x >= 0 || x < 0);
 	            return true;
 	        } catch (NumberFormatException e) {
 	            return false;
 	        }
 	}

}
