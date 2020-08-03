package com.tuto2.sp_th.sp_th.entity;


import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "brand", nullable = false)
    private String brand;
    @Column(name = "madein", nullable = false)
    private String madein;
    @Column(name = "price", nullable = false)
    private float price;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
