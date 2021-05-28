package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataMahasiswa {
    private JTextField textnama;
    private JTextField textnim;
    private JButton Keluarbutton;
    private JButton Cekbutton;
    private JPanel RootPanel;
    private JLabel Hasil;
    private JLabel Hasil2;
    private JLabel Hasil3;
    private JLabel Hasil4;
    private JLabel Hasil5;
    private JLabel Hasil6;
    private JLabel Hasil7;
    private JLabel Hasil8;
    private JLabel labelHasil;


    public DataMahasiswa() {
        Cekbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Nama = textnama.getText();
                String NIM = textnim.getText();

                Mahasiswa mhs = new Mahasiswa();

                    mhs.setnama(Nama);
                    mhs.setnim(NIM);

                    Hasil.setText("Nama\t:\t" + mhs.getnama());
                    Hasil2.setText("NIM\t:\t" + mhs.getnim());
                    Hasil3.setText("Jenjang Pendidikan\t:\t" + mhs.getJenjangPendidikan());
                    Hasil4.setText("Tahun Masuk\t:\t" + mhs.getTahunMasuk());
                    Hasil5.setText("Fakultas\t:\t" + mhs.getFakultas());
                    Hasil6.setText("Jurusan\t:\t" + mhs.getJurusan());
                    Hasil7.setText("Jenis Kelamin\t:\t" + mhs.getJenisKelamin());
                    Hasil8.setText("Nomor Urut Mahasiswa\t:\t" + mhs.getNomorUrutMHS());

                    labelHasil.setText(mhs.toString());

            }
        });
        Keluarbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getRootPanel() {
        return RootPanel;
    }
}
