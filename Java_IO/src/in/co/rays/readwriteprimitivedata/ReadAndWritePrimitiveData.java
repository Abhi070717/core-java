package in.co.rays.readwriteprimitivedata;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveData {
	
	public static void main(String[] args) throws Exception {
		
		DataOutputStream o = new DataOutputStream(new FileOutputStream("D:\\Java\\IO\\Primitive.txt"));
		
		o.writeInt(23);
		o.writeDouble(23.09);
		o.writeBoolean(true);
		o.writeChar('A');
		
		o.close();
		
		System.out.println("Primitive Data Stored");
		
		DataInputStream i = new DataInputStream(new FileInputStream("D:\\Java\\IO\\Primitive.txt"));
		
		System.out.println("Print Stored Data");
		
		System.out.println(i.readInt());
		System.out.println(i.readDouble());
		System.out.println(i.readBoolean());
		System.out.println(i.readChar());
		
		i.close();
	}

}
