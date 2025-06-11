package com.apple.shop;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Notice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(length = 500)
    public String title;
    public Date date;
}
