package Programe;

public class Countwords {
 public static void main(String[] args) {
	 String s=" how are you doing?";
	 char c[]=s.toCharArray();
	  int count=0;
	  for(int i=0;i<=s.length()-1;i++){
  if(c[i]==' '&& c[i+1]!=' '){
	  count++;
  }
	  }
	    System.out.println(count);
}
}
