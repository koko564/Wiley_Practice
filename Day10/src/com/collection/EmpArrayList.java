package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpArrayList {

	public static void main(String[] args) {
		
		
		List<Employee> empList=Arrays.asList(new Employee("John","Doe"),new Employee("Davis","Smit"),new Employee("John","Doe"),new Employee("Williams","Sakosa"),new Employee("Alan","Lamb"));
		System.out.println(empList);
		for(Employee employee: empList) {
			System.out.println(employee);
		}
		System.out.println(empList);
		for(Employee employee: empList) {
			System.out.println(employee);
		}
		
		

	}
}

