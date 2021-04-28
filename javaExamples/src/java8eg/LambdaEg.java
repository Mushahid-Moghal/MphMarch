package java8eg;

interface Compute{
	public int add(int a,int b);
}
	interface Computer{
		public int sub(int a, int b);
	}
	interface Comput{
		public int mul(int a, int b);
	}
	 interface com{
		 public String Show( String str);
	 }
	 interface display{
		 public void show (String m);
	 }
	

public class LambdaEg{

	public static void main(String[] args) {
		//LambdaEg le = new LambdaEg();
		//System.out.println(le.add(10, 20));
		
		Compute com=(a, b)->{ return (a+b);	};
		System.out.println(com.add(45, 45));
		Computer cmp=(a,b)->{return (a-b); };
		System.out.println(cmp.sub(45, 45) );
		Comput cmm=(a,b)->{return (a*b); };
		System.out.println(cmm.mul(45, 45) );
		com d=(str)->{return(str);};
		System.out.println(d.Show("Good Morning People"));
		display dis=(m)-> {
			System.out.println(m);
			}; 
			dis.show("good afternoon");
		
	}
	
	/*@Override
	public int add(int a, int b) {
		
		return (a+b);
	}*/
	
	
		
}