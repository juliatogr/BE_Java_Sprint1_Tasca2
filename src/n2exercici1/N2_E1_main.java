package n2exercici1;

public class N2_E1_main {
	public static void main(String[] args) throws Exception {
		
		System.out.println("Has indrodu�t: " +
				Entrada.llegirByte("Introdueix un n�mero enter entre -128 i 127"));
		
		System.out.println("Has indrodu�t: " +
				Entrada.llegirInt("Introdueix un n�mero enter"));
		
		System.out.println("Has indrodu�t: " +
				Entrada.llegirFloat("Introdueix un n�mero enter o decimal"));
		
		System.out.println("Has indrodu�t: " +
				Entrada.llegirDouble("Introdueix un n�mero enter o decimal"));
		
		System.out.println("Has indrodu�t: " +
				Entrada.llegirChar("Introdueix un car�cter"));
		
		System.out.println("Has indrodu�t: " +
				Entrada.llegirString("Introdueix una frase"));
		
		System.out.println("Has indrodu�t: " +
				Entrada.llegirSiNo("Si ('s') o no ('n')? "));

	}
}
