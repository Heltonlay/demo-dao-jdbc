package model.dao.impl;

import java.util.List;

import model.dao.Dao;
import model.entities.Seller;

public class SellerDaoJDBC implements Dao<Seller> {

	@Override
	public void insert(Seller obj) {
		System.out.println("inserted");
	}

	@Override
	public void update(Seller obj) {

	}

	@Override
	public void deleteById(Integer id) {

	}

	@Override
	public Seller findById(Integer id) {
		return null;
	}

	@Override
	public List<Seller> findAll() {
		return null;
	}

}
