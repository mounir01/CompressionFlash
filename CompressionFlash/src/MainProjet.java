import java.util.Scanner;

public class MainProjet
{
	public static void main(String args[])
	{

		Scanner saisieUtilisateur = new Scanner(System.in);
		/*-----------------------------Step 1-----------------------------------------------*/
		System.out.println("1ere Etape: ");

		System.out.println("Veuillez saisir Le 1er nombre a coder :");
		int nbrACoder1 = saisieUtilisateur.nextInt();

		/*-----------------------------Step 2-----------------------------------------------*/

		int tableauStep2[] = Step2.step(Step1.step1(nbrACoder1));

		System.out.println("Veuillez saisir Le 2eme nombre a coder :");
		int nbrACode2 = saisieUtilisateur.nextInt();
		int nbrBits2 = CalculNombreImportant.nbrBits(nbrACode2);
		System.out.println("nombre de bits necessaire pour la representation binaire est: " + nbrBits2);
		saisieUtilisateur.close();

		int tableauDeBits2[] = new int[nbrBits2];
		for (int i = nbrBits2 - 1; i >= 0; i--)
		{
			tableauDeBits2[nbrBits2 - i - 1] = (nbrACode2 >>> i) & 1;
		}

		CalculNombreImportant.representation2Nbr(tableauDeBits2);

		/*-----------------------------Step 3-----------------------------------------------*/

		Step3.step3(tableauStep2, tableauDeBits2);

	}

}
