package main_diagonal_sum;

import java.util.Scanner;

/*
 * You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
	Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
 */

public class Main_Diagonal_Sum {
	
	private static int main_diagonal_sum(int[][] array) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i][i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		int array[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		System.out.println(main_diagonal_sum(array));
		
	}
}
/*
   Input
	3 3 
	1 -2 -3 -4 5 -6 -7 -8 9

	Output
	15
	
	Input
	2 2
    3 2 2 3

	Output
	6
*/
