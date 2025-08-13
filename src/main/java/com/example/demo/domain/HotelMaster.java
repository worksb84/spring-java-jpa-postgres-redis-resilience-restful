package com.example.demo.domain;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import jakarta.annotation.Nullable;
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
public class HotelMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameKor;
    private String nameEng;
    private String locationKor;
    private String locationEng;
    private String gradeCode;
    private Double averageRating;
    private String address;
    private Double defaultPrice;
    private Double discountRate;
    private Double latitude;
    private Double longitude;
    private Date createdAt;
    @Nullable
    private Date modifiedAt;
    private Date deletedAt;
}
