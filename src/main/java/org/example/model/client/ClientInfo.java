package org.example.model.client;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "clientInfo")
public class ClientInfo {
    private ClientFindInfo clientFindInfo;

    public ClientInfo() {
    }

    public ClientFindInfo getClientFindInfo() {
        return clientFindInfo;
    }

    public void setClientFindInfo(ClientFindInfo clientFindInfo) {
        this.clientFindInfo = clientFindInfo;
    }
}
