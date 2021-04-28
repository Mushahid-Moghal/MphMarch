package java8eg;

import java.util.Comparator;

import com.mph.sorteg.Student;

public class User {
	private String name;
	private String email;
	private int age;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
	public static Comparator<User> nameComparator = new Comparator<User>() {

		@Override
		public int compare(User s1, User s2) {
			
			return (s1.getName().compareTo(s2.getName()));
		}
		
		
	};

	//Anonyomous class
		public static Comparator<User> ageComparator = new Comparator<User>() {

			@Override
			public int compare(User s1, User s2) {
				
				return (s1.getAge() - s2.getAge());
			}
			
			
		};

}