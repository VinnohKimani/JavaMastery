package OOP;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


class DatesAndTime{
    public static void main(String[] args){
//        LocalTime time = LocalTime.now();


//        System.out.println(time);
        LocalDateTime dateTime =  LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);
    }
}