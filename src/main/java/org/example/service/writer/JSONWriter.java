package org.example.service.writer;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class JSONWriter<T> extends Writer<T> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void writeData(String path, T data) throws IOException {
        File file = new File(path);
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        objectMapper.writeValue(file, data);
    }
}
