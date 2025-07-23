package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TESTE: 1 findById implementation //DepartmentDaoJDBC");
		Department dpTest = departmentDao.findById(2);
		System.out.println(dpTest);
		
		System.out.println("\n==== TESTE: 2 findAll implementation //DepartmentDaoJDBC");
		List<Department> list = departmentDao.findAll();
		for(Department dp: list) {
			System.out.println(dp);
		}
		
		System.out.println("\n==== TESTE: 3 insert implementation //DepartmentDaoJDBC");
		Department newdp = new Department(8, "RH");
		departmentDao.insert(newdp);
		System.out.println("OK! You have entered a new department: " + newdp);
		
		System.out.println("\n==== TESTE: 4 update implementation //DepartmentDaoJDBC");
		Department dpD = departmentDao.findById(6);
		dpD.setName("Food");
		departmentDao.update(dpD);
		System.out.println("OK! you made an update in department: " + dpD);
		
		System.out.println("\n==== TESTE: 5 delete implementation //DepartmentDaoJDBC");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteID(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}




