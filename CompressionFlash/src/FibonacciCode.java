import java.util.Scanner;

public class FibonacciCode {
	public static void main(String args[]) {
		Scanner saisieUtilisateur = new Scanner(System.in);
	/*-----------------------------Step 1-----------------------------------------------*/	
		System.out.println("1ere Etape: ");
	  /*--------------------Saisie du 1er Nombre------------------------------------*/	
		System.out.println("Veuillez saisir Le 1er nombre a coder :");
		int nbrACoder1 = saisieUtilisateur.nextInt();
		int nbrBits = nbrBits(nbrACoder1);
	  /*-------------La representation binaire du 1er Nombre------------------------*/
		System.out
				.println("nombre de bits necessaire pour la representation binaire est: "
						+ nbrBits);
		int nbrBitsFib = nbrBitsFib(nbrBits);
		System.out
				.println("nombre de bits necessaire pour la representation fibo est: "
						+ nbrBitsFib);
		int tableauStep1[] = new int[nbrBitsFib];
	  /*---------------La representation fibo du 1er Nombre-------------------------*/
		System.out.println("La representation en fibonacci est: ");
		int rang=1;// pour ecrire dans le tableau dans le bon sens
		while (nbrBitsFib > 0) {
			if (nbrACoder1 - fib(nbrBitsFib) >= 0) {
				tableauStep1[rang - 1] = 1;
				System.out.print(tableauStep1[rang - 1]);
				nbrACoder1 = nbrACoder1 - fib(nbrBitsFib);
			} else {
				tableauStep1[rang - 1] = 0;
				System.out.print(tableauStep1[rang - 1]);
			}

			nbrBitsFib--;
			rang++;
		}
		System.out.println();
		
	/*-----------------------------Step 2-----------------------------------------------*/	

		int tableauStep2[] = Step2.step(tableauStep1);
		System.out.println("le resultat de la 2eme Etape: ");
		for (int i =0 ; i <tableauStep2.length; i++) {

			System.out.print(tableauStep2[i]);

		}
		System.out.println();
	    /*--------------------Saisie du 2eme Nombre----------------------------------*/	
		System.out.println("Veuillez saisir Le 2eme nombre a coder :");
		int nbrACode2 = saisieUtilisateur.nextInt();
		int nbrBits2 = nbrBits(nbrACode2);
		System.out
				.println("nombre de bits necessaire pour la representation binaire est: "
						+ nbrBits2);
		saisieUtilisateur.close();
		
		int tableauDeBits2[] = new int[nbrBits2];
		for (int i = nbrBits2 - 1; i >= 0; i--) {
			tableauDeBits2[nbrBits2 - i - 1] = (nbrACode2 >>> i) & 1;
		}
		/*-------------La representation binaire du 2eme Nombre-----------------------*/
		System.out.println("la representation binaire du 2eme nbr est:");
		for (int i = 0; i < tableauDeBits2.length; i++) {
			System.out.print(tableauDeBits2[i]);
		}
		System.out.println();
	/*-----------------------------Step 3-----------------------------------------------*/	
		
		int tableauStep3[] = Step3(tableauStep2, tableauDeBits2);

		System.out.println("le resultat de la 3eme Etape est:");
		for (int i = 0; i < tableauStep3.length; i++) {
			System.out.print(tableauStep3[i]);
		}
		System.out.println();

	}

	public static int fib(int a) {
		if (a < 2) {
			return (1);
		} else {
			return (fib(a - 2) + fib(a - 1));
		}
	}

	public static int nbrBits(int a) {
		int n = 1;
		while (a > 0) {
			a = a >> 1;
			n++;
		}
		return n;
	}

	public static int nbrBitsFib(int n) {
		return (int) (1.44 * n - 0.67);
	}

	public static int[] Step3(int[] T1, int[] T2) {
		int i = 0, j = 0;
		int resultat[]=new int[T1.length];
		while (i < T1.length && j < T2.length) {
			if (T1[i] == 1) {
				resultat[i]=1;
				i++;
			} else if (T1[i] == 0) {
				if (i != 0 && T1[i - 1] == 1) {
					resultat[i] = T2[j];
					j++;
					i++;
				} else{
					resultat[i]=T1[i];
					i++;	
				}
				
			} else {
				throw new IllegalArgumentException("Invalid bit!");
			}

		}
		return resultat;
	}
}
