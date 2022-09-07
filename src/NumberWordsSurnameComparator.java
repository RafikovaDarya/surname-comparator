import java.util.Comparator;

public class NumberWordsSurnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        String[] parts1 = o1.getSurname().split(" ");
        String[] parts2 = o2.getSurname().split(" ");
        if (parts1.length >= 4 && parts2.length >= 4) {
            return o1.getAge() - o2.getAge();
        } else {
            return parts1.length != parts2.length ? parts1.length - parts2.length : o1.getAge() - o2.getAge();
        }
    }
}
