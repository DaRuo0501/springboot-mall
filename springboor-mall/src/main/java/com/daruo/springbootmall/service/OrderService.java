package com.daruo.springbootmall.service;

import com.daruo.springbootmall.dto.CreateOrderRequest;
import com.daruo.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
