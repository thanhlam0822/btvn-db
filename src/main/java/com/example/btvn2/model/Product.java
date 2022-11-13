package com.example.btvn2.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter

@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_code")
    private int productCode;
    @Column(name = "name_product")
    private String nameProduct;
    @Column(name = "retail_amount")
    private int retailAmount;
    @Column(name = "whole_sale_amount")
    private int wholeSaleAmount;
    @Column(name = "unit")
    private String unit;
    @Column(name = "bought_price")
    private int boughtPrice;
    @Column(name = "sell_price" )
    private int sellPrice;
    @Column(name = "average")
    private int average;
    @Column(name = "buy_date")
    private String buyDate;
    @Column(name = "sell_date")
    private String sellDate;
    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;
    @ManyToOne
    @JoinColumn(name = "bill_import_id")
    private BillImport billImport;

}

