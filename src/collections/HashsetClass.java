package collections;

public class HashsetClass {
	private String name;
	private int grade;

	public HashsetClass(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {

		return name + ":" + grade;
	}

	@Override
	public boolean equals(Object obj) {
		String compareValue = obj.toString();
		String thisValue = toString();

		return thisValue.equals(compareValue);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return toString().hashCode();
	}
}
