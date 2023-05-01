package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = new DaoFactory().createDepartmentDao(); 
		
		System.out.println("=== Test 1: insert ===");
		Department newDepartment = new Department(7, "Logistica");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = "+ newDepartment.getId());
	
	}

}
