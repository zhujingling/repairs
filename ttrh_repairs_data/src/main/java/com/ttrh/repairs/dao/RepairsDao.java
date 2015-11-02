package com.ttrh.repairs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ttrh.repairs.entity.Repairs;

@Repository
public interface RepairsDao {
	List<Repairs> selectRepairsByUid(String uid);
	List<Repairs> selectRepairs(String uid);
}
