public class user {
    public static void main(String[] args) {

        phonebook phonebook = new phonebook();
        phonebook.add("Ivan", 11);
        phonebook.add("Ivan", 111);
        phonebook.add("Ivan", 1111);
        phonebook.add("Ivan", 11111);
        phonebook.add("Olga",33);
        phonebook.add("Olga", 333);
        phonebook.add("Olga", 3333);
        phonebook.add("Petr", 22);
        phonebook.add("Petr", 222);
        phonebook.add("Petr", 2222);
        phonebook.add("Petr", 22222);
        phonebook.add("Petr", 222222);

        phonebook.showAll();
    
    }
}
