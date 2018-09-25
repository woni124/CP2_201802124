package star;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line; // 줄의 수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 줄로 별을 출력할까요?:");
		line = sc.nextInt(); // 입력한 숫자 저장
		
		if (line >= 1) { // 1줄 이상일 때
			System.out.println("---[1번]---");
			for (int i=1; i <= line; i++) { // 별의 수 빈복문 
				for (int k=1; k <= i; k++) { // 줄의 수 반복문
					System.out.print("*"); 
				} 
				System.out.println(); // 다음 줄
			} 
			
			System.out.println("---[2번]---");
			for (int i=line-1; i >= 0; i--) { // 별의 수 빈복문 
				for (int k=0; k <= i; k++) { // 줄의 수 반복문
					System.out.print("*");
				} 
				System.out.println(); // 다음 줄
			} 
			
			System.out.println("---[3번]---");
			for (int i=line/2, add=0; i > 0; i--, add++) {
				for (int k=0; k <= i-1; k++) {
					System.out.print(" "); 
				} // 중간 기준 윗부분 공백
				for (int k=0; k < line/2 - (i-1) + add; k++) {
					System.out.print("*"); 
				} // 공백 후 별
				System.out.println();
			}
			for (int i=0, add=line/2; i < line/2 + 1; i++, add--) {
				for (int k=0; k < i; k++) { 
					System.out.print(" ");
				} // 중간 기준 밑부분 공백
				for (int k=0; k < (line/2 + 1) - i + add; k++) {
					System.out.print("*");
				} // 공백 후 별
				System.out.println();
			} 
		} //if문 
		
		else if (line <= 0) { // 0이하 값 입력했을 때
			System.out.println("---[1번]---");
			for (int i=1; i <= 5; i++) { 
				for (int k=1; k <= i; k++) { // 5줄로 지정
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("---[2번]---");
			for (int i=5; i >= 0; i--) {
				for (int k=0; k < i; k++) { // 5줄로 지정
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("---[3번]---");
			for (int i=9/2, add=0; i > 0; i--, add++) {
				for (int k=0; k <= i-1; k++) { 
					System.out.print(" ");
				} // 1~4째 줄까지 별 앞의 공백
				for (int k=0; k < 9/2 - (i-1) + add; k++) {
					System.out.print("*");
				} // 공백 후 별 찍기
				System.out.println();
			}
			for (int i=0, add=9/2; i < 9/2 + 1; i++, add--) {
				for (int k=0; k < i; k++) {
					System.out.print(" ");
				} // 6~9번째 줄까지 별 앞의 공백
				for (int k=0; k < (9/2 + 1) - i + add; k++) {
					System.out.print("*");
				} // 공백 후 별
				System.out.println();
			}
		} // else if
		
	} // main
} // class
