package CipherSchools;

import java.util.ArrayList;
import java.util.Scanner;

public class CipherSchools_Question_3 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String arg[]) {
//		int n = scn.nextInt();
//		int val[] = new int[n];
//		int wt[] = new int[n];
//		for (int i = 0; i < n; i++)
//			wt[i] = scn.nextInt();
//		for (int i = 0; i < n; i++)
//			val[i] = scn.nextInt();

		int val[] = { 12, 10, 21, 15 };
		int wt[] = { 2, 1, 3, 2 };
		int cap = 7;
		int n = val.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int ans = knapSackWithValArr(cap, wt, val, n, list);
		System.out.println("By selecting weights:" + list + " you will get maximum value " + ans + ".");
	}

	static int knapSackWithValArr(int cap, int wt[], int val[], int n, ArrayList<Integer> list) {

		int j;

		int dp[][] = new int[n + 1][cap + 1];

		for (int i = 0; i <= n; i++) {
			for (j = 0; j <= cap; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (wt[i - 1] <= j)
					dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
				else
					dp[i][j] = dp[i - 1][j];
			}
		}

		int res = dp[n][cap];

		j = cap;
		for (int i = n; i > 0 && res > 0; i--) {

			if (res != dp[i - 1][j]) {

				list.add(wt[i - 1]);

				res = res - val[i - 1];
				j = j - wt[i - 1];
			}
		}
		return dp[n][cap];
	}

}
