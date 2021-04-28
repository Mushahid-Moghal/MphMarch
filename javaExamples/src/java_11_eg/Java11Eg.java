package java_11_eg;
import java.lang.String;
public class Java11Eg {

	public static void main(String[] args) {
		String str="Welcome to java11";
		System.out.println(str);
		
		var str2=999;
//		str2=100;
		System.out.println(str2);
		
		final var text="Rose";
//		text="Lilly";
		System.out.println(text);
		
//		var myvar=null;//comp error
		
//		var lamb=()-> System.out.println("hi");
		
		System.out.println(" ".isBlank());
		System.out.println("   g   ".strip());
		System.out.println("  g  ".stripTrailing());
		System.out.println("  g  ".stripLeading()+" f");
		System.out.println("Java\n".repeat(5));
		System.out.println("Hello\nJava\nWelcome".lines().count());
		
		
		
	}

}