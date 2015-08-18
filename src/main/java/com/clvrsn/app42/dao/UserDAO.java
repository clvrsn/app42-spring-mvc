package com.clvrsn.app42.dao;

import org.springframework.stereotype.Repository;

import com.clvrsn.app42.entities.User;

@Repository
public class UserDAO {

	public void save(User user) {
		// Salvar usuário JDBC
	}

	public boolean validatePassword(User user) {

		// Validar senha do usuário no banco de dados
		return true;

	}

}
