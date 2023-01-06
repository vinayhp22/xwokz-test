package test.jan6;

import java.util.Scanner;

public class LoveCheck {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Note: Timmy & Sarah in love if one have odd and other had even petals in the flower.\n");
		System.out.println("Enter the counted value of petals which Timmy had : ");
		int timmy = sc.nextInt();
		System.out.println("Enter the counted value of petals which Sarah had : ");
		int sarah = sc.nextInt();
		love(timmy, sarah);
		System.out.println("Timmy had a flower of petals : " + timmy);
		System.out.println("Sarah had a flower of petals : " + sarah);

	}

	private static void love(int a, int b) {
		if ((a % 2 == 0 && b % 2 != 0) || (a % 2 != 0 && b % 2 == 0)) {
			System.out.println("Timmy and Sarah are in love.... odd & even petals");
		} else {
			System.out.println("Bad Luck Timmy... No love... both are odd / even petals");
		}

	}
}