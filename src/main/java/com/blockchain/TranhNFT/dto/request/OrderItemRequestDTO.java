package com.blockchain.TranhNFT.dto.request;

import java.io.Serializable;

public class OrderItemRequestDTO implements Serializable {
    private int orderItemId;
    private int orderId;
    private int paintingId;
    private int quantity;
    private double price;

    public OrderItemRequestDTO(int orderItemId, int orderId, int paintingId, int quantity, double price) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.paintingId = paintingId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getPaintingId() {
        return paintingId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
