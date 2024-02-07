package com.example.demo.restController;

import com.example.demo.dao.InvoiceRepository;
import com.example.demo.entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class invoiceController {

    @Autowired
    InvoiceRepository invoiceRepository;

    @PostMapping("/invoice/create")
    public Invoice create(@RequestBody Invoice invoice){
        invoice.setId(0L);
        invoiceRepository.save(invoice);
        return invoice;
    }

    @PutMapping("/invoice/update")
    public Invoice update(@RequestBody Invoice invoice){
        invoiceRepository.save(invoice);
        return invoice;
    }

    @PostMapping("/invoice/delete")
    public String delete(@RequestBody Long invoiceId){
        invoiceRepository.deleteById(invoiceId);
        return "Invoice deleted successfully";
    }

    @GetMapping("/invoice/{invoiceId}")
    public Invoice get(@PathVariable Long invoiceId){
        return invoiceRepository.getReferenceById(invoiceId);
    }

    @GetMapping("/invoice")
    public List<Invoice> getAll(){
        List<Invoice> invoiceList = invoiceRepository.findAll();
        return invoiceList;
    }
}
