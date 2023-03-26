package org.example.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;

/**
 * @author Sidharth
 */
public class Parser {

    private ObjectMapper objectMapper;

    public Parser(){
        this.objectMapper = new ObjectMapper();
    }
    @SneakyThrows
    public Object jsonToObject(File jsonFile, Class objClass){
        return objectMapper.readValue(jsonFile,objClass);
    }

    @SneakyThrows
    public void objectToJson(File file, Object obj){
        objectMapper.writeValue(file, obj);
    }
}
