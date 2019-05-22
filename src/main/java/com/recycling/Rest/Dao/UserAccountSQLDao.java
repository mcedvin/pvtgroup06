package com.recycling.Rest.Dao;

import com.recycling.production.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class UserAccountSQLDao {

    @Autowired
    private com.recycling.DB.repository.UserAccountsRepository UserAccountsRepository;

    public Collection<UserAccount> getAllUserAccounts(){
        return UserAccountsRepository.findAll();
//        return null;
    }

    public UserAccount getUserAccountById(int id){
        return null;
    }

    public void removeUserAccountById(int id){

    }

    public void updateUserAccount(UserAccount updatedUserAccount){

    }

    public void addUserAccount(UserAccount newUserAccount){
        UserAccountsRepository.save(newUserAccount);
    }
}