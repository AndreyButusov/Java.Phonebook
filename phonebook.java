import java.lang.reflect.Array;
import java.util.*;
import javax.print.attribute.IntegerSyntax;

public class phonebook {
    private static Map<String, HashSet<Integer>> phonebook = new HashMap<>();

    public phonebook(){

    }

    public phonebook(Map<String, HashSet<Integer>> phonebook) {
        this.phonebook = phonebook;
    }
     public <E> phonebook(String name, HashSet<E> numbers) {
        this.phonebook.put(name, (HashSet<Integer>) numbers);
    }

    @Override
    public String toString() {
        return "Tel{" + "db=" + phonebook + '}';
    }

    public void add(String name, Integer phoneNum) {
        if (phonebook.get(name) != null) {
            phonebook.get(name).add(phoneNum);
        } else {
            phonebook.put(name, new HashSet<>());
            phonebook.get(name).add(phoneNum);
        }
    }

    public void findPhone(String name) {
        if (phonebook.get(name) != null) {
            System.out.println(name + ":" + phonebook.get(name));
        } else {
            System.out.println(new HashSet<>());
        }

    }

    public void removePhone(String name, Integer phoneNum) {
        if (phonebook.get(name) != null) {
            if (phonebook.get(name).remove(phoneNum))
                phonebook.get(name).remove(phoneNum);
            else {
                System.out.println("Номер не принадлежит абоненту");
            }
        } else {
            System.out.println("Имя не найдено");
        }
    }

    public void showAll() {
        List<Map.Entry<String, HashSet<Integer>>> sortList = new ArrayList<>(phonebook.entrySet());
        sortList.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        for (Map.Entry<String, HashSet<Integer>> entry : sortList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}