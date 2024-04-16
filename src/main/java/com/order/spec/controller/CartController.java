package com.order.spec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.order.spec.entity.CartEntity;
import com.order.spec.entity.LoginEntity;
import com.order.spec.service.CartService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;



@CrossOrigin("*")
@RestController
public class CartController {

	@Autowired
	CartService cser;
	
	
	@PostMapping("/order/add")
	public List<CartEntity> postMethodName(@RequestBody List<CartEntity> order) {
		//TODO: process POST request
		
		return cser.addnewProduct(order);
	}
	@GetMapping("/order/path")
	public List<CartEntity> getMethodName() {
		return cser.getItems();
	}
	
	@PostMapping("/add/user")
	public List<LoginEntity> postUsers(@RequestBody List<LoginEntity>  usr){
		return cser.addUser(usr);
	}
	
	@GetMapping("/get/user")
	public List<LoginEntity> getUsers(){
		return cser.getUser();
	}
	
	
	@GetMapping("/user/login")
	public String checkLogin(@RequestParam String name,String password) {
		
		return cser.checkIsValidUser(name,password);
		
		
	}
	
}

