package GUI;

import javax.swing.*;

public class runBiodataMahasiswa {
    public static void main(String[] args) {
        JFrame jFram = new JFrame("From Biodata Mahasiswa");

        jFram.setContentPane(new BiodataMahasiswa().getRootPanel());
        jFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFram.setLocationRelativeTo(null);
        jFram.setSize(500,400);
        jFram.setVisible(true);

    }
}
