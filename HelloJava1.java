package JavaTest;

import javax.swing.*;
import java.awt.*;

public class HelloJava1 extends JFrame {
    public HelloJava1(){
        JLabel label = new JLabel("Hello World",SwingConstants.CENTER);//tạo đối tượng và set vị trí hiển thị là center
        label.setForeground(Color.green);
        label.setFont(new Font(Font.SERIF,Font.ITALIC,40));//thay đổi kiểu chữ, định dạng, size : 40px
        this.setSize(400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//hiển thị button Close
        this.setLocationRelativeTo(null);//để hiển thị box ở chính giữa, nếu k thì nó sẽ ở góc trái trên cùng
        this.add(label);

    }

    public static void main(String[] args) {
        new HelloJava1().setVisible(true);
    }

}
