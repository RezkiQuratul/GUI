package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BiodataMahasiswa {

    private JTextField textNama;
    private JTextField textNim;
    private JTextField textJP;
    private JTextField textTM;
    private JTextField textFakul;
    private JTextField textJur;
    private JTextField textJK;
    private JTextField textNoUr;
    private JButton ButtonSave;
    private JPanel rootPanel;
    private JTextArea labelHasil;


    public BiodataMahasiswa() {
        ButtonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Nama = textNama.getText();
                String Nim = textNim.getText();
                String JP = textJP.getText();
                String TM = textTM.getText();
                String Fakul = textFakul.getText();
                String Jur = textJur.getText();
                String JK = textJK.getText();
                String NoUr = textNoUr.getText();


                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(Nama);
                mhs.setNim(Nim);
                mhs.setJP(JP);
                mhs.setTM(TM);
                mhs.setFakul(Fakul);
                mhs.setJur(Jur);
                mhs.setJK(JK);
                mhs.setNoUr(NoUr);

                labelHasil.setText(mhs.toString());

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
