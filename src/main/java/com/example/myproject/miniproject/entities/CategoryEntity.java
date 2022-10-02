package com.example.myproject.miniproject.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    @Column(name = "category_id")
    private String categoryId;

    @Column(nullable = false,unique = true)
    private String name;
}
