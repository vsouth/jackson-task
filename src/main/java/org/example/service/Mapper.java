package org.example.service;

import org.example.model.client.ClientFindInfo;
import org.example.model.client.ClientInfo;
import org.example.model.client.Dul;
import org.example.model.person.FindPersonInfo;
import org.example.model.person.IdentityCard;
import org.example.model.person.PersonInfo;
import org.example.model.person.PersonName;

public class Mapper {
    public PersonInfo mapClientToPerson(ClientInfo clientInfo) {
        ClientFindInfo clientFindInfo = clientInfo.getClientFindInfo();
        Dul dul = clientFindInfo.getDul();
        int partyId = clientFindInfo.getPartyId();
        PersonName personName = new PersonName(
                dul.getLastName(),
                dul.getFirstName(),
                dul.getSecondName());
        IdentityCard identityCard = new IdentityCard(
                dul.getDocumentType(),
                dul.getSeries(),
                dul.getNumber());
        return new PersonInfo(new FindPersonInfo(personName, identityCard, partyId));
    }
}
