package org.example.service.writer;

import java.io.IOException;

public abstract class Writer <T> {
    public abstract void writeData(String path, T data) throws IOException;

}
