package 인형클래스;

public class DollMain {

	public static void main(String[] args) {
		maChine ma = new maChine();
		Pika pika = new Pika();
		PiRi piri = new PiRi();
		kkoBukE kkobuk = new kkoBukE();

		// 머신을 통해서 피카츄 인형을 뽑기
		ma.getDoll(pika);
		ma.getDoll(piri);
		ma.getDoll(kkobuk);
	}
}
