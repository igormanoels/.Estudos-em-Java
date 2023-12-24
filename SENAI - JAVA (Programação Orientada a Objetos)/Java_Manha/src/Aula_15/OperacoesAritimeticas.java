package Aula_15;

public class OperacoesAritimeticas {
	private double res;
	private String operador;
	
	public void setCalculos (double a, double b) {
		
		switch(operador) {
		  case "+":
			  res = a + b;
			  break;
			  
		  case "-":
			  res = a - b;
			  break;
			  
		  case "*":
			  res = a * b;
			  break;
			  
		  case "/":
			  res = a / b;
			  break;			  
		}
		
	}
	
	public double getCalculo() {
		return res;
	}
}
