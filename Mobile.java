import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Mobile {

    ArrayList<Contacts> contactList = new ArrayList<>();

    public static ArrayList<Contacts> AddContact(List<Contacts> contactList, Contacts contact){
        ArrayList<Contacts> contactListNew = new ArrayList<>();
        if (!contactList.contains(contact)){
            contactList.add(contact);
        }
        else {
            System.out.println("Already There!");
        }
        return (ArrayList<Contacts>) contactList;
    }


    public static void display(List<Contacts> arrayList){
        ArrayList<String> str = new ArrayList<>();

        int i = 0;
        for (Contacts c: arrayList) {
            str.add(c.toString());
        }
        str.sort(Comparator.naturalOrder());
        System.out.println(str);
//        System.out.println(arrayList);
    }

}

