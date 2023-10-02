package conversor_moneda;

import javax.swing.JOptionPane;

public class Programa {

	ConversionMoneda moneda = new ConversionMoneda();
	ConversionMonedaADolar dolar = new ConversionMonedaADolar();
	
	public void ConversionMoneda(double I_input) {
		String opciones = (JOptionPane.showInputDialog(null, 
				"¿Que moneda desea convertir su dinero? ", "Monedas",
	JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Dolar a Dolar","De Dolar a Euro", 
			"De Dolar a Libras Esterlinas", "De Dolar a Yen Japones", "De Dolar a Won sur-coreano",
			"De Euros a Dolar", "De Libras Esterlinas a Dolar","De Yen Japones a Dolar", 
			"De Won sur-coreano a Dolar" }, "Seleccion")).toString();
		switch(opciones) {
		case "De Dolar a Dolar":
			moneda.ConversionDolarADolar(I_input);
			break;
		case "De Dolar a Euro":
			moneda.ConversionDolarAEuro(I_input);
			break;
		case "De Dolar a Libras Esterlinas":
			moneda.ConversionDolarALibras(I_input);
			break;
		case "De Dolar a Yen Japones":
			moneda.ConversionDolarAYenJapones(I_input);
			break;
		case "De Dolar a Won sur-coreano":
			moneda.ConversionDolarAWon(I_input);
			break;
		case "De Euros a Dolar":
			dolar.ConversionEurosADolar(I_input);
			break;
		case "De Libras Esterlinas a Dolar":
			dolar.ConversionLibrasADolar(I_input);
			break;
		case "De Yen Japones a Dolar":
			dolar.ConversionYenADolar(I_input);
			break;
		case "De Won sur-coreano":
			dolar.ConversionWonADolar(I_input);
			break;
		}
	}
}
