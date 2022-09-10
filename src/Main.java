import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList();
        people.add(new Person("Даенерис", "Таргариен Бурерожденная Кхалиси Великого травяного моря", 28));
        people.add(new Person("Джон", "Аррен Лорд Орлиного Гнезда", 70));
        people.add(new Person("Джон", "Сноу", 30));
        people.add(new Person("Иван", "Безродный", 40));
        Collections.sort(people, new NumberWordsSurnameComparator(4));
        System.out.println(people);
    }
}
