// interfaceを継承する場合はimplementsを使う
public class KyotoCleaningShop implements CleaningService {
	String ownerName;
	String address;
	String phone;

	// 洗い方は店舗毎によって違うため店舗側で定義
	public Shirt washShirt(Shirt s) {
		return s;
	}

	public Towl washTowl(Towl t) {
		return t;
	}

	public Coat washCoat(Coat c) {
		return c;
	}

	public void greeting() {
		System.out.println("いらっしゃいませ");
	}
}
