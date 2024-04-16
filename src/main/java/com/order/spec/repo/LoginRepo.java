package com.order.spec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.spec.entity.LoginEntity;

public interface LoginRepo extends JpaRepository<LoginEntity, String> {

	LoginEntity findByUsername(String name);

}
