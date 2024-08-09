package com.java5.onthijava6.repository;

import com.java5.onthijava6.entity.User;
import org.hibernate.mapping.List;
import org.hibernate.mapping.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface UserRepo extends JpaRepository<User,String>{
    @Modifying
    @Query(value="DELETE FROM Users u WHERE u.id = ?1",nativeQuery = true)
    int deleteUserById(String id);

    @Query(value="SELECT * FROM Users u WHERE u.id like %?1% or u.fullname like %?1%",nativeQuery = true)
    ArrayList<User> findByIdOrFullName(String key);
}
