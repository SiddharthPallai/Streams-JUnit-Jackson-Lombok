package org.example.jackson;

import java.io.File;
import java.nio.file.Paths;
import java.util.Map;

/**
 * @author Sidharth
 */
public class Main {
    public static void main(String[] args) {

        Parser parser = new Parser();

//        Car c = new Car("Volkswagon","red","manual",16);
//        File f = new File("Car.json");
//        parser.objectToJson(f,c);

        File f = new File("Car.json");
        Car c1 = (Car) parser.jsonToObject(f,Car.class);
        System.out.println("Car = "+c1);

//        Map<?,?> m = (Map<?, ?>) parser.jsonToObject(f, Map.class);
//        System.out.println("Car Map = "+ m);
    }
}