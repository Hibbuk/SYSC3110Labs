public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    // Constructor with only name
    public BuddyInfo(String name) {
        this.name = name;
    }

    // Constructor with name, address, phone number
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return name + ", " + address + ", " + phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo object = new BuddyInfo("Homer", "Carleton", "613");
        System.out.println(object.getName());
    }
}
