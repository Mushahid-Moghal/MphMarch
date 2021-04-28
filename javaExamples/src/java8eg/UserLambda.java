package java8eg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UserLambda {

	public static void main(String[] args) {
		User u1 = new User("Moghal","Moghal@gmail.com",22);
		User u2 = new User("Mushahid","Mushahid@gmail.com",22);
		User u3 = new User("Razvi","Razvi@gmail.com",22);
		
		List<User> li = new ArrayList<User>();
		li.add(u1);
		li.add(u2);
		li.add(u3);
		
		System.out.println("List of Users : " +  li);
		
		li.forEach(lis ->System.out.println(lis));
		System.out.println("****************");
		Collections.sort(li,User.nameComparator);
		System.out.println(li);
		
		System.out.println("****************");
		
		Collections.sort(li,User.ageComparator);
		System.out.println(li);
		
	}

}