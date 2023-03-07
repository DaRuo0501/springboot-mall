package com.daruo.springbootmall.service;

import com.daruo.springbootmall.dto.CreateOrderRequest;
import com.daruo.springbootmall.dto.OrderQueryParams;
import com.daruo.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
