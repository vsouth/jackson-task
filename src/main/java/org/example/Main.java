package org.example;

import org.example.model.client.ClientInfo;
import org.example.model.person.PersonInfo;
import org.example.service.Mapper;
import org.example.service.reader.Reader;
import org.example.service.reader.XMLReader;
import org.example.service.writer.JSONWriter;
import org.example.service.writer.Writer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader<ClientInfo> xmlReader = new XMLReader(ClientInfo.class);
        ClientInfo clientInfo = xmlReader.readData("ClientInfo.xml");
        Mapper mapper = new Mapper();
        PersonInfo personInfo = mapper.mapClientToPerson(clientInfo);
        Writer<PersonInfo> jsonWriter = new JSONWriter();
        jsonWriter.writeData("output.json", personInfo);
    }
}