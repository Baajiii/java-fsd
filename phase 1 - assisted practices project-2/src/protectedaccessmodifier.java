import package1.privateaccessmodifier;

public class protectedaccessmodifier extends privateaccessmodifier{
	public static void main(String[] args) {
		protectedaccessmodifier p = new protectedaccessmodifier();
		p.method2();	//protected access modifier can access through inheritances 
	}
	
}