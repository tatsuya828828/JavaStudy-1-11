// インターフェースを継承して拡張することもできる
// implements(実装) extends(拡張) と考えて使い分ける
public interface CleaningService extends Service {
	// interfaceではメソッドの処理動作を定めないため特別に多重継承が許可されている
	// これはメソッドの内容を定めていないため、同じ名前のメソッドが重複しても衝突することがないからである
	Shirt washShirt(Shirt s);
	Towl washTowl(Towl t);
	Coat washCoat(Coat c);
}
