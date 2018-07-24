import java.util.*;

public class Solution {

	public static void main(String[] args) {

		rec(20);

	}

	static void rec(int a) {
		for (int i = 1; i <= a; i++) {
			if (i == 1 || i == a) {
				for (int j = 1; j <= a; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else{
				for (int j = 1; j <= a ; j++) {
					if (j == 1 || j == a){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
