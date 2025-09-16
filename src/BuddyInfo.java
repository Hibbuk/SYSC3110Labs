public class BuddyInfo {
    public BuddyInfo(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return "hello " + name;
    }

    public static void main(String[] args) {
        BuddyInfo object = new BuddyInfo("Homer");
        System.out.println(object.getName());
    }
}
