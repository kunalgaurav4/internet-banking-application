package com.cg.iba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.iba.bean.User;


@Repository
public interface IUserRepository extends  JpaRepository<User,Long>{


}


