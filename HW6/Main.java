package HW6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
//  Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
//  Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
//  фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//   Например: “Введите цифру, соответствующую необходимому критерию: 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
//  фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>(); 

        Laptop myLaptop_1 = new Laptop(512, "ssd", 16, "Windows", "black");
        Laptop myLaptop_2 = new Laptop(256, "hdd", 8, "Windows", "white");
        Laptop myLaptop_3 = new Laptop(1024, "ssd", 16, "Windows", "grey");
        Laptop myLaptop_4 = new Laptop(512, "ssd", 16, "Linux", "black");
        Laptop myLaptop_5 = new Laptop(1024, "hdd", 16, "Linux", "grey");
        Laptop myLaptop_6 = new Laptop(1024, "ssd", 16, "macOS", "space grey");

        laptops.add(myLaptop_1);
        laptops.add(myLaptop_2);
        laptops.add(myLaptop_3);
        laptops.add(myLaptop_4);
        laptops.add(myLaptop_5);
        laptops.add(myLaptop_6);

        System.out.println("Your laptop is: \n" + Filtration() + "\n");
        for (Laptop laptop : laptops) {
            System.out.println(laptop + "\n");
        }
        
    }

    public static Laptop Filtration(){
        Laptop myLaptop = new Laptop(0, "ssd", 0, null, null);
        
        Map<Integer, String> elements = new HashMap<>();
        elements.put(1, "RAM");
        elements.put(2, "ROM Capacity");
        elements.put(3, "Operation System");
        elements.put(4, "Color");

        Map<Integer, Integer> romCapacity = new HashMap<>();
        romCapacity.put(1, 256);
        romCapacity.put(2, 512);
        romCapacity.put(3, 1024);

        Map<Integer, Integer> ramCap = new HashMap<>();
        ramCap.put(1, 8);
        ramCap.put(2, 16);

        Map<Integer, String> os = new HashMap<>();
        os.put(1, "Windows");
        os.put(2, "Linux");
        os.put(3, "macOS");

        Map<Integer, String> color = new HashMap<>();
        color.put(1, "black");
        color.put(2, "white");
        color.put(3, "grey");
        color.put(4, "space grey");

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < elements.size(); i++) {
            if (i == 0){
                System.out.println("Choose ROM capacity: 1 - 256Gb 2 - 512Gb 3-1024Gb");
                int capasity = scan.nextInt();
                myLaptop.romCapacity = romCapacity.get(capasity);
            }
            if (i == 1){
                System.out.println("Choose RAM: 1 - 8Gb 2 - 16Gb");
                int myRAM = scan.nextInt();
                myLaptop.ram = ramCap.get(myRAM);
            }
            if (i == 2){
                System.out.println("Choose operation systen: 1 - Windows, 2 - Linux, 3 - macOS");
                int myOS = scan.nextInt();
                myLaptop.os = os.get(myOS);
            }
            if (i == 3){
                System.out.println("Choose color: 1 - black, 2 - white, 3 - grey, 4 - space grey");
                int myColor = scan.nextInt();
                myLaptop.color = color.get(myColor);
            }
            
        }
        scan.close();

        return myLaptop;
    }
}
