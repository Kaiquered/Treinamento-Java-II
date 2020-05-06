package entities;

public class Student {

	public String name;
	public float note1;
	public float note2;
	public float note3;

	public float noteFinal() {
		return note1 + note2 + note3;
	}

	public float result() {
		return 60 - noteFinal();
	}
}
