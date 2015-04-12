public class Step2AlterTest {
	public static int[] step(int l, int r, int T[])
	{

		int A[] = new int[l];

		int i = 0;
		int k = 0;
		while (i < r)
		{
			int j = 0;
			
			if(T[i]==0 && i==0)
			{
				i = i + 1;
			}
			else if (T[i] == 0 && T[i-1]==1)
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

	public static int[] E2(int m, int T[], int A[]) {

		int i = 0;
		int k = 0;
		int j = 0;
		while (i < T.length) {
			if (i==(T.length-1)){
				break;
			}
			if (T[i] == 0) {
				i++;
			} else if (T[i] == 1) {
				i++;
				if (A[k] > m - 1) {
					while (j+m-1 < A[k] - m + 1) {
						j=j+m-1;
						T[i+j] = 1;	

					}
					j = 0;
				}
				i = i + A[k];
				k++;
			} else {
				throw new IllegalArgumentException("invalid bit "+i+" -> "+T[i]);
			}
		}
		return T;

	}

}
