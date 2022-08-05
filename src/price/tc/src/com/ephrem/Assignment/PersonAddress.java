package price.tc.src.com.ephrem.Assignment;

public class PersonAddress {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;

    public void accessInfo(String firstN, String lastN, String emailAdd, String phoneNUm) {
        this.firstName = firstN;
        this.emailAddress = emailAdd;
        this.lastName = lastN;
        this.phoneNumber = phoneNUm;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void changeEmailAddress(String newEmail) {
        this.emailAddress = newEmail;
    }


    public void changePhoneNumber(String newNumber) {
        this.phoneNumber = newNumber;
    }
}


