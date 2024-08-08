package com.java5.onthijava6.repository;

import com.java5.onthijava6.entity.User;
import org.hibernate.mapping.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;

@Repository
public interface UserRepo extends JpaRepository<User,String>{
    @Modifying
    @Query(name="DELETE FROM Users u WHERE u.id = ?1",nativeQuery = true)
    int deleteUserById(String id);
}
