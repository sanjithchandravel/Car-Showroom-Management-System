
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sanjith
 */
public class UpdateCarbooking extends javax.swing.JFrame {

    /**
     * Creates new form Carbooking
     * @param user
     */
    public UpdateCarbooking(String user) {
        initComponents();
        setBounds(0, 0, 1536, 864);
         setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
         setExtendedState(MAXIMIZED_BOTH);
        ButtonGroup b = new ButtonGroup();
        b.add(jRadioButton1);
        b.add(jRadioButton2);
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","");
            //JOptionPane.showMessageDialog(null,"Connected");     
            Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);   
            ResultSet  rs = stmt.executeQuery("select * FROM carcollection");
            int i=0;
            jLabel10.setText(user);
            UpdateCarbooking.TheHandler handler = new UpdateCarbooking.TheHandler();
            jComboBox1.addItemListener(handler);
            jComboBox1.removeAllItems();
            Set<String> list = new HashSet<String>();
            while(rs.next())
            {
                String s2 = rs.getString("Brand");
                list.add(s2);
            }
            Iterator<String> it = list.iterator();
            while(it.hasNext())
            {
                jComboBox1.addItem(it.next());
            }
            rs.close();
            ResultSet rs1 = stmt.executeQuery("select * FROM book where Name='"+user+"'");
            while(rs1.next())
            {
                String s1 = rs1.getString("Name");
                if(s1.equals(user))
                {
                    jLabel11.setText(s1);
                    String s2 = rs1.getString("Gender");
                    if(s2.equals("Male"))
                    {
                        jRadioButton1.setSelected(true);
                        //jRadioButton2.setSelected(false);
                        
                    }
                    else if(s2.equals("Female"))
                    {
                        //jRadioButton1.setSelected(false);
                        jRadioButton2.setSelected(true);
                        
                    }
                    
                    String s3 = rs1.getString("MobileNo");
                    jTextField2.setText(s3);
                    String s4 = rs1.getString("Brand");
                    jComboBox1.setSelectedItem(s4);
                    String s5 = rs1.getString("Model");
                    jComboBox2.setSelectedItem(s5);
                    String s7 = rs1.getString("Deliveryplace");
                    jComboBox3.setSelectedItem(s7);
                    String s6 = rs1.getString("Email");
                    jTextField3.setText(s6);
                    i++;
                    
                }
                
            }
            rs1.close();
            stmt.close();
            if(i==0)
            {
                this.dispose();
                JOptionPane.showMessageDialog(null,"Error");
            }

        }
        catch(ClassNotFoundException e)
        {
          JOptionPane.showMessageDialog(null,"Not Connected");
        }
       catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private class TheHandler implements ItemListener{
    @Override
    public void itemStateChanged(ItemEvent event) {

         
               try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","");
            Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);   
            ResultSet  rs = stmt.executeQuery("select * FROM carcollection");
            jComboBox2.removeAllItems();
            Set<String> list1 = new HashSet<>();
            while(rs.next())
            {
                String s9 = rs.getString("Brand");
                if(event.getStateChange() == ItemEvent.SELECTED) 
                {
                    String s10 = jComboBox1.getSelectedItem().toString();
                    if(s9.equals(s10))
                    {
                        String s8 = rs.getString("Model");
                        list1.add(s8);
                        //jComboBox2.addItem(s8);
                    }
                }
            }
            Iterator<String> it1 = list1.iterator();
            while(it1.hasNext())
            {
                jComboBox2.addItem(it1.next());
            }
            rs.close();
            stmt.close();
            }
            catch(ClassNotFoundException e)
        {
          JOptionPane.showMessageDialog(null,"Not Connected");
        }
       catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }                        
     
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Car Booking Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 297, 54));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, 28));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Mobile No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Brand");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, 31));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Model");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 670, -1, -1));

        jTextField2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 164, 32));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Delivery Place");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 80, 28));

        jRadioButton1.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        jRadioButton2.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, -1, -1));

        jComboBox1.setForeground(new java.awt.Color(255, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 160, 30));

        jComboBox2.setForeground(new java.awt.Color(255, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 160, 30));

        jComboBox3.setForeground(new java.awt.Color(255, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sivakasi", "Aruppukottai", "Virudhunagar", "Madurai" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 160, 30));

        jTextField3.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 170, 30));

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Username:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, -1));

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("XXXXXXX");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 140, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("XXXXXXX");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 160, 30));

        jCheckBox1.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBox1.setText("Accept terms & condtitions");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, 180, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 20, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanjith\\Downloads\\speedometer.jpg")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","");
            Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);   
            ResultSet  rs = stmt.executeQuery("select * FROM Registration");
            String s4="";
            boolean i=true;
            while(rs.next())
            {
                String s1 = rs.getString("Username");
                if(s1.equals(jLabel10.getText()))
                {
                    s4 = rs.getString("MobileNo");
                    break;
                }
            }
                  Pattern p = Pattern.compile("^\\d{10}$");
            Matcher m = p.matcher(jTextField2.getText());
            System.out.println(m.matches());
             
             if(jTextField2.getText().length() != 10 || !m.matches())
             {
                JOptionPane.showMessageDialog(null, "Enter a valid mobile no", "Error", JOptionPane.ERROR_MESSAGE);
                i=false;
             }
             else if(!s4.equals(jTextField2.getText()))
             {
                 JOptionPane.showMessageDialog(null, "Enter the registeredd mobile no", "Error", JOptionPane.ERROR_MESSAGE);
                 i=false;
             }
             else if(!jRadioButton1.isSelected() && !jRadioButton2.isSelected())
                {
                    JOptionPane.showMessageDialog(null, "Fill the gender option", "Error", JOptionPane.ERROR_MESSAGE);
                    i=false;
                }
            if(jCheckBox1.isSelected() && i)
            {
                String text1 = jComboBox1.getSelectedItem().toString();
                String text2 = jComboBox2.getSelectedItem().toString();
                String text3 = jComboBox3.getSelectedItem().toString();
                Calendar ca = new GregorianCalendar();
                String day = ca.get(Calendar.DAY_OF_MONTH) + "";
                String month,year;
                if(ca.get(Calendar.MONTH) + 1 == 12)
                {
                    month = 1 + "";
                    year = ca.get(Calendar.YEAR) + 1 + "";
                }
                else
                {
                    month = ca.get(Calendar.MONTH) + 2 + "";
                    year = ca.get(Calendar.YEAR) + "";
                }
                if (day.length() == 1) {
                    day = "0" + day;
                }
                if (month.length() == 1) {
                    month = "0" + month;
                }

                String dd = year + "-" + month + "-" + day;

                //Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dd);
                if(jRadioButton1.isSelected() && jRadioButton2.isSelected())
                {
                    JOptionPane.showMessageDialog(null,"Select One");
                }
                else if(!jRadioButton1.isSelected() && !jRadioButton2.isSelected())
                {
                    JOptionPane.showMessageDialog(null,"Select One");
                }
                else
                {   String text4 = " ";
                    if(jRadioButton1.isSelected())
                    {
                        text4 = "Male";
                    }
                    else if (jRadioButton2.isSelected())
                    {
                        text4 = "Female";
                    }
                    String q1 = "Update book SET Gender = '"+text4+"',MobileNo='"+jTextField2.getText()+"',Brand='"+text1+"',Model='"+text2+"',Deliveryplace='"+text3+"',Email='"+jTextField3.getText()+"',Date='"+dd+"' where Name = '"+jLabel11.getText()+"'";
                    System.out.println(q1);
                    stmt.executeUpdate(q1);
                    JOptionPane.showMessageDialog(null,"Updated");
                    this.dispose();
                 
                }
                
            }
            else if(!jCheckBox1.isSelected())
            {
                JOptionPane.showMessageDialog(null,"Accept Terms and Condition");
            }
            else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jTextField3.getText()))) 
            {
            JOptionPane.showMessageDialog(null, "Enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            }
            /*else if(!s4.equals(s6))
            {
                JOptionPane.showMessageDialog(null,"Re-enter the Correct Password");
            }*/
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
            System.out.println(e);
        }
        catch(ClassNotFoundException e)
        {
          JOptionPane.showMessageDialog(null,"Not Connected");
        }
                        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
             if(jCheckBox1.isSelected())
        {
         JOptionPane.showInternalMessageDialog(null,"On registration, we expect you to provide our showroom with an accurate and complete information of the compulsory fields.\nWe also expect you to keep the information secure, specifically access passwords and payment information. \nKindly update the information periodically to keep your account relevant.\nShowroom will guarantee with your details","Terms & Condtions",INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Carbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCarbooking("XXXXX").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
