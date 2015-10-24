import java.util.Scanner;

public class bubbleSortdesc{

  public static void main(String args[]){

     int n,a,b,swap;
     Scanner in = new Scanner(System.in);

     System.out.println("Enter number to sort");
     n = in.nextInt();
      int array[] = new int[n];
      System.out.println("You enter " + n + "integers");

      for(a =0;a< n;a++)
        array[a] = in.nextInt();

      for(a =0;a<(n - 1); a++){
        for(b =0;b<n-a-1;b++){
            if(array[b] < array[b+1]){
                swap =array[b];
                array[b] =array[b+1];
                array[b+1] = swap;
            }
        }
      }

      System.out.println("Sorted list of numbers");

       for(a=0;a<n;a++)
        System.out.println(array[a]);

  }

}
