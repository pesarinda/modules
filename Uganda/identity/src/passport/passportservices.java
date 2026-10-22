package passport;

public class passportservices {
    public void issuePassport(passportdetails person) {
        System.out.println("Passport issued to " + person.name + " (" + person.passportNumber + ")");
    }
}
