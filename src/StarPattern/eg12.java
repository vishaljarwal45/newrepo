package StarPattern;

public class eg12 {

	public static void main(String[] args) {

		int star1=1;
		int space1=5;
		int star2=1;
		int space2=4;

		for(int i=1;i<=9;i++){
		for(int j=1;j<=star1;j++){
		System.out.print("*");
		}
		for(int k=1;k<=space1;k++){
		System.out.print(" ");
		}
		for(int l=1;l<=space2;l++){
		System.out.print(" ");
		}
		for(int m=1;m<=star2;m++){
		System.out.print("*");
		}
		System.out.println();
		if(i<5){
		star1++;
		space1--;
		space2--;
		star2++;
		}
		else{
		star1--;
		space1++;
		space2++;
		star2--;
		}
		}



		
		
	}

}
