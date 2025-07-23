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
		
		System.out.println("==== TESTE: 2 update implementation //DepartmentDaoJDBC");
		Department dpD = departmentDao.findById(6);
		dpD.setName("Food");
		departmentDao.update(dpD);
		System.out.println("OK! you made an update in department: " + dpD);
		
		
	}

}




