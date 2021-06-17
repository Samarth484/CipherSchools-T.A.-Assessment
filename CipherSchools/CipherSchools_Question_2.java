package CipherSchools;

import java.util.Scanner;

public class CipherSchools_Question_2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter number of items");
		int n = scn.nextInt();
		System.out.println("Start Entering cost of each item");
		int cost[] = new int[n];
		for (int i = 0; i < n; i++)
			cost[i] = scn.nextInt();

		System.out.println("Enter the value of k");
		int k = scn.nextInt();

		System.out.println("Enter the amount of money customer has initially");
		int money = scn.nextInt();

		int count = 0;

		for (int val : cost)
			if (money % val == 0)
				++count;

		System.out.println(count == k ? "Right" : "Wrong");

	}

}
