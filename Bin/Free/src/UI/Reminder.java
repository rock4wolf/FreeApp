/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author erik
 */
public class Reminder extends javax.swing.JFrame {
    private FileReader fr;
    private File file;
    private Scanner input;
    private String file_name;

    /**
     * Creates new form Reminder
     */
    public Reminder() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        time1 = new cambodia.raven.Time();
        TxtTitle = new javax.swing.JTextField();
        Lbl = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        BtnBack = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Btnshow = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        LblNombre = new javax.swing.JLabel();
        LblRepeat = new javax.swing.JLabel();
        LblHora = new javax.swing.JLabel();
        LblFecha = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        time1.setBackground(new java.awt.Color(87, 66, 107));
        time1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(time1);
        time1.setBounds(150, 300, 122, 80);
        jPanel1.add(TxtTitle);
        TxtTitle.setBounds(150, 210, 160, 28);

        Lbl.setText("Informar como");
        jPanel1.add(Lbl);
        Lbl.setBounds(50, 450, 90, 16);

        Title.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        Title.setText("Recordatorio");
        jPanel1.add(Title);
        Title.setBounds(130, 110, 110, 18);

        BtnBack.setText("Volver");
        BtnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBackMouseClicked(evt);
            }
        });
        jPanel1.add(BtnBack);
        BtnBack.setBounds(30, 500, 130, 60);

        BtnSave.setText("Guardar");
        BtnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSaveMouseClicked(evt);
            }
        });
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSave);
        BtnSave.setBounds(200, 500, 130, 60);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(150, 260, 160, 28);

        Btnshow.setText("mostrar recordatorios");
        Btnshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnshowMouseClicked(evt);
            }
        });
        jPanel1.add(Btnshow);
        Btnshow.setBounds(33, 568, 290, 50);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Una Vez", "Cada Hora", "Diarimente", "Semanal","Mensual","Anual"}));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(150, 390, 170, 26);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Notificacion","alarma" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(160, 440, 160, 26);

        LblNombre.setText("Titulo");
        jPanel1.add(LblNombre);
        LblNombre.setBounds(100, 220, 34, 16);

        LblRepeat.setText("Repetir");
        jPanel1.add(LblRepeat);
        LblRepeat.setBounds(90, 400, 50, 16);

        LblHora.setText("Hora");
        jPanel1.add(LblHora);
        LblHora.setBounds(100, 330, 34, 16);

        LblFecha.setText("Fecha");
        jPanel1.add(LblFecha);
        LblFecha.setBounds(100, 270, 34, 16);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free/Alarm.png"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(0, 0, 360, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBackMouseClicked
        // TODO add your handling code here:
        MainMenu MM = new MainMenu();
        MM.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BtnBackMouseClicked

    private void BtnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSaveMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnSaveMouseClicked

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
        try {
            /*
                    File file = new File("append.txt");
                    FileWriter fr = new FileWriter(file, true);
                    BufferedWriter br = new BufferedWriter(fr);
                    br.write("data");

                    br.close();
                    fr.close();
            */
            FileWriter fw=new FileWriter("C:\\Users\\sergi\\Documents\\orientada a objetos\\Proyecto poo\\Bin\\Free\\src\\free\\recordatorios.txt",true);
            java.util.Date fecha = jDateChooser1.getDate();
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String hora = time1.getSelectedTime();
            out.println(TxtTitle.getText()+" "+formato.format(fecha)+" "+hora+" "+(String) jComboBox1.getSelectedItem()+" "+(String) jComboBox2.getSelectedItem());
            bw.close();
            fw.close();
            out.close();
            
        } catch (Exception e) {
            System.out.println("Error E/S: "+e);
        }
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void BtnshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnshowMouseClicked
        // TODO add your handling code here:
    recordar record = new recordar();
    record.setVisible(true);
    this.setVisible(false);
    String temp= "";
    File file = new File("C:\\Users\\sergi\\Documents\\orientada a objetos\\Proyecto poo\\Bin\\Free\\src\\free\\recordatorios.txt");
        try {
            
            String st;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine()) != null) 
            temp += st+"\n";
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reminder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Reminder.class.getName()).log(Level.SEVERE, null, ex);
        }
    record.jTextArea1.setText(temp);
        
        
    }//GEN-LAST:event_BtnshowMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reminder().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnSave;
    private javax.swing.JButton Btnshow;
    private javax.swing.JLabel Lbl;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblHora;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblRepeat;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField TxtTitle;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private cambodia.raven.Time time1;
    // End of variables declaration//GEN-END:variables
}
