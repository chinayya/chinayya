package com.products.MobileApplication.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "mobile")
public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MOBILE_ID")
    private Long mobileId;
    @Column(name = "MOBILE_NAME")
    private String mobileName;
    @Column(name = "MOBILE_PRICE")
    private String mobilePrice;
    @Column(name = "MOBILE_RAM")
    private String mobileRam;
    @Column(name = "MOBILE_STORAGE")
    private String mobileStorage;
}
