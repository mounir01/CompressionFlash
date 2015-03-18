import java.util.Scanner;

public class FibonacciCode
{
	public static void main(String args[])
	{
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Veuillez saisir Le nombre a coder :");
		int nbrACoder = saisieUtilisateur.nextInt();
		saisieUtilisateur.close();
		int nbrBits=nbrBits(nbrACoder);
		System.out.println("nombre de bits necessaire pour la representation binaire est: "+nbrBits);
		int nbrBitsFib=nbrBitsFib(nbrBits);
		System.out.println("nombre de bits necessaire pour la representation fibo est: "+nbrBitsFib);
		//System.out.println(fib(nbrBits));
		int tableauDeBits[] = new int[nbrBitsFib];
		System.out.println("La representation en fibonacci est: ");
		while (nbrBitsFib > 0)
		{
			
			if (nbrACoder - fib(nbrBitsFib) >= 0)
			{

				tableauDeBits[nbrBitsFib-1] = 1;
				//System.out.println ("À l'emplacement " + (nbrBits-1) +" du tableau nous avons = " + tableauDeBits[nbrBits-1]);
				System.out.print(tableauDeBits[nbrBitsFib-1]);
				nbrACoder = nbrACoder - fib(nbrBitsFib);
			}
			else
			{
				tableauDeBits[nbrBitsFib-1] = 0;
				//System.out.println ("À l'emplacement " + (nbrBits-1) +" du tableau nous avons = " + tableauDeBits[nbrBits-1]);
				System.out.print(tableauDeBits[nbrBitsFib-1]);

			}
			
			nbrBitsFib = nbrBitsFib - 1;
				//System.out.println (tableauDeBits);
				

				
				
		}
		System.out.println();

		
		
	}

	public static int fib(int a)
	{
		if (a < 2)
		{
			return (1);
		}
		else
		{
			return (fib(a - 2) + fib(a - 1));
		}
	}
	
	public static int nbrBits(int a){
		int n=1;
		while(a>0){
			a=a>>1;
			n++;
		}
		return n;
	}
	
	public static int nbrBitsFib(int n){
		return (int) (1.44*n-0.67);
	}

}
