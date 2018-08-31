


public class Main {
    public static void main(String [] args){
        ContactsManager myContactManager = new ContactsManager();
        Contact Ahmad = new Contact();
        Contact Ahmad2 = new Contact();

        Ahmad.setName("Ahmad");
        Ahmad.setEmail("ahmad@ahmad.com");
        Ahmad.setNumber("0900786010");
        myContactManager.addContact(Ahmad);

        Ahmad2.setName("Ahmad2");
        Ahmad2.setEmail("ahmad2@ahmad2.com");
        Ahmad2.setNumber("0000000000");
        myContactManager.addContact(Ahmad2);

        System.out.println("Phone Number : " + myContactManager.searchContact("Ahmad").getNumber());
    }

}
