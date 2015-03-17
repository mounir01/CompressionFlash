import java.util.Scanner;

public class FibonacciCode
{
	public static void main(String args[])
	{
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Veuillez saisir Le nombre de bits :");
		int nbrBits = saisieUtilisateur.nextInt();
		System.out.println("Veuillez saisir Le nombre a coder :");
		int nbrACoder = saisieUtilisateur.nextInt();
		//System.out.println(fib(nbrBits));
		int tableauDeBits[] = new int[nbrBits];
		while (nbrBits > 0)
		{
			
			if (nbrACoder - fib(nbrBits) >= 0)
			{

				tableauDeBits[nbrBits-1] = 1;
				System.out.println ("À l'emplacement " + (nbrBits-1) +" du tableau nous avons = " + tableauDeBits[nbrBits-1]);
				nbrACoder = nbrACoder - fib(nbrBits);
			}
			else
			{
				tableauDeBits[nbrBits-1] = 0;
				System.out.println ("À l'emplacement " + (nbrBits-1) +" du tableau nous avons = " + tableauDeBits[nbrBits-1]);
				
			}
			
			
			nbrBits = nbrBits - 1;
				//System.out.println (tableauDeBits);
				

				
				
		}
		
		
		
	}

	public static int fib(int a)
	{
		if (a < 2)
		{
			return (a);
		}
		else
		{
			return (fib(a - 2) + fib(a - 1));
		}
	}

}
