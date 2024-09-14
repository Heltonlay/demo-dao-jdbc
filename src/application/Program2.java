package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("TESTE 1 - findById");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\nTESTE 2 - findAll");
		List<Department> departments = departmentDao.findAll();
		departments.stream().forEach(System.out::println);
		
		System.out.println("\nTESTE 3 - insert");
		Department newdepartment = new Department(null, "Music");
		departmentDao.insert(newdepartment);
		System.out.println("Inserted! Generated Id: " + newdepartment.getId());
		
		System.out.println("\nTESTE 4 - update");
		department = departmentDao.findById(1);
		department.setName("Games");
		departmentDao.update(department);
		System.out.println("department Id 1 Updated!");
		
		System.out.println("\nTESTE 5 - delete");
		System.out.print("Enter an Id to delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted!");
		
		sc.close();
	}

}
