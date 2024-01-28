package org.example.service.reader;

import java.io.IOException;

public abstract class Reader <T> {
    public abstract T readData(String path) throws IOException;
}
