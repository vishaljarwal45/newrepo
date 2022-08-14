package StarPattern;

public class eg11 {

	public static void main(String[] args) {
		int star=1;

		for(int i=1;i<=9;i++){
		for(int k=1;k<=star;k++){
		System.out.print("*");
		}
		System.out.println();
		if(i<5){
		star++;
		}else{
		star--;
		}
		}}}