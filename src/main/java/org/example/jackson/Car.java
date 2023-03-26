package org.example.jackson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sidharth
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String name;
    private String color;
    private String transmission;
    private int mileage;
}
