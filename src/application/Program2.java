package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TESTE: 1 insert implementation //DepartmentDaoJDBC");
		Department newdp = new Department(8, "RH");
		departmentDao.insert(newdp);
		System.out.println("OK! You have entered a new department: " + newdp);
	}

}
