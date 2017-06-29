
public class Paciente {
	private double peso;
	private double altura;
	
	public Paciente(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC() {
		return peso / (altura * altura);
	}

	public String diagnostico() {
		double IMC = calcularIMC();
		String returnString;
		if(IMC < 16) {
			returnString = "Baixo peso muito grave";
		} else if (IMC < 16.99) {
			returnString = "Baixo peso grave";
		} else if (IMC < 18.49) {
			returnString = "Baixo peso";
		} else if (IMC < 24.99) {
			returnString = "Peso normal";
		} else if (IMC < 29.99) {
			returnString = "Sobrepeso";
		} else if (IMC < 34.99) {
			returnString = "Obesidade grau I";
		} else if (IMC < 39.99) {
			returnString = "Obesidade grau II";			
		} else {
			returnString = "Obesidade grau III (obesidade mórbida)";
			
		}
		
		return returnString;
	}
}
