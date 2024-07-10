//to print the multiples of a range 
//the range of i can be changed according to the required multiples
import java.lang.System;
import java.util.Scanner;
class codechallenge3{
    public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a no: ");
     int no= scan.nextInt();
     System.out.println("The multiples of the number "+no+" are");
     for(int i=1;i<=10;i++)
     {
        System.out.println(i+"x"+no+"="+no*i);
     }
    }
}