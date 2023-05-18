package project;

import java.util.ArrayList;
import java.util.Date;
import project.Room;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Asmz
 */
public class Data {

    public static ArrayList<Room> rooms = new ArrayList<>();
    public static ArrayList<Customers> customers = new ArrayList<>();

    public static void LoadTestDataRooms() {
        Room newRoom1 = new Room(1, true, "single", 10);
        rooms.add(newRoom1);

        Room newRoom2 = new Room(2, false, "Double", 20);
        rooms.add(newRoom2);

        Room newRoom3 = new Room(3, false, "single", 30);
        rooms.add(newRoom3);

        Room newRoom4 = new Room(4, true, "Triple", 40);
        rooms.add(newRoom4);

        Room newRoom5 = new Room(5, false, "Double", 40);
        rooms.add(newRoom5);
    }

    public static void LoadTestDataCustommers() {
        Customers newCustomer1 = new Customers("Asma Alrefaei", 12345, "Yemen", false, "asma,alrefaei@gamail.com", 879878, "Istanbul");
        customers.add(newCustomer1);

        Customers newCustomer2 = new Customers("Saif", 47874, "Syris", true, "saif@gamail.com", 864677, "Izmir");
        customers.add(newCustomer2);

        Customers newCustomer3 = new Customers("Rumaysa", 748653, "Turkeye", false, "rumaysa@gamail.com", 534436, "Ankara");
        customers.add(newCustomer3);

        Customers customer = new Customers("John Smith", 1234567890, "USA", true, "john.smith@email.com", 12345, "123 Main St");
        //(new Date());

    }
}
