package com.autoadda.part_api.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class Product {
    private String title;
    private String description;
    private String category;
    private String image;
    private List<String> tags;
    private int year;
    private double price;
}
