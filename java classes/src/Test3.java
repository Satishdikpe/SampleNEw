//predefined method
public class Test3 {
static String message = " hey there ";
public static void main(String[] args) {
//count length
	System.out.println(message.length());
 //remove spaces
	System.out.println(message.trim().length());
	
	//replace space with$
	System.out.println(message.replace("hey","hi"));
	
}
}
