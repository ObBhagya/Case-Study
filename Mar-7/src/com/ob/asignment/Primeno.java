package com.ob.asignment;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {

		int i, res;
		
		boolean flag=true;
		// flag=0;

		System.out.println("enter number");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (i = 0; i < n; i++) {

			if (n % 2 == 0 || n % 2 == 1) {
				flag=false;
		break;
				
			}		
		}		
				
				
		if (flag==true) {
				System.out.println("its prime number");
		}else {
				System.out.println("its not a prime no");
			}

	}

	}
