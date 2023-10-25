import java.util.*;
public class Shuffle
{
 
 public static void shuflle(int []arr){
     int n=arr.length;
     Random ran = new Random();
     for (int i = n - 1; i > 0; i--) {
            int j = ran.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
 }
	public static void main(String[] args) {
int[] arr = {1, 2, 3, 4, 5, 6, 7};	
	     shuflle(arr);
	 System.out.println("Shuffled Array: " + Arrays.toString(arr));
	}
}
