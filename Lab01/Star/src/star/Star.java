package star;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line; // ���� ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �ٷ� ���� ����ұ��?:");
		line = sc.nextInt(); // �Է��� ���� ����
		
		if (line >= 1) { // 1�� �̻��� ��
			System.out.println("---[1��]---");
			for (int i=1; i <= line; i++) { // ���� �� �󺹹� 
				for (int k=1; k <= i; k++) { // ���� �� �ݺ���
					System.out.print("*"); 
				} 
				System.out.println(); // ���� ��
			} 
			
			System.out.println("---[2��]---");
			for (int i=line-1; i >= 0; i--) { // ���� �� �󺹹� 
				for (int k=0; k <= i; k++) { // ���� �� �ݺ���
					System.out.print("*");
				} 
				System.out.println(); // ���� ��
			} 
			
			System.out.println("---[3��]---");
			for (int i=line/2, add=0; i > 0; i--, add++) {
				for (int k=0; k <= i-1; k++) {
					System.out.print(" "); 
				} // �߰� ���� ���κ� ����
				for (int k=0; k < line/2 - (i-1) + add; k++) {
					System.out.print("*"); 
				} // ���� �� ��
				System.out.println();
			}
			for (int i=0, add=line/2; i < line/2 + 1; i++, add--) {
				for (int k=0; k < i; k++) { 
					System.out.print(" ");
				} // �߰� ���� �غκ� ����
				for (int k=0; k < (line/2 + 1) - i + add; k++) {
					System.out.print("*");
				} // ���� �� ��
				System.out.println();
			} 
		} //if�� 
		
		else if (line <= 0) { // 0���� �� �Է����� ��
			System.out.println("---[1��]---");
			for (int i=1; i <= 5; i++) { 
				for (int k=1; k <= i; k++) { // 5�ٷ� ����
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("---[2��]---");
			for (int i=5; i >= 0; i--) {
				for (int k=0; k < i; k++) { // 5�ٷ� ����
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("---[3��]---");
			for (int i=9/2, add=0; i > 0; i--, add++) {
				for (int k=0; k <= i-1; k++) { 
					System.out.print(" ");
				} // 1~4° �ٱ��� �� ���� ����
				for (int k=0; k < 9/2 - (i-1) + add; k++) {
					System.out.print("*");
				} // ���� �� �� ���
				System.out.println();
			}
			for (int i=0, add=9/2; i < 9/2 + 1; i++, add--) {
				for (int k=0; k < i; k++) {
					System.out.print(" ");
				} // 6~9��° �ٱ��� �� ���� ����
				for (int k=0; k < (9/2 + 1) - i + add; k++) {
					System.out.print("*");
				} // ���� �� ��
				System.out.println();
			}
		} // else if
		
	} // main
} // class
