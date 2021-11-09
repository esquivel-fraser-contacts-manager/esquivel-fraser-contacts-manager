public class Contacts {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contacts(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }


    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
