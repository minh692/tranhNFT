package com.blockchain.TranhNFT.dto.request;

import java.io.Serializable;
import java.util.Date;

public class OrderRequestDTO implements Serializable {
    private int orderId;
    private int customerId;
    private double totalAmount;
    private String orderStatus;
    private Date createdAt;

    public OrderRequestDTO(int orderId, int customerId, double totalAmount, String orderStatus, Date createdAt) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
        this.createdAt = createdAt;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
