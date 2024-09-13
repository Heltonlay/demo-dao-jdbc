package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		System.out.println("TESTE 1 - findById");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);

		System.out.println("\nTESTE 2 - findByDepartment");
		List<Seller> sellers = sellerDao.findByDepartment(new Department(2, null));
		sellers.stream().forEach(System.out::println);
		
		System.out.println("\nTESTE 3 - findAll");
		List<Seller> allSellers = sellerDao.findAll();
		allSellers.stream().forEach(System.out::println);
	}

}
