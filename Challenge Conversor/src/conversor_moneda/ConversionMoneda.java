package conversor_moneda;

import javax.swing.JOptionPane;

public class ConversionMoneda {

	//private double precioEuro = 0.94;
	//private double precioLibra = 0.82;
	//private double precioYenJapones = 149.38;
	//private double precioWon = 1352.93;
	
	public void ConversionDolarADolar(double cantidad) {
		double conversionDolar = cantidad;
		JOptionPane.showMessageDialog(null, "La conversion es: " +conversionDolar+ " dolares");
	}
	
	public void ConversionDolarAEuro(double cantidad) {
		double conversionEuro = cantidad/0.95;
		conversionEuro = (double)Math.round(conversionEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "La converion es: "+conversionEuro+ " euros");
	}
	
	public void ConversionDolarALibras(double cantidad) {
		double conversionLibras = cantidad/0.82;
		conversionLibras = (double)Math.round(conversionLibras *100d)/100;
		JOptionPane.showMessageDialog(null, "La conversion es: "+conversionLibras+" libras esterelinas");
	}
	
	public void ConversionDolarAYenJapones(double cantidad) {
		double conversionYen = cantidad/149.38;
		conversionYen = (double)Math.round(conversionYen *100d)/100;
		JOptionPane.showMessageDialog(null, "La conversion es: "+conversionYen+"Yenes japoneses");
	}
	
	public void ConversionDolarAWon(double cantidad) {
		double conversionWon = cantidad/1352.93;
		conversionWon = (double)Math.round(conversionWon *100d)/100;
		JOptionPane.showMessageDialog(null, "La conversion es: "+conversionWon+"Wones sul-coreanos");
	}
	
}
