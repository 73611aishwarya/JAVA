package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.exception.EmployeeNotFound;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeManage {

	public static void main(String[] args) throws EmployeeNotFound {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		EmployeeService eservice=new EmployeeServiceImpl();
		eservice.readFile("empdata.dat");
		do {
			System.out.println("1. Add new Employee\n2. delete Employee\n3. update employee\n4. display all\n5.exit\nchoice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				eservice.addnewEmployee();

			case 2:
				System.out.println("enter id");
				int id=sc.nextInt();
				boolean status=eservice.deleteById(id);
				if(status) {
					System.out.println("deleted successfully");
				}

			case 3:
				System.out.println("enter id");
				int id1=sc.nextInt();
				System.out.println("enter new salary");
				double sal=sc.nextDouble();
				boolean status1=eservice.updateById(id1,sal);
				if(status1) {
					System.out.println("updated successfully");
				}

			case 4:
				List<Employee> elst=eservice.getAll();
				elst.stream().forEach(System.out::println);

			case 5:
				eservice.writeFile("empdata.dat");
				System.out.println("thank you for visiting....");
				sc.close();

			default:
			}
		}while(choice!=5);
	}


}


