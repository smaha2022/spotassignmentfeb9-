package zoho.test;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= n; j++)
			{
				if (i == 1 || i == n || i == (n + 1) / 2 && j == (n + 1) / 2 || j == 1 || j == n)
				{
					System.out.print("1");

				} else {
					System.out.print("0");
				}

			}
			System.out.println();

		}
	}
}