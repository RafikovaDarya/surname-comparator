import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList();
        people.add(new Person("Даенерис", "Таргариен Бурерожденная Кхалиси Великого травяного моря", 10));
        people.add(new Person("Джон", "Аррен Лорд Орлиного Гнезда", 70));
        people.add(new Person("Джон", "Сноу", 14));
        people.add(new Person("Иван", "Безродный", 40));


        Predicate<Person> age = person -> person.getAge() < 18;
        people.removeIf(age);
        Collections.sort(people, new NumberWordsSurnameComparator(4));
        System.out.println(people);
    }
}
