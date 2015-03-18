public class Step2
{

	public static void step(int T[])
	{
		int a = T.length;
		if (T[a] == 0)
		{
			if (T[a - 1] == 1)
			{
				T[a] = 0;
				a = a - 2;
			}
			else if (T[a - 1] == 0 && T[a - 2] == 0)
			{
				T[a - 1] = 1;
				a = a - 2;
			}
			else if (T[a - 1] == 0 && T[a - 2] == 1)
			{
				a = a - 3;
			}

		}
		else
		{
			a = a - 1;
		}
		
		System.out.print(T[a]);
		

	}
}
