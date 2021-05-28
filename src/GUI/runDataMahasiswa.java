package GUI;

import javax.swing.*;

public class runDataMahasiswa {
    public static void main(String[] args) {
        JFrame jFram = new JFrame("From Biodata Mahasiswa");

        jFram.setContentPane(new DataMahasiswa().getRootPanel());
        jFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFram.setLocationRelativeTo(null);
        jFram.setSize(500,400);
        jFram.setVisible(true);



    }
}
