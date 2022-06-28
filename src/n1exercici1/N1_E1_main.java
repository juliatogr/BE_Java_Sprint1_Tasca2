package n1exercici1;

public class N1_E1_main {
	public static void main(String[] args) throws VendaBuidaException {

		System.out.println("****Creem una venda sense cap producte****");
		Venda v = new Venda();
		System.out.println(v.toString());
		
		System.out.println();
		
		System.out.println("****Intentem calcular el preu total****");
		v.calcularTotal();
		System.out.println(v.toString());
		
		System.out.println();
		
		System.out.println("****Afegim un producte****");
		
		v.addProducte(new Producte("Oli", 3));
		System.out.println(v.toString());
		
		System.out.println();
		
		System.out.println("****Calculem el preu total****");

		v.calcularTotal();
		System.out.println(v.toString());
		
		System.out.println();
		System.out.println("****Forcem un IndexOutOfBoundsException****");
		
		v.calcularTotalIndexException();
		System.out.println(v.toString());
	}
}
