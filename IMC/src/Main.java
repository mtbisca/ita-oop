
public class Main {
	public static void main(String[] args) {
		Paciente p1 = new Paciente(60, 1.8);
		System.out.println(p1.diagnostico());
		System.out.println(p1.calcularIMC());
	}
}
