package com.example.btvn2.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@Table(name = "bill_import")
public class BillImport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_import_id")
    private int id;
    @Column(name="date_buy")
    private String dateBuy;
    @Column(name = "total")
    private int total;
    @Column(name="buy_price")
    private int buyPrice;
    @Column(name = "amount")
    private int amount;
    @Column(name = "unit")
    private String unit;
    @Column(name = "buy_price_detail")
    private int buyPriceDetail;
    @OneToMany(mappedBy = "billImport")
    private List<Product> productList;
    @OneToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;


}
