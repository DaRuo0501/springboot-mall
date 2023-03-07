package com.daruo.springbootmall.dao;

import com.daruo.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer OrderId, List<OrderItem> orderItemList);
}
