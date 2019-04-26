public class ParImpar {
	
	private String strNumber;
	
	public ParImpar(String number) {
		this.strNumber = number;
	}

	public String getStrNumber() {
		return strNumber;
	}

	public void setStrNumber(String strNumber) {
		this.strNumber = strNumber;
	}

	public String comprobarNumero() {
		 
		if(strNumber.indexOf(".") == -1)
			return comprobacionNumeroEntero();
		else
			return  comprobacionNumeroDecimal();
				
	}
	
	private String comprobacionNumeroEntero() {
		String respuesta="";
		try {
			int number = Integer.parseInt(strNumber);
			if(number%2 == 0)
				respuesta = "El numero es PAR";
			else
				respuesta = "El numero es IMPAR";
			
		} catch (NumberFormatException e) {
			respuesta = "Error con el numero ingresado, verifica tu numero, evita las comas(,)";
		}
				
		return respuesta;
	}
	
	private String comprobacionNumeroDecimal() {
		String respuesta = "Los decimales no son divisibles por dos\n";
		String[] number = strNumber.replace('.', ',').split(",");
		try {
			
			if(Integer.parseInt(number[0])%2 == 0) {
				respuesta += "La parte entera "+number[0]+" es PAR\n";
			}else {
				respuesta += "La parte entera "+number[0]+" es IMPAR\n";
			}
			if(Integer.parseInt(number[1])%2 == 0) {
				respuesta += "La parte decimal "+number[1]+" es PAR";
			}else {
				respuesta += "La parte decimal "+number[1]+" es IMPAR";
			}

		} catch (NumberFormatException e) {
			respuesta = "Error con el numero ingresado";
		}		
		
		return respuesta;
	}
}
