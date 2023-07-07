package _04_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		new Backpack().packAndCheck();
		Backpack backpack = new Backpack();
		Pencil pencil = new Pencil();
		backpack.putInBackpack(pencil);
		pencil.write("Hello");
		Ruler ruler = new Ruler();
		backpack.putInBackpack(ruler);
		ruler.measure();
		Textbook textbook = new Textbook();
		backpack.putInBackpack(textbook);
		textbook.read();
		backpack.goToSchool();
	}
}
