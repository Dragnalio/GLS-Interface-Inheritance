package glsMei;

public class BaseCharacter {
	protected String name, description;

	public BaseCharacter(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void getInfo() {
		System.out.println(this.name + ", " + this.description);
	}
}
