package main.session6;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DemoTime {
    public static void main(String[] args){
//        LocalDate ld1 = LocalDate.now();
//        System.out.println(ld1);
//        LocalDate ld2 = ld1.plusDays(1);
//        System.out.println(ld2);
//        LocalDate ld3 = ld1.plusYears(1);
//        LocalDate ld4 = ld1.plusDays(30);
//        // hết hạn vào ngày 19/5/2026
//        LocalDate ld5 = LocalDate.parse("2026-05-19");
//        LocalDate ld6 = ld5.plusMonths(12);
//        System.out.println(ld6);
//        // hết hạn vào ngày 19/2/2026
//        LocalDate ld7 = LocalDate.of(2026,2,19);
//
//        LocalDateTime lt1 = LocalDateTime.now();
//        System.out.println(lt1);
//        LocalDateTime lt2 = lt1.plusHours(1);
//        System.out.println(lt2);
//        LocalDateTime lt3 = LocalDateTime.parse("2026-02-28T12:00:00");
//        System.out.println(lt3);
//        LocalDateTime lt4 = LocalDateTime.of(2026,2,13,13,30,15,19);
//
//        System.out.println(lt4.getDayOfYear());
//        System.out.println(lt4.getDayOfWeek());
        // nhập ngày sinh, xem hôm đấy là thứ mấy
        // kiểm tra xem 9 tháng 10 ngày trước là thứ mấy

        LocalDate ns = LocalDate.parse("2002-12-21");
        System.out.println(ns.getDayOfWeek());
        LocalDate ns2 = ns.minusMonths(9).minusDays(10);
        System.out.println(ns2);
        System.out.println(ns2.getDayOfWeek());
    }
}
//SATURDAY
//2002-03-11
//MONDAY