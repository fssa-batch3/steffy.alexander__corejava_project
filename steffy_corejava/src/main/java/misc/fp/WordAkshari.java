package misc.fp;

import java.util.Scanner;
import  java.util.ArrayList;
public class WordAkshari {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int check=0;
       System.out.print("Enter");
       String s= sc.next();
       ArrayList<String> ar= new ArrayList<String>();
       ArrayList<String> ar1= new ArrayList<String>();
       ar.add(s);
       ar1.add(s);
       int count=0;
       while(check==0){
            System.out.print("Enter");
          s= sc.next();
          if(s.charAt(0)=='#'){
              check=1;
          }
          if(ar.get(count).charAt(ar.get(count).length()-1)==s.charAt(0)){
             ar1.add(s);
          }
          ar.add(s);
          count++;
       }
       for(String s1:ar1){
           System.out.println(s1);
       }
    }
}
