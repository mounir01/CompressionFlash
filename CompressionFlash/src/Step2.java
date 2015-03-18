public class Step2
{

	public static int[] step(int T[])
	{
		int l = T.length;
		int a = 0;
		while (a < l-2)
		{

			if (T[a] == 0)
			{
				if (T[a + 1] == 1)
				{
					// T[a] = 0;
					// T[a + 1] = 1;
					a = a + 2;
				}
				else
				{
					if (T[a + 2] == 0)

					{
						// T[a] = 0;
						T[a + 1] = 1;
						a = a + 2;
					}
					else
					{

						a = a + 3;

					}
				}

			}
			else
			{
				// T[a] = 1;
				a = a + 1;
			}

		}

		return T;

	}
}
