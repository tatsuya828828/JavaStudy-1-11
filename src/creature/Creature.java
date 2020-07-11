package creature;

public interface Creature {
	// 基本的にはフィールドを持たないが定数フィールドであれば宣言しても良い
	// 自動的にpublic static finalがつけられる
	double PI = 3.14;
	// interfaceでは自動的にpublic abstractがつくため省略しても良い
	void run();
	void talk();
}
