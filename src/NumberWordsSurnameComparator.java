import java.util.Comparator;

public class NumberWordsSurnameComparator implements Comparator<Person> {
    protected int maxCount;
    public NumberWordsSurnameComparator(int maxCount) {
        this.maxCount = maxCount;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] parts1 = o1.getSurname().split(" ");
        String[] parts2 = o2.getSurname().split(" ");
        if (parts1.length >= maxCount && parts2.length >= maxCount) {
            return o1.getAge() - o2.getAge();
        } else {
            return parts1.length != parts2.length ? parts1.length - parts2.length : o1.getAge() - o2.getAge();
        }
    }
}
