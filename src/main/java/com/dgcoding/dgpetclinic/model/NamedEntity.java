package com.dgcoding.dgpetclinic.model;

public class NamedEntity extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamedEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
