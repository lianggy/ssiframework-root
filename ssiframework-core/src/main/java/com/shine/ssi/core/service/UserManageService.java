package com.shine.ssi.core.service;

import com.shine.ssi.model.UserPO;

public interface UserManageService {
	
	UserPO findById(String id);
	
	int queryCount(); 

}
