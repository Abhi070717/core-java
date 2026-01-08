package in.co.rays.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountserializable {

	public static void main(String[] args) throws Exception, IOException {

		Account a = new Account("77775643321707", 30454.24);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Account.txt"));

		out.writeObject(a);									// Convert Account class object into byte stream: serialization

		out.close();
		System.out.println("object serialized successfully");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Account.txt"));

		System.out.println(in.readObject());				// Convert byte stream into Account class object: deserialization

		in.close();

	}

}
