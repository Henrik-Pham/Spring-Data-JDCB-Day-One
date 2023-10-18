package com.example.jdbc_day_one.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
public class Part {

    @Id
    private Integer id;
    private String name;
    private Integer quantity;

    public Part(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
