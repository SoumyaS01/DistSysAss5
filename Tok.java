import java.io.*;
import java.util.*;

class Tok {

    public static void main(String args[]) throws Throwable 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num of nodes:");
        int n = scan.nextInt();
        int m = n - 1;
        // Decides the number of nodes forming the ring
        int token = 0;
        int ch = 0, flag = 0;
        // Displays total processes          e.g if n is 6 forloop will print :
        for (int i = 0; i < n; i++)                     // 0 1 2 3 4 5 0
        {
            System.out.print(" " + i);
        }

        System.out.println(" " + 0);        // for new line , zero to display loop

        do{
            System.out.println("Enter sender:");
            int s = scan.nextInt();     // no. of sender

            System.out.println("Enter receiver:");
            int r = scan.nextInt();     // no. of receiver

            System.out.println("Enter Data in integer:");
            int a = scan.nextInt();    // data

            /*System.out.print("Token passing:");
            for (int i = token, j = token; (i % n) != s; i++, j = (j + 1) % n) 
            {
                System.out.print(" " + j + "->");
            }*/

            System.out.print("Token passing:");
            for(int i = token; ( i % n )!= s; i = (i+1)%n)
            {
                System.out.print(" " + i + "->");
            }


            System.out.println(" " + s);
            System.out.println("Sender " + s + " sending data: " + a);
            for (int i = s + 1; i != r; i = (i + 1) % n) {
                System.out.println("data  " + a + " forwarded by " + i);
            }
            System.out.println("Receiver " + r + " received data: " + a +"\n");
            token = s;
            do{	
                try 
                {
                    if( flag == 1)
			System.out.print("Invalid Input!!...");
                    System.out.print("Do you want to send again?? enter 1 for Yes and 0 for No : ");
                    ch = scan.nextInt();
                    if( ch != 1 && ch != 0 )
			flag = 1;
                    else
			flag = 0;                    
                } 
                catch (InputMismatchException e){
                    System.out.println("Invalid Input");
                }
            }while( ch != 1 && ch != 0 ); 
        }while( ch == 1 );            
    }
}