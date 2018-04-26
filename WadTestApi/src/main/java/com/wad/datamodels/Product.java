/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wad.datamodels;

/**
 *
 * @author catalin
 */
public class Product 
{
    private Long id;
    private String name;
    private String description;
    private double price;

    public Product()
    {
    
    }
    
    public Product(Long id, String name, String desc, double price)
    {
        this.setId(id);
        this.setName(name);
        this.setDescription(desc);
        this.setPrice(price);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}