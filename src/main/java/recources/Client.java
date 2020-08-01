package recources;

public class Client {
    String clientID;
    String firstName;
    String lastName;
    Address address;
    ClientStatus status;

    public Client(String clientID, String firstName, String lastName, Address address, ClientStatus status) {
        this.clientID = clientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID='" + clientID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", status=" + status +
                '}';
    }
}
