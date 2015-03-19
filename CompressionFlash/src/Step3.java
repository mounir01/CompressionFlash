public class Step3
{
	public static int[] step3(int[] T1, int[] T2)
	{
		int i = 0, j = 0;
		int resultat[] = new int[T1.length];
		while (i < T1.length && j < T2.length)
		{
			if (T1[i] == 1)
			{
				resultat[i] = 1;
				i++;
			}
			else if (T1[i] == 0)
			{
				if (i != 0 && T1[i - 1] == 1)
				{
					resultat[i] = T2[j];
					j++;
					i++;
				}
				else
				{
					resultat[i] = T1[i];
					i++;
				}

			}
			else
			{
				throw new IllegalArgumentException("Invalid bit!");
			}

		}
		System.out.println("le resultat de la 3eme Etape est:");
		for (int k = 0; k < resultat.length; k++)
		{
			System.out.print(resultat[k]);
		}
		System.out.println();
		return resultat;
	}

}
