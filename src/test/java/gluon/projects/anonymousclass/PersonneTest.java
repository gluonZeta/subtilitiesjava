package gluon.projects.anonymousclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonneTest {

    @Test
    void testCreateAnonymousClass() {
        Personne personne = new Personne() {
            @Override
            public String toString() {
                return "Last Name:" + this.getLastName();
            }
        };
        personne.setFirstName("Andraina");
        personne.setLastName("RAJAONARISATA");
        personne.setAge(24);
        System.out.println(personne.toString());
        Assertions.assertNotNull(personne);
    }

}