package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static Dao<?> createSellerDao() {
		return new SellerDaoJDBC();
	}
}
