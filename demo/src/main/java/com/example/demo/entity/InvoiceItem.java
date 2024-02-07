package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class InvoiceItem {
    @Id
    @GeneratedValue
    private UUID id;
    private String item_name;
    private Long quantity;
    private Long price;
    private Long amount;

    @ManyToOne
    @JoinColumn(name="invoiceId", unique = true)
    private Invoice invoice;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
