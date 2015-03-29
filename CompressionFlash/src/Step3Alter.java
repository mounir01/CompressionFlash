
public class Step3Alter {

	public static int[] step3(int[] T1, int[] T2,int m) {
		int i = 0, j = 0;
		int resultat[] = new int[T1.length];
		while (i < T1.length && j < T2.length)
		{
			if(T1[i]==0){
				resultat[i] = 0;
				i++;
			}
			else if(T1[i]==1){
				resultat[i]=1;
             int k=i+1;
				while(k<m+i){
					resultat[k]=T2[j];
					k++;
					j++;
				}
				i=k;
			}
			else{
				throw new IllegalArgumentException("Invalid bit!");
			}
		}
		return resultat;
	}

}
