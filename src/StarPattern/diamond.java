package StarPattern;

public class diamond {

	public static void main(String[] args) {

			int star=10;
			int space=0;

			for(int i=1 ;i<=10;i++){
			for(int j=0;j<=space;j++ ){
			System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
			System.out.print("*");
			}
			System.out.println();
			if(i<5){
			star=star-2;
			space++;}
			else{
			star=star+2;
			space--;
			}
			}

			}
}






			





















			
	


