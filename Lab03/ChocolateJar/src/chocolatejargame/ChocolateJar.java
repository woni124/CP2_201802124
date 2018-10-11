package chocolatejargame;

public class ChocolateJar implements Jar{
	
	private int chocolate;
	private int chilli;
	
	public ChocolateJar() {
		chocolate = 13;
		chilli = 1;
	} // 기본값인 생성자
	
	public ChocolateJar(int chocolate) {
		this.chocolate = chocolate;
		this.chilli = 1;
	} // 초콜릿값 입력받는 생성자
	
	@Override
	public int getItem() {
		return chocolate + chilli;
	} // 전체 아이템 수
	
	public int getChocolate() {
		return chocolate;
	}
	
	public int getChilli() {
		return chilli;
	}
	
	@Override
	public void takeItem(int hand) {
		int chilate = chocolate + chilli;
		
		if (chilate > hand) { 
			chocolate = chocolate - hand;
		} // 뽑고자 하는 개수보다 초콜릿과 칠리의 개수가 많을 때 뽑음
		else {chocolate = 0; chilli = 0;}
	} // 초콜릿 + 칠리의 개수와 뽑고자하는 개수가 같다면 칠리도 뽑는다.
	
	
	@Override
	public String status() {
		String status = "[ ■";
		for (int i = 0; i < chocolate; i++ ) {
			 status = status + " □";
		} status = status + " ]";
		return status;
	}  // 항아리에 있는 초콜릿과 칠리를 보여줌

	@Override
	public boolean isEmpty() {
		if (chocolate == 0 && chilli == 0) {
			return true;
		} // 초콜릿과 칠리 둘다 없으면 true
		else {return false;}
	}

}
