import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ParImpar {
	
	private String strNumber;	

	public String getNumber() {
		return strNumber;
	}

	public void setNumber(String number) {
		this.strNumber = number;
	}


	public String comprobarNumero() {
		 
		if(strNumber.indexOf(".") == -1)
			return comprobacionNumeroEntero();
		else
			return comprobacionNumeroDecimal();
				
	}
	
	private String comprobacionNumeroEntero() {
		String respuesta = "";
		try {
			int number = Integer.parseInt(strNumber);
			if(number%2 == 0) {
				respuesta = "El numero es par";
			}else {
				respuesta = "El numero es impar";
			}
			
		} catch (NumberFormatException e) {
			respuesta = "Error con el numero ingresado";
		}
			
		return respuesta;
	}
	
	private String comprobacionNumeroDecimal() {
		String respuesta = "Un numero decimal no se puede definir par o impar\n";
		String[] numArray = strNumber.replace('.',',').split(",");
		try {
			
			if(Integer.parseInt(numArray[0])%2 == 0) {
				respuesta += "La parte entera "+numArray[0]+" es Par\n";
			}else
			{
				respuesta += "La parte entera "+numArray[0]+" es Inpar\n";
			}
			
			if(Integer.parseInt(numArray[1])%2 == 0) {
				respuesta += "La parte decimal "+numArray[1]+" es Par";
			}else
			{
				respuesta += "La parte decimal "+numArray[1]+" es Inpar\n";
			}
			
		} catch (NumberFormatException e) {
			respuesta = "Error con el numero ingresado";
		}
		
		
		return respuesta;
	}
}
