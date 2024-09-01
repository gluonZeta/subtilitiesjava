package gluon.projects.anonymousclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Personne {
    private String lastName;
    private String firstName;
    private int age;

    @Override
    public String toString() {
        return "Personne{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
