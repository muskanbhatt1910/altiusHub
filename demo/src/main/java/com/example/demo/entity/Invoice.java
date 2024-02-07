package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Invoice {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "invoice", cascade = CascadeType.ALL)
    private InvoiceHeader invoiceHeader;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
    private List<InvoiceItem> invoiceItemList;

    @OneToOne(mappedBy = "invoice", cascade = CascadeType.ALL)
    private InvoiceBillSundry invoiceBillSundry;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
    }

    public List<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }

    public InvoiceBillSundry getInvoiceBillSundry() {
        return invoiceBillSundry;
    }

    public void setInvoiceBillSundry(InvoiceBillSundry invoiceBillSundry) {
        this.invoiceBillSundry = invoiceBillSundry;
    }
}
