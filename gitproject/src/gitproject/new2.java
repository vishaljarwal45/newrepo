package gitproject;
public class countrepeat{

public static void main(String[]args){

String str="vishaljarwaljarwalvishalnewString";

 HashMap<Character,Integer>mp=new HashMap<Character,Integer>();
      
for(int i=0;i<=str.length()-1;i++){

            char charkey=str.CharAt(i);
      if(mp.containskey(charkey)){
       mp.put(charkey,mp.get(charkey)+1);}
      else{
        mp.put(charkey,1);

}

}
      System.out.println(mp);
}}