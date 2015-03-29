public class mainvirtuelle
{

	public static void main(String[] args)
	{
		int T[] = { 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1 };

		int B[] = Step2Alter.step(5, 24, T);
		for (int i = 0; i < 5; i++)
		{
			System.out.print(B[i]);
			System.out.print(",");
		}
		System.out.println();
		for (int i = 0; i < T.length; i++)
		{
			System.out.print(T[i]);
			System.out.print(",");
		}
		System.out.println();
		int C[] = Step2Alter.E2(3, T, B);
		for (int i = 0; i < T.length; i++)
		{
			System.out.print(C[i]);
			System.out.print(",");
		}

	}

}
