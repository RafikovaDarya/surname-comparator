import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList();
        people.add(new Person("Даенерис", "Таргариен Бурерожденная Кхалиси Великого травяного моря", 28));
        people.add(new Person("Джон", "Аррен Лорд Орлиного Гнезда", 70));
        people.add(new Person("Джон", "Сноу", 30));
        people.add(new Person("Иван", "Безродный", 40));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите максимальное количество слов в фамилии," +
                " которое имеет смысл при сравнении");
        int maxCount = scanner.nextInt();

        Comparator<Person> personComparator = (o1, o2) -> {
            String[] parts1 = o1.getSurname().split(" ");
            String[] parts2 = o2.getSurname().split(" ");
            if (parts1.length >= maxCount && parts2.length >= maxCount) {
                return o1.getAge() - o2.getAge();
            } else {
                return parts1.length != parts2.length ? parts1.length - parts2.length : o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(people, personComparator);
        System.out.println(people);

    }


}


