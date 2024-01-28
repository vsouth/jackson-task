package org.example.service.reader;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XMLReader<T> extends Reader<T> {
    private final XmlMapper xmlMapper = new XmlMapper();
    private final Class<T> type;

    public XMLReader(Class<T> type) {
        this.type = type;
    }

    @Override
    public T readData(String path) throws IOException {
        File file = new File(path);
        return xmlMapper.readValue(file, type);
    }
}
