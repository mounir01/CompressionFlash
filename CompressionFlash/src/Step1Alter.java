
public class Step1Alter {
	public static int[] step1Alter(int nbrACoder1,int m)
	{
	int nbrBits = CalculNombreImportant.nbrBits(nbrACoder1);
	/*-------------La representation binaire du 1er Nombre------------------------*/
	System.out.println("nombre de bits necessaire pour la representation binaire est: " + nbrBits);
	int nbrBitsAlt = CalculNombreImportant.nbrBitsAlt(nbrACoder1, m);
	System.out.println("nombre de bits necessaire pour la representation Alt est: " + nbrBitsAlt);
	int tableauStep1[] = new int[nbrBitsAlt];
	/*---------------La representation fibo du 1er Nombre-------------------------*/
	System.out.println("La representation en alternative est: ");
	nbrBitsAlt++;//we have r Ak but k>=2
	int rang = 1;// pour ecrire dans le tableau dans le bon sens
	while (nbrBitsAlt > 1)
	{
		if (nbrACoder1 - AlternativeAlgorithm.alter(nbrBitsAlt,m) >= 0)
		{
			tableauStep1[rang - 1] = 1;
			System.out.print(tableauStep1[rang - 1]);
			nbrACoder1 = nbrACoder1 - AlternativeAlgorithm.alter(nbrBitsAlt,m);
		}
		else
		{
			tableauStep1[rang - 1] = 0;
			System.out.print(tableauStep1[rang - 1]);
		}

		nbrBitsAlt--;
		rang++;
	}
	System.out.println();
	return tableauStep1;

	}
}
