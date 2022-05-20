package com.example.marketplace.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vespa")
public class Vespa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String img;

    private int year;

    private String description;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vespa() {
    }

    public Vespa(Long id, String name, String img, int year, String description) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.year = year;
        this.description = description;
    }

    public Vespa(String name, String img, int year, String description) {
        this.name = name;
        this.img = img;
        this.year = year;
        this.description = description;
    }
}
