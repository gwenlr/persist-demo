package com.example.persistdemo.dog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DOG")
public class Dog extends ParentEntity {


    @Column(name = "name")
    private String name;

    public Dog() {
    }

    public Dog(int id, String name) {
        setId(id);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
