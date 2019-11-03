package externlizable_eg;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestCustomSerialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B b1=new B(true,"rama");
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.ser"))) {

			out.writeObject(b1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.ser"))) {
			B ref = (B) in.readObject();
			System.out.println("restored " + ref);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class B implements Externalizable {
	private boolean isActive;
	private String name;
	
	

	public B(boolean isActive, String name) {
		super();
		this.isActive = isActive;
		this.name = name;
	}

	
	  public B() { System.out.println("in B's def constr...."); name = "xyz";
	  
	  }
	 
	

	@Override
	public String toString() {
		return "B [isActive=" + isActive + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String nm) {
		name = name.concat(nm);
	}

	public void writeExternal(ObjectOutput os) throws IOException {
		System.out.println("custom write obj");
		// not writing boolean flag
		os.writeObject(name.toUpperCase());
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("custom read obj");
		// not reading boolean flag
		name = (String) in.readObject();
	}
	

}
