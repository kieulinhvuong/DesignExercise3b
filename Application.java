public class Application {
    private String name;
    private String homeAddress;

    public Application (String name, String homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    public String getName() {
        return name;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String toString() {
        return String.format("Name: %s, Home Address: %s\n", name, homeAddress);
    }
}