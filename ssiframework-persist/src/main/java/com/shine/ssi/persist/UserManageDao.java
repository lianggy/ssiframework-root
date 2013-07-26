package com.shine.ssi.persist;

import com.shine.ssi.model.UserPO;

public interface UserManageDao {
	
	int queryCount();
	
	UserPO findById(String id);

}
