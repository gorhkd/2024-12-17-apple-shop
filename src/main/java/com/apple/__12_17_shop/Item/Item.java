package com.apple.__12_17_shop.Item;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (length = 200)
    private String title;

    @Column
    private Integer price;

    private LocalDateTime createDate;

}
