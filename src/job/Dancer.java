package job;
import creature.Character;

public class Dancer extends Character {

	public void dance() {
		System.out.println(this.getName() +"は情熱的に踊った");
	}
	// Dancerクラスでattackメソッドを実装しない場合は、親クラスと同じようにabstractをつけて定義しなければいけない
	// またクラス名にもabstractをつけて、抽象クラスにしなければならない
	// public abstract void attack();
	public void attack() {
		System.out.println(this.getName() +"の攻撃");
		System.out.println("敵に5のダメージ");
	}
}
