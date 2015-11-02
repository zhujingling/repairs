package com.ttrh.repairs.dao;

import java.util.List;

import com.ttrh.repairs.entity.User;

public interface UserDao {
	List<User> getAllUser();
	List<User> getRepairsByUser();
}
