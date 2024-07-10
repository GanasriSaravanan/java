// the size of the array can be received from the user 
import java.util.Scanner;
class middlevalueinarray{
    public static void main (String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    int size=scan.nextInt();
    int[]array= new int[size];
    for(int i=0;i<=size-1;i=i+1)
    {
     array[i]=scan.nextInt();  
    }
    // the middle value of the array
    System.out.println("The middle element of the array is "+array[size/2]);
    }
}