package creature;
// 抽象メソッドを含むクラスは必ずabstract付きのクラスにしなければならない
// また、抽象クラスは、newによるインスタンス化が禁止される
public abstract class Character {
	private String name;

	// 抽象メソッド
	// 内容が現時点で確定できないときにabstractをつける
	public abstract void attack();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
