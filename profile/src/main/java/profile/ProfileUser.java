package profile;

import java.time.LocalDate;

public class ProfileUser {
    private static long idProfileUser = 0; //Изменить генерацию id Пользователя
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthDate;


    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    public ProfileUser(String firstName, String middleName, String lastName) {
        this(firstName, lastName);
        this.middleName = middleName;

    }

    public ProfileUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        idProfileUser++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static long getIdProfileUser() {
        return idProfileUser;
    }
}
