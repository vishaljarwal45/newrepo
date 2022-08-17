package logicalPrograms;

public class pritnallprime{


public static void main (String[]args){


for(int no=0;no<=100;no++){
boolean a=false;

for(int i=2;i<no;i++){
  if(no%i==0){
    a=true;
}}
if(a){
System.out.println(no);
}
}
}} 