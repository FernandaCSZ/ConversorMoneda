package conversor_moneda;

import javax.swing.JOptionPane;

public class ConversionMonedaADolar {

	public void ConversionEurosADolar(double cantidad) {
		double precioEuro = cantidad * 1.06;
		precioEuro = (double)Math.round(precioEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+precioEuro+ " dolares");
	}
	
	public void ConversionLibrasADolar(double cantidad) {
		double precioLibra = cantidad * 1.22;
		precioLibra = (double)Math.round(precioLibra *100d)/100;
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+precioLibra+ " dolares");
	}
	
	public void ConversionYenADolar(double cantidad) {
		double precioYen = cantidad * 0.0067;
		precioYen = (double)Math.round(precioYen *100d)/100;
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+precioYen+ " dolares");
	}
	
	public void ConversionWonADolar(double cantidad) {
		double precioWon = cantidad * 0.00074;
		precioWon = (double)Math.round(precioWon *100d)/100;
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+precioWon+ " dolares");
	}
}
