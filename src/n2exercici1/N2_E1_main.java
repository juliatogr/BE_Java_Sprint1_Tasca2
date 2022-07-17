package n2exercici1;

public class N2_E1_main {
	public static void main(String[] args) throws Exception {
		
		System.out.println("Has indroduït: " +
				Entrada.llegirByte("Introdueix un número enter entre -128 i 127"));
		
		System.out.println("Has indroduït: " +
				Entrada.llegirInt("Introdueix un número enter"));
		
		System.out.println("Has indroduït: " +
				Entrada.llegirFloat("Introdueix un número enter o decimal"));
		
		System.out.println("Has indroduït: " +
				Entrada.llegirDouble("Introdueix un número enter o decimal"));
		
		System.out.println("Has indroduït: " +
				Entrada.llegirChar("Introdueix un caràcter"));
		
		System.out.println("Has indroduït: " +
				Entrada.llegirString("Introdueix una frase"));
		
		System.out.println("Has indroduït: " +
				Entrada.llegirSiNo("Si ('s') o no ('n')? "));

	}
}
