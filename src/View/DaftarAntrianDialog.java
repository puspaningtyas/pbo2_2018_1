/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Satrio
 */
public class DaftarAntrianDialog extends JDialog{
    private static JLabel judulLabel, namaLabel;
    private static JTextField namaText;
    private static JButton saveButton;
    
    public void init(){
        this.setLayout(null);
        
        judulLabel = new JLabel("DAFTAR PASIEN");
        judulLabel.setBounds(100,-30,100,90);
        this.add(judulLabel);
        
        namaLabel = new JLabel("NAMA");
        namaLabel.setBounds(10,10,100,90);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText.getText();
        namaText.setBounds(100,40,150,30);
        this.add(namaText);
    }
    
    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
}
    public DaftarAntrianDialog() {
        init();
    }
    
}
