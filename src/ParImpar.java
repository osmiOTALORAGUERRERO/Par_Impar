import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ParImpar {
	
	private String strNumber;
	private NumberFormat df = new DecimalFormat("#0.000");
	
	
	public ParImpar(String number) {
		this.strNumber = number;
	}

	public String getNumber() {
		return strNumber;
	}

	public void setNumber(String number) {
		this.strNumber = number;
	}


	public boolean comprobarNumero() {
		 
		if(strNumber.indexOf(".") == -1)
			return comprobacionNumeroEntero();
		else
			return comprobacionNumeroDecimal();
				
	}
	
	private String comprobacionNumeroEntero() {
		String respuesta;
		try {
			int number = Integer.parseInt(strNumber);
			if(number%2 == 0) {
				respuesta = "";
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Error con el numero ingresado");
		}
		
		
		return false;
	}
	
	private boolean comprobacionNumeroDecimal() {
		try {
			
			
		} catch (NumberFormatException e) {
			System.out.println("Error con el numero ingresado");
		}
		
		
		return false;
	}
}
