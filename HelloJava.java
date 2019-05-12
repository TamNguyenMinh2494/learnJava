package JavaTest;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class HelloJava {
    /*public String ten;
    public HelloJava(){
        System.out.println("Hello World");
    }*/ //Constructor của Cách 4

    //public static final String Falcuty = "Hello World"; //Cách 5
    public static void main(String args[]){

        //System.out.println("Hello World"); //Cách 1

        /*String n;
        Scanner Input = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = Input.nextLine();
        System.out.println(n);*/ //Cách 2

        //HelloJava a = new HelloJava(); //Cách 4

        //System.out.println(Falcuty); //Cách 5

        //Cách 3 từ đây trở xuống. Các bạn không cần tạo sẵn file trong ổ D
        /*try{
            //tao doi tuong va lien ket file du lieu
            File f = new File("D:/Java/HelloWorld.txt");
            FileWriter fw = new FileWriter(f);
            //ghi du lieu xuong file vua khoi tao
            fw.write("Hello World");
            //dong luong
            fw.close();
        }catch (IOException ex) {
            System.out.print("Loi ghi file "+ex);
        }*/

        try{
            //tao doi tuong va lien ket voi file da tao
            File f = new File("D:/Java/HelloWorld.txt");
            FileReader fr = new FileReader(f);
            //doc du lieu
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null ){
                System.out.println(line);
            }
            //dong luong
            fr.close();
            br.close();
        }catch (Exception ex){
            System.out.println("Loi doc file "+ex);
        }
    }
}
