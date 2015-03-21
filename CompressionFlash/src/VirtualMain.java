import java.util.Scanner;


public class VirtualMain {

	public static void main(String[] args) {
		/*for (int m = 2; m < 7; m++) {
			System.out.println("m = "+m);
			for (int k = 2; k < 19; k++) {
				System.out.print(" pour k = "+k+" A = "+AlternativeAlgorithm.alter(k, m)+"\t");
			}
			System.out.println();
		}*/
		//System.out.println("r = "+CalculNombreImportant.nbrBitsAlt(5132664, 3));
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("1ere Etape: ");
		System.out.println("Veuillez saisir Le nombre m :");
		int m = saisieUtilisateur.nextInt();
		System.out.println("Veuillez saisir Le 1er nombre a coder :");
		int nbrACoder1 = saisieUtilisateur.nextInt();
		saisieUtilisateur.close();
		int tableauStep1[] = Step1Alter.step1Alter(nbrACoder1, m);
	}

}
