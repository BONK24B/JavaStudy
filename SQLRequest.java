import java.util.Scanner;

public class SQLRequest {
    
//     Дана строка sql-запроса "select * from students where ". Сформируйте
//      часть WHERE этого запроса, используя StringBuilder.
//       Данные для фильтрации приведены ниже в виде json строки.

// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow" "age":"null"}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your country: ");
        String country = scanner.nextLine();
        System.out.println("Enter your city: ");
        String city = scanner.nextLine();
        System.out.println("Enter your age: ");
        String age = scanner.nextLine();
        scanner.close();

        StringBuilder where = new StringBuilder();
        if (name == null || name.equals(""))
            where.append("{name : null, ");
        else
            where.append("{name : " + name + ", ");
        if (country == null || country.equals(""))
            where.append("country : null, ");
        else
            where.append("country : " + country + ", ");
        if (city == null || city.equals(""))
            where.append("country : null, ");
        else
            where.append("city : " + city + ", ");
        if (age == null || age.equals(""))
            where.append("age : null}");
        else
            where.append("age : " + age + "}");

        System.out.println(where);
    }
}
