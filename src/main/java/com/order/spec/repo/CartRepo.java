package com.order.spec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.spec.entity.CartEntity;

public interface CartRepo extends JpaRepository<CartEntity,String>{


}