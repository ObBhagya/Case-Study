package Practise;

import java.util.Scanner;

public class Freq {

	

	public static void main(String[] args)

	{

	Scanner sc = new Scanner(System.in);

	int[] arr = new int[100];

	int[] freq = new int[100];

	int size, i, j, count;


	/* Input size of array */

	System.out.print(“nEnter size of array: “);

	size = sc.nextInt();


	/* Input elements in array */

	System.out.print(“Enter elements in array: “);

	for(i=0; i<size; i++)

	{

	arr[i] = sc.nextInt();


	/* Initially initialize frequencies to -1 */

	freq[i] = -1;

	}



	for(i=0; i<size; i++)

	{

	count = 1;

	for(j=i+1; j<size; j++)

	{

	/* If duplicate element is found */

	if(arr[i]==arr[j])

	{

	count++;


	/* Make sure not to count frequency of same element again */

	freq[j] = 0;

	}

	}


	/* If frequency of current element is not counted */

	if(freq[i] != 0)

	{

	freq[i] = count;

	}

	}

	/* Print frequency of each element */

	System.out.print(“nFrequency of all elements of array : n”);

	for(i=0; i<size; i++)

	{

	if(freq[i] != 0)

	{

	System.out.print(arr[i] + ” occurs ” + freq[i] + ” times” + “n”);

	}

	}

	}
	}
	
}
