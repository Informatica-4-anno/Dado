import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		// Creo i due dadi
		Dado d1, d2;
		Scanner in=new Scanner(System.in);
		System.out.println("inserisci il numero di facce del dado 1");
		if (in.hasNextInt()) {
			d1=new Dado(in.nextInt());
		} else d1=new Dado();
		
		System.out.println("inserisci il numero di facce del dado 2");
		if (in.hasNextInt()) {
			d2=new Dado(in.nextInt());
		} else d2=new Dado();
		
		// Lancio dadi
		System.out.println("Primo dado: "+d1.lancio());
		System.out.println("Secondo dado: "+d2.lancio());
		
		System.out.println("La somma è "+(d1.ultimoLancio()+d2.ultimoLancio()));
	}
}
