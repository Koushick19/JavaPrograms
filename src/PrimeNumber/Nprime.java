package PrimeNumber;

import java.util.Scanner;

public class Nprime 
{
	public static void  main(String[] args)
	{
		Scanner input = new Scanner(System.in);
        int n, 
            i = 2, 
            x = 2;

        System.out.printf("This program calculates the nth Prime number\n");
        System.out.printf("Please enter the nth prime number you want to find: ");
        
        n = input.nextInt();

        for(i = 2; i <= n; i++) {
            for(x = 2; x < i; x++) {
                if(i % x == 0) {
                    break;
                }
            }
            if(x == i) {
                System.out.printf("\n%d is prime", x);
            }
        }
    }
	}


