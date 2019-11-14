import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class Exercise_17_09_Contact{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String street;
	String city;
	String state;
	String zip;
	public Exercise_17_09_Contact(){
		
	}
	public Exercise_17_09_Contact(String name, String street, String city, String state, String zip) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void read(RandomAccessFile raf) throws IOException {
		char[] temp = new char[32];
		for (int i = 0; i < temp.length; i++)
			temp[i] = (char) raf.readByte();
		setName(new String(temp));
		
		temp = new char[32];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (char) raf.readByte();
		}
		setStreet(new String(temp));
		temp = new char[20];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (char) raf.readByte();
		}
		setCity(new String(temp));
		temp = new char[2];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (char) raf.readByte();
		}
		setState(new String(temp));
		temp = new char[5];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (char) raf.readByte();
		}
		setZip(new String(temp));

	}

	public void write(RandomAccessFile raf) throws IOException {
		StringBuffer sb;
		
		if (getName() != null)
			sb = new StringBuffer(getName());
		else
			sb = new StringBuffer();

		sb.setLength(32);
		byte[] byte1 = String.valueOf(sb).getBytes();
		for (int i = 0; i < byte1.length; i++) {
			raf.writeByte(byte1[i]);
		}

		if (getStreet() != null)
			sb = new StringBuffer(getStreet());
		else
			sb = new StringBuffer();

		sb.setLength(32);
		byte1 = String.valueOf(sb).getBytes();
		for (int i = 0; i < byte1.length; i++) {
			raf.writeByte(byte1[i]);
		}

		if (getCity() != null)
			sb = new StringBuffer(getCity());
		else
			sb = new StringBuffer();

		sb.setLength(20);
		byte1 = String.valueOf(sb).getBytes();
		for (int i = 0; i < byte1.length; i++) {
			raf.writeByte(byte1[i]);
		}

		if (getState() != null)
			sb = new StringBuffer(getState());
		else
			sb = new StringBuffer();

		sb.setLength(2);
		byte1 = String.valueOf(sb).getBytes();
		for (int i = 0; i < byte1.length; i++) {
			raf.writeByte(byte1[i]);
		}

		if (getZip() != null)
			sb = new StringBuffer(getZip());
		else
			sb = new StringBuffer();

		sb.setLength(5);
		byte1 = String.valueOf(sb).getBytes();
		for (int i = 0; i < byte1.length; i++) {
			raf.writeByte(byte1[i]);
		}
	}
}
