package com.mph.controller;
import java.io.IOException;
import java.util.List;
import com.mph.model.Employee;

public interface EmployeeInterface {
	public List addEmployee();
	public void viewEmployee(List elist);
	public void insertUsingProc();
	
	public void addManager();
	public void type_forward_only_rs();
	public void rsmd();
	public void viewManager();
	public void sortEmp();
	public void sortbyName(List elist);
	public void serialize(List elist) throws IOException;
	public void deserialize(List elist) throws IOException, ClassNotFoundException;
	public void type_scroll_sensitive_rs_insert();
	public void type_scroll_insensitive_rs();

}