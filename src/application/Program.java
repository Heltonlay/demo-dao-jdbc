package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("TESTE 1 - findById");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);

		System.out.println("\nTESTE 2 - findByDepartment");
		Department dep = new Department(2, null);
		List<Seller> sellers = sellerDao.findByDepartment(dep);
		sellers.stream().forEach(System.out::println);
		
		System.out.println("\nTESTE 3 - findAll");
		sellers = sellerDao.findAll();
		sellers.stream().forEach(System.out::println);
		
		System.out.println("\nTESTE 4 - insert");
		Seller newSeller = new Seller(null, "Jane", "jane@gmail.com", new Date(), 3200.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! Generated Id: " + newSeller.getId());
		
		System.out.println("\nTESTE 5 - update");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Seller Id 1 Updated!");
		
		System.out.println("\nTESTE 5 - delete");
		System.out.print("Enter an Id to delete: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleted!");
	}

}
