
public class Step1
{

	public static int[] step1(int nbrACoder1)
	{
		int nbrBits = CalculNombreImportant.nbrBits(nbrACoder1);
		/*-------------La representation binaire du 1er Nombre------------------------*/
		System.out.println("nombre de bits necessaire pour la representation binaire est: " + nbrBits);
		int nbrBitsFib = CalculNombreImportant.nbrBitsFib(nbrBits);
		System.out.println("nombre de bits necessaire pour la representation fibo est: " + nbrBitsFib);
		int tableauStep1[] = new int[nbrBitsFib];
		/*---------------La representation fibo du 1er Nombre-------------------------*/
		System.out.println("La representation en fibonacci est: ");
		int rang = 1;// pour ecrire dans le tableau dans le bon sens
		while (nbrBitsFib > 0)
		{
			if (nbrACoder1 - FibonacciAlgorithm.fib(nbrBitsFib) >= 0)
			{
				tableauStep1[rang - 1] = 1;
				System.out.print(tableauStep1[rang - 1]);
				nbrACoder1 = nbrACoder1 - FibonacciAlgorithm.fib(nbrBitsFib);
			}
			else
			{
				tableauStep1[rang - 1] = 0;
				System.out.print(tableauStep1[rang - 1]);
			}

			nbrBitsFib--;
			rang++;
		}
		System.out.println();
		return tableauStep1;
	}

}
