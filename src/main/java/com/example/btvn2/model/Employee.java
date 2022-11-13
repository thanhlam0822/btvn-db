package com.example.btvn2.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@Getter
@Setter
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;
    @Column(name = "employee_name")
    private String name;
    @Column(name = "employee_phone")
    private String phone;
    @Column(name = "employee_address")
    private String address;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "pass_word")
    private String passWord;
    @OneToOne(mappedBy = "employee")
    private Bill bill;

}
