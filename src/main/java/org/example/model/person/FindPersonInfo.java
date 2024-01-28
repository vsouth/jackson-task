package org.example.model.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FindPersonInfo {
    @JsonProperty("PersonName")
    private PersonName personName;
    @JsonProperty("IdentityCard")
    private IdentityCard identityCard;
    @JsonProperty("PartyID")
    private int partyID;

    public FindPersonInfo() {
    }

    public FindPersonInfo(PersonName personName, IdentityCard identityCard, int partyID) {
        this.personName = personName;
        this.identityCard = identityCard;
        this.partyID = partyID;
    }

    public PersonName getPersonName() {
        return personName;
    }

    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }

    public int getPartyID() {
        return partyID;
    }

    public void setPartyID(int partyID) {
        this.partyID = partyID;
    }
}
