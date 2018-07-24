import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		try {
			rec((Integer.parseInt(JOptionPane.showInputDialog("숫자를 넣어주세요"))));
		} catch (NumberFormatException e) {
			System.out.println("입력받지 못했습니다");
		} catch (HeadlessException e) {
			System.out.println("입력받지 못했습니다");
		}

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
