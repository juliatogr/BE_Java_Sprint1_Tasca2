package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

	public static Scanner sc = new Scanner(System.in);
	
	public static byte llegirByte(String missatge) throws InputMismatchException {
		System.out.println(missatge);
		
		byte answer = -1;
		
		boolean isValid = false;
		
		while (!isValid) {
			try {
				answer = sc.nextByte();
				sc.nextLine();
				isValid = true;
			} catch (InputMismatchException ime) {
				System.out.println("Error de format");
				sc.nextLine();
			}
		}

		
		
		return answer;
	}

	public static int llegirInt(String missatge) throws InputMismatchException {
		System.out.println(missatge);
		
		int answer = -1;
		
		boolean isValid = false;
		
		while (!isValid) {
			try {
				answer = sc.nextInt();
				sc.nextLine();
				isValid = true;
			} catch (InputMismatchException ime) {
				System.out.println("Error de format");
				sc.nextLine();
			}
		}
		
		return answer;
	}

	public static float llegirFloat(String missatge) throws InputMismatchException {
		System.out.println(missatge);
		
		float answer = -1;
		
		boolean isValid = false;
		
		while (!isValid) {
			try {
				answer = sc.nextFloat();
				sc.nextLine();				
				isValid = true;
			} catch (InputMismatchException ime) {
				System.out.println("Error de format");
				sc.nextLine();
			}
		}
		
		return answer;
	}

	public static double llegirDouble(String missatge) throws InputMismatchException {
		System.out.println(missatge);
		
		double answer = -1;
		
		boolean isValid = false;
		
		while (!isValid) {
			try {
				answer = sc.nextDouble();
				sc.nextLine();
				isValid = true;
			} catch (InputMismatchException ime) {
				System.out.println("Error de format");
				sc.nextLine();
			}
		}
		
		return answer;
	}
	
	public static char llegirChar(String missatge) throws Exception {
		System.out.println(missatge);
		
		char answer = ' ';
		
		boolean isValid = false;
		
		while (!isValid) {
			try {
				answer = sc.nextLine().charAt(0);
				isValid = true;
			} catch (Exception e) {
				System.out.println("Error de format");
				sc.nextLine();
			}
		}
		
		return answer;
	}

	public static String llegirString(String missatge) throws Exception {
		System.out.println(missatge);
		
		String answer = "";
		
		boolean isValid = false;
		
		while (!isValid) {
			try {
				answer = sc.nextLine();
				isValid = true;
			} catch (Exception e) {
				System.out.println("Error de format");
				sc.nextLine();
			}
		}
		
		return answer;
	}

	public static boolean llegirSiNo(String missatge) throws Exception {
		// Si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari introdueix “n”, retorna “false”.

		boolean isYes = false;
		
		boolean isYesOrNo = false;
		char answer = ' ';
		
		while (!isYesOrNo) {
			
			answer = llegirChar(missatge);
			isYesOrNo = answer == 's' || answer == 'n';
			
			if (!isYesOrNo) {
				System.out.println("El caràcter introduït no és 's' o 'n'.");
			}
		}
		
		if (isYesOrNo) isYes = answer == 's';
		
		return isYes;
	}
}
