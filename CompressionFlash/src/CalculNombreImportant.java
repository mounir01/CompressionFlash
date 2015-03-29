public class CalculNombreImportant
{
	public static int nbrBits(int a)
	{
		int n = 1;
		while (a > 0)
		{
			a = a >> 1;
			n++;
		}
		return n;
	}

	public static int nbrBitsFib(int n)
	{
		return (int) (1.44 * n - 0.67);
	}

	public static int nbrBitsAlt(int nbrACoder1, int m)
	{
		int r = 0, k = 2;
		while (AlternativeAlgorithm.alter(k, m) <= nbrACoder1)
		{
			r++;
			k++;
		}
		return r;
	}

	public static int[] representation2Nbr(int b[])
	{
		System.out.println("la representation binaire du 2eme nbr est:");
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]);
		}
		System.out.println();
		return b;
	}

}
