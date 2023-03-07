package com.daruo.springbootmall.dao;

import com.daruo.springbootmall.model.Order;
import com.daruo.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer OrderId, List<OrderItem> orderItemList);
}
