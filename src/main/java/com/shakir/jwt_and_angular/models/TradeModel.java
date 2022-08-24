package com.shakir.jwt_and_angular.models;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Trades")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TradeModel {

    @Id
    private int id;

    private String symbol;

    private double price;

    private double quantity;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date trade_time;



}