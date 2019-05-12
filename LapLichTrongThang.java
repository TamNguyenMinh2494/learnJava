package JavaTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LapLichTrongThang {
    public static void main(String args[]){


        LocalDate date = LocalDate.now();//tgian hiện tại của hệ thống
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today-1);//quay lai ngay dau thang
        DayOfWeek dow = date.getDayOfWeek();
        int value = dow.getValue(); //ngay dau tien cua tuan
        System.out.println("Mon Tue Wed Thus Fri Sat Sun ");
        for (int i=1; i<value;i++)
        {
            System.out.print("    ");
        }
        while(date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1)
                System.out.println("");
        }
        System.out.println("\n");
    }
}

