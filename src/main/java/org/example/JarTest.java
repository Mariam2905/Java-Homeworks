package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class JarTest {

    public boolean validateDate(LocalDate date) {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(3);
        return date.plusDays(3).equals(futureDate);
    }

    public LocalDate validateExpirationDate(LocalDate expirationDate){
        LocalDate currentDate = LocalDate.now();
        currentDate.format(DateTimeFormatter.ofPattern("MM/yy"));
        if(currentDate.isBefore(expirationDate)) {
            return  expirationDate;
        } else return null;
    }

    public static void main(String[] args) {

        JarTest test = new JarTest();

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = currentTime.format(formatter);
        System.out.println(formattedTime);



    }


    //    public String expiredTour(LocalDate tourDate) {
//        TourServiceImpl tourService = new TourServiceImpl();
//        if (LocalDate.now().isAfter(tourDate)) {
//            return tourService.deleteById(Long id);
////            return "Tour is deleted.";
//        } else
//        return null;
//    }

}
