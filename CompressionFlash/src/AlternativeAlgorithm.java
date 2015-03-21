
public class AlternativeAlgorithm {
     public static int alter(int k,int m){
    	 if (k <= m+1 && k > 1)
 		{
 			return (k-1);
 		}
 		else if(k>m+1)
 		{
 			return (alter(k - 1,m) + alter(k - m,m));
 		}
 		else
 			throw new IllegalArgumentException("k<=1");
     }
}
