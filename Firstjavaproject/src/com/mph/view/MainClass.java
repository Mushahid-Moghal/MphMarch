package com.mph.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.mph.controller.EmployeeController;
import com.mph.controller.EmployeeInterface;
import com.mph.exception.UserNotFound;
import com.mph.model.Manager;
import com.mph.model.Employee;
import java.util.function.BiPredicate;
public class MainClass {

	public static void main(String[] args) throws Exception {

		EmployeeInterface ec = new EmployeeController();
		List<Employee> elist =null;
		

		Scanner sc = new Scanner(System.in);
		
		

		
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String un,pw;
			System.out.println("Enter UserName");
			un=br.readLine();
			System.out.println("Enter Password");
			pw =br.readLine();
			
			BiPredicate<String, String> pred = (unn,pwd)->unn.equals(pwd);
			if(pred.test(un, pw))
			{
				System.out.println("Please Wait Loading..... " );
				
				Thread.sleep(1000
						);
				System.out.println("wait Its loading");
				Thread.sleep(10);
				
				System.out.println("Welcome  To  Grand premier League!!!" );
				
				String input = null;
				
				
				do {
					System.out.println("Enter Choice");
					System.out.println("1. Add Employee");
					System.out.println("2. View Employee");
					System.out.println("3. Get ResultSet MetaData Info");
					System.out.println("4. View All");
					System.out.println("5. Sort Employee According to name");
					System.out.println("6. Procedure insert");
					System.out.println("7. Sort By name and view");
					System.out.println("8. Serialize");
					System.out.println("9. DeSerialize");
					System.out.println("10. RS Forward Only");
					System.out.println("11. RS scroll insensitive");
					System.out.println("12. RS scroll sensitive");
					int choice = sc.nextInt();
					switch (choice) {
					case 1: {
						elist=ec.addEmployee();
						break;
					}

					case 2: {
					
						ec.viewEmployee(elist);

						
						
						break;
					}
					case 3: {
						ec.rsmd();
						break;
					}
					case 4: {
						ec.viewManager();
						break;
					}
					case 5: {
						ec.sortEmp();
						break;
					}
					
					case 6: {
						ec.insertUsingProc();
						break;
					}
					case 7: {
						ec.sortbyName(elist);
						break;
					}
					case 8 : {
						ec.serialize(elist);
						break;
					}
					case 9 : {
						ec.deserialize(elist);
					    break;
					}
					
					case 10: {
						ec.type_forward_only_rs();
					}
					case 11: {
						ec.type_scroll_insensitive_rs();
					}
					case 12: {
						ec.type_scroll_sensitive_rs_insert();
					}
					default: {

					}

					}
					
					System.out.println("Do you want to continue ? Y or y for yes");
					input = sc.next();
				} while (input.equals("Y") || input.equals("y"));
				System.out.println("System Exited..Thanks for using our system !!!");
				System.exit(0);
			

				
			}
			else
			{
				System.out.println("Check the Credentials" );
			}

			
			}
			finally{
				System.exit(0);
			}
		
		
		
	}
		
		
			
}