
public class ObjectMethods {
	public static void main(String[] args) {
		Client client=new Client("test1");
		Client client1=new Client("test2");
		Client client2=client1;
		int hash=client1.hashCode();
		int hash1=client2.hashCode();
		System.out.println(hash==hash1);// true
		System.out.println(client.equals(client2));// true
		System.out.println(client1.equals(client2));// true
	}

}
