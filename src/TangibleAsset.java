
public abstract class TangibleAsset implements Thing{
	String name;
	int price;
	String color;
	double weight;

	public TangibleAsset(String name, int price, String color, int weight) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public String getColor() {
		return this.color;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
