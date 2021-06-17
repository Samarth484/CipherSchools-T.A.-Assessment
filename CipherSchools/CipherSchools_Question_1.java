package CipherSchools;

import java.util.Arrays;
import java.util.Scanner;

public class CipherSchools_Question_1 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println();
		int n = scn.nextInt();
		int arr[] = sumZeroArray(n);

		System.out.println(Arrays.toString(arr));

	}

	public static int[] sumZeroArray(int n) {

		if (n == 1)
			return new int[] { 0 };

		int arr[] = new int[n];
		int a = -1;

		for (int i = 1; i <= n / 2; ++i) {
			arr[++a] = i;
			arr[++a] = -i;
		}
		if (n % 2 != 0)
			arr[++a] = 0;

		return arr;

	}
//	submission link:   https://docs.google.com/forms/d/e/1FAIpQLSfTF8LxyE08lzc6HuDz-2X4Ypp9-S41QAjWbz_9qpIlPd-eDg/formResponse
}
