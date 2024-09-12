package application;

import model.dao.Dao;
import model.dao.DaoFactory;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Dao<Seller> sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
	}

}
