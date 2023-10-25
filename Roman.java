import java.util.*;
public class Roman
{
 public static int CheckRoman(String s) {

        int res=0,num=0,i;
         for(i = s.length()-1;i>=0;i--){
           switch(s.charAt(i)){
              case 'I':
               num=1;
               break;
               case 'V':
               num=5;
               break;
               case 'X':
               num=10;
               break;
               case 'L':
               num=50;
               break;
              case 'C':
               num=100;
               break;
               case 'D':
               num=500;
               break;
               case 'M':
               num=1000;
               break;
           }
         if (4 * num < res) res -= num;
            else res += num;

         }
         return res;

    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    String str="";
	    str=sc.nextLine();
	  int res= CheckRoman(str);
	  System.out.println(res);
	}
}
