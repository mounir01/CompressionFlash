public class Step2Alter
{
	public static int[] step(int l, int r, int T[])
	{

		int A[] = new int[l];

		int i = 0;
		int k = 0;
		while (i < r)
		{
			int j = 0;

			if (T[i] == 0)
			{
				while (T[i] == 0)
				{
					j = j + 1;
					i = i + 1;
				}

				A[k] = j;
				k = k + 1;

			}
			else
			{
				i = i + 1;
			}

		}

		return A;

	}

	public static int[] E2(int m, int T[], int A[])
	{
		int i = 0;
		int k = 0;
		int j = 0;
		while (i <= T.length)
		{
			
			if (T[i] == 0 && A[k] >= m - 1)
			{

				while (j <= m * ((A[k] - m + 1) / m))
				{
					T[j] = 1;
					j = j + m;

				}
				i = i + A[k];

			}
			else if (T[i] == 0 && A[k] <= m - 1)
			{
				i = i + A[k];
				k = k + 1;
			}

			else if (T[i] == 1 && A[k] >= (m - 1))
			{

				i = i + 1;
				while (j <= m * ((A[k] - m + 1) / m))
				{
					T[i + m - 1] = 1;
					i = i + m;
					j = j + m;

				}

			}
			else
			{
				i = i + A[k];
			}
			i = i + A[k];

		}
		k = k+1;

		return T;

	}

}
