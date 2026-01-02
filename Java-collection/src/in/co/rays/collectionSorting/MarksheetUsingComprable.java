package in.co.rays.collectionSorting;

public class MarksheetUsingComprable implements Comparable<MarksheetUsingComprable> {
  
	private String name;
	private int rollNo;
	private int physics;
	private int chemistry;
	private int total;

	public MarksheetUsingComprable(String name, int rollNo, int physics, int chemistry) {

		this.name = name;
		this.rollNo = rollNo;
		this.physics = physics;
		this.chemistry = chemistry;
		this.total = physics + chemistry;

	}

	@Override
	public String toString() {
		return "Name: " + name + " RollNo: " + rollNo + " Physics Marks: " + physics + " Chemistry Marks: " + chemistry
				+ " Total Marks of all subjects: " + total + "\n";
	}

	@Override
	public int compareTo(MarksheetUsingComprable o) {
		//return this.total - o.total;
		
		return this.name.compareTo(o.name);
	}

}
