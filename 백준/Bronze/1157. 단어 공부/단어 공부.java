import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine().toUpperCase();

		int[] arr = new int[26];

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'A';
			arr[index] += 1;
		}

		int max = arr[0];
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}

		}

		boolean isMaxValueEqual = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max && i != maxIndex) {
				isMaxValueEqual = true;
			}
		}

		if (isMaxValueEqual) {
			System.out.println("?");
		} else {
			System.out.println((char) (maxIndex + 'A'));
		}

		sc.close();
	}
}