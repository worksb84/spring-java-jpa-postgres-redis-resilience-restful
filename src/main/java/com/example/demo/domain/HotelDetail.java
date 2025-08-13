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
public class HotelDetail {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long hotelMasterId;
    private String nameKor;
    private String nameEng;
    private String descriptionKor;
    private String descriptionEng;
    private String roomCode;
    private double defaultPrice;
    private double discountRate;
    private Integer minPeople;
    private Integer maxPeople;
    private String available;
    private String facilities;
    private String chackinAt;
    private String chackOutAt;
    private Date createdAt;
    private Date modifiedAt;
    private Date deletedAt;
}
