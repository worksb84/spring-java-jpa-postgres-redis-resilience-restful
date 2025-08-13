package com.example.demo.domain;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reservationCode;
    private Long userId;
    private String productTypeCode;
    private Long productMasterId;
    private Long productDetailId;
    private Double adultPrice;
    private Long adultCount;
    private Double childPrice;
    private Long childCount;
    private Double infantPrice;
    private Long infantCount;
    private Date createdAt;
}
