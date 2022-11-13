package com.example.btvn2.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bill_detail")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bill_id")
    private int id;
    @Column(name="customer")
    private String nameCustomer;
    @Column(name = "date_buy")
    private String dateBuy;
    @Column(name = "total")
    private int totalPrice;
    @Column(name="employee_name")
    private String employeeName;
    @OneToMany(mappedBy = "bill")

    List<Product>products;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
