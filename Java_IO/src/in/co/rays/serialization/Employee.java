package in.co.rays.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	public int Id;
	public String Name;

	public Employee() {

	}

	public Employee(int Id, String Name) {

		this.Id = Id;
		this.Name = Name;

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(Name);
		out.writeInt(Id);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		Name = (String) in.readObject();
		Id = in.readInt();

	}

	public String toString() {

		return "Employee Details: " + "[" + "Id: " + Id + ", Name: " + Name + "]";
	}
}
