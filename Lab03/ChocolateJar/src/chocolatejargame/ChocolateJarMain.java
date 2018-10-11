package chocolatejargame;

import java.util.*;

public class ChocolateJarMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int num;
		
		ChocolateJar chocolateJar = new ChocolateJar();
		
		System.out.println("게임을 시작합니다.\n" + "항아리에는 14개의 아이템이 있습니다.");
		System.out.println("[ ■ □ □ □ □ □ □ □ □ □ □ □ □ □ ]");
		System.out.println("1~3개의 아이템을 꺼낼 수 있으며 칠리를 꺼내면 패배합니다.\n" + "시작!!\n");
		
		int i = 1;
		int maxtake, take;
		while (chocolateJar.isEmpty() == false) { // 내부 아이템 있을 때
			System.out.println("+------ " + i + "번째 턴! ------+" );
			System.out.print("몇 개를 뽑을까요?(1~3)");
			num = sc.nextInt();
			if (num >=1 && num <=3) { // 입력한 숫자 1~3일 때
				if (chocolateJar.getItem() <= 2 && num >= 3) {
					System.out.println("수량을 정확하게 입력해 주십시오.\n");
				} // 초콜릿 + 칠리 보유 개수보다 입력한 값이 많을 때 못 뽑음
				else {
					chocolateJar.takeItem(num); //그 숫자만큼 꺼냄
					if (chocolateJar.getChilli() == 1) {
						System.out.println("플레이어는 " + num + "개의 초콜릿을 꺼냈습니다.");
						System.out.println(chocolateJar.status());
					} // 칠리의 개수 1일 때 칠리가 있으므로 아직 더 꺼낼 수 있음
					else {System.out.println("플레이어가 칠리를 꺼냈습니다.\n" + "컴퓨터 승리!");
						break;} // 아닐 경우 플레이어가 칠리를 꺼내므로 컴퓨터 승리 출력 후 반복문 종료
					
					if (chocolateJar.getChocolate() == 0) { 
						System.out.println("플레이어 승리!");
						break;
					} // 초콜릿 개수 0일 때 플레이어 이기고 반복문 탈출
				
					maxtake = Math.min(3,  chocolateJar.getItem()-1);
					take = random.nextInt(1000)%maxtake%3 + 1; // 컴퓨터가 뽑을 개수
					chocolateJar.takeItem(take);
					System.out.println("컴퓨터는 " + take + "개의 초콜릿을 꺼냈습니다.");
					System.out.println(chocolateJar.status());
				
					if (chocolateJar.getChocolate() == 0) {
						System.out.println("컴퓨터 승리!");
						break;
					}	// 컴퓨터가 초콜릿 뽑은 후 개수가 0일 때 칠리만 남았으므로 컴퓨터 승리 출력 후 반복문 종료
				
				System.out.println();
				i++; // 턴 숫자 증가
				} // 보유 개수 else
			} // 1 이상 3이하 if문
			else {System.out.println("1~3의 숫자만 입력하세요.\n");}			
		} // while
			
	} // main
}// class 
