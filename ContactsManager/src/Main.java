


public class Main {
    public static void main(String [] args){
        ContactsManager myContactManager = new ContactsManager();
        Contact Ahmad = new Contact();
        Ahmad.name="Ahmad";
        Ahmad.email="ahmad@ahmad.com";
        Ahmad.phoneNumber="0900786010";
        myContactManager.addContact(Ahmad);
        System.out.println("Phone Number : " + myContactManager.searchContact("Ahmad").phoneNumber);
    }

}
