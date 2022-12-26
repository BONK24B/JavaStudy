package HW5;

import java.util.HashMap;

public class PhoneBook {
    // Реализуйте структуру телефонной книги с помощью HashMap,
    //  учитывая, что 1 человек может иметь несколько телефонов.
    public static void main(String[] args) {
        HashMap<String, String> employees = new HashMap<>();

        employees.put("Alexander Kuvaev", "+73535797955, +75444567710");
        employees.put("Teodor Kaczynski", "+14562156239");
        employees.put("Ivan Gromov", "+7842454456");
        employees.put("Andrej Vlasov", "+754524545557");
        employees.put("Konstantin Markov", "+512325561");

        System.out.println(employees);
    }
}
