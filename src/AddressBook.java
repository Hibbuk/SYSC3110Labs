import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        // Lab step 9: Create a BuddyInfo and add/remove it
        BuddyInfo homer = new BuddyInfo("Homer");
        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy(homer);
        addressBook.removeBuddy(homer);
    }
}
