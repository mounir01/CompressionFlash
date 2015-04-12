import java.util.Scanner;


public class VirtualMain {

	public static void main(String[] args) {
		/*for (int m = 2; m < 7; m++) {
			System.out.println("m = "+m);
			for (int k = 2; k < 19; k++) {
				System.out.print(" pour k = "+k+" A = "+AlternativeAlgorithm.alter(k, m)+"\t");
			}
			System.out.println();
		}*/
		//System.out.println("r = "+CalculNombreImportant.nbrBitsAlt(5132664, 3));
		//-------------------------------------------------
		/*Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("1ere Etape: ");
		System.out.println("Veuillez saisir Le nombre m :");
		int m = saisieUtilisateur.nextInt();
		System.out.println("Veuillez saisir Le 1er nombre a coder :");
		int nbrACoder1 = saisieUtilisateur.nextInt();
		saisieUtilisateur.close();
		int tableauStep1[] = Step1Alter.step1Alter(nbrACoder1, m);*/
		//------------------Booster-------------------
		/*int tableauStep2[]={1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0};
		int data1[]={0,0,1,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
		int tableauStep3[]=Step3Alter.step3(tableauStep2, data1, 3);
		System.out.println();
		for (int i = 0; i < tableauStep3.length; i++) {
			System.out.print(tableauStep3[i]);
		}
		System.out.println();
		int data2[]={1,0,1,1,0,1,1,1,0,1,0,0,1,0,1,0,1,1,1,1,0,1,1,1};
		int booster[]=Step3Alter.step3(tableauStep3, data2, 3);
		System.out.println();
		for (int i = 0; i < booster.length; i++) {
			System.out.print(booster[i]);
		}
		System.out.println();*/
        //----------------------------------------------
		int data[]={0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1};
		int A[]={5,4,6,2};
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+", ");
		}
		int Step2[]=Step2AlterTest.E2(3, data, A);
		System.out.println();
		for (int i = 0; i < Step2.length; i++) {
			System.out.print(Step2[i]+", ");
		}
	}

}
