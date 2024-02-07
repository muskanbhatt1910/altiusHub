package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class InvoiceBillSundry {
    @Id
    @GeneratedValue
    private UUID id;
    private String bill_sundry_name;
    private Long amount;

    @OneToOne
    @JoinColumn(name="invoiceId", unique = true)
    private Invoice invoice;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBill_sundry_name() {
        return bill_sundry_name;
    }

    public void setBill_sundry_name(String bill_sundry_name) {
        this.bill_sundry_name = bill_sundry_name;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
