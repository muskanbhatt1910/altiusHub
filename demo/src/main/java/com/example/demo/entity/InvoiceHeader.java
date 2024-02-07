package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
public class InvoiceHeader {
    @Id
    @GeneratedValue
    private UUID id;
    private Date date;
    private Number invoice_number;
    private String customer_name;
    private String billing_address;
    private String shipping_address;
    private String gtin;
    private float total_amount;

    @OneToOne
    @JoinColumn(name="invoiceId", unique = true)
    private Invoice invoice;

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Number getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(Number invoice_number) {
        this.invoice_number = invoice_number;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(String billing_address) {
        this.billing_address = billing_address;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public float getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(float total_amount) {
        this.total_amount = total_amount;
    }
}
