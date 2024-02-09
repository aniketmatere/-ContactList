import java.util.ArrayList;
import java.util.List;

public class Contacts {

    private String name;
    private List<String> contacts = new ArrayList<>();

    public Contacts(String name, List<String> contacts) {
        this.name = name;
        this.contacts =  contacts;
    }


    public void addPhoneNumber(String personsName, List<String> personsContact) {
        for (String c : personsContact) {
            if (!doesExists(personsName, c)) {
                contacts.add(c);
            }
        }
        System.out.println("Contacts Added Successfully.");
        displayContactDetails();
        toString();
    }

    public void toDeletePhoneNumber(String phoneNumber) {
        if (contacts.contains(phoneNumber)) {
            contacts.remove(phoneNumber);
            System.out.println("Phone number deleted.");
        }
        else {
            System.out.println("Phone number not found.");
        }
    }

    public boolean doesExists(String personsName, String personsContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (personsName.equals(name)) {
                if (contacts.equals(personsContact)) {
                    return true;
                }
            }
        }
        return false;
    }
    public void displayContactDetails() {
        System.out.println("Name : " +name);
        System.out.println("Phone Number : " +String.join(", " +contacts));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Contacts c){
            if(name.equals(c.name)){
                for (int i = 0; i < contacts.size(); i++) {
                    if (c.contacts.get(i).equals(obj)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContactList {" +
                "Name = '" + name + '\'' + "Contacts = " + contacts +
                '}';
    }
}

