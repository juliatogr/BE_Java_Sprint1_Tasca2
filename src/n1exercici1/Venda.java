package n1exercici1;

import java.util.ArrayList;

public class Venda {
	private ArrayList<Producte> productes;
	private int preuTotal;
	
	public int getPreuTotal() {
		return this.preuTotal;
	}
	
	public void addProducte(Producte p) {
		this.productes.add(p);
	}
	
	public Venda() {
		this.productes = new ArrayList<Producte>();
		this.preuTotal = 0;
	}


	public void calcularTotal() throws VendaBuidaException {
		
		try {
			
			if (this.productes.size() == 0) {
				throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
			}
			
			int preuTemp = 0;
			int numProd = this.productes.size();
			for (int i=0; i<numProd;i++) {
				preuTemp += this.productes.get(i).getPreu();
			}
			preuTotal = preuTemp;
			
		} catch (VendaBuidaException vbe) {
			System.out.println(vbe.getMessage());
		}
	}
	
	public void calcularTotalIndexException() throws VendaBuidaException {
		
		try {
			
			if (this.productes.size() == 0) {
				throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
			}
			
			int preuTemp = 0;
			int numProd = this.productes.size();
			for (int i=0; i<=numProd;i++) {
				preuTemp += this.productes.get(i).getPreu();
			}
			preuTotal = preuTemp;
			
		} catch (VendaBuidaException vbe) {
			System.out.println(vbe.getMessage());
		}
		 catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public String toString() {
		return "Venda amb " + this.productes.size() + " té un preu total de " + preuTotal + "€.";
	}
	
	
}
