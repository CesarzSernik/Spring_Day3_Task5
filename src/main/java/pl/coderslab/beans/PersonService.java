package pl.coderslab.beans;

import org.springframework.stereotype.Component;

@Component
public class PersonService {

    private PersonRepository personRepo;

    public PersonRepository getPersonRepo() {
        return personRepo;
    }

    public void setPersonRepo(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    public PersonService(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }
}
