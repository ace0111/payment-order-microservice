package com.acedeveloper.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acedeveloper.os.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
