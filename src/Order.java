
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sanjith
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Order
     * @param mobile
     */
    public Order(String mobile) {
        initComponents();
        setBounds(0, 0, 1536, 864);
        //jLabel4.setText(user);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","");
            //JOptionPane.showMessageDialog(null,"Connected");     
            Statement stmt;   
            stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
            int i=0;
            ResultSet rs1;
            rs1 = stmt.executeQuery("select * FROM testdrive ");
            //DefaultTableModel model = (DefaultTableModel)testdrive.getModel();
            while(rs1.next())
            {
                String s1 = rs1.getString("MobileNo");
                if(s1.equals(mobile))
                {
                    String s4 = rs1.getString("Brand");
                    String s5 = rs1.getString("Model");
                    System.out.println(s4);
                    String s7 = rs1.getString("Date");
                    jLabel31.setText(rs1.getString("Brand"));
                    jLabel32.setText(s5);
                    jLabel35.setText(s1);
                    jLabel37.setText(s7);
                    i++;
                    System.out.println(i);
                    break;
                }
            }

            if(i==0)
            {
                jLabel31.setText("    -");
                    jLabel32.setText("    -");
                    jLabel35.setText("    -");
                    jLabel37.setText("    -");
            }
            rs1.close();
            stmt.close();
        }
            catch(ClassNotFoundException e)
        {
          JOptionPane.showMessageDialog(null,"Not Connected");
        }
       catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
       try{
            int j=0;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","");
            //JOptionPane.showMessageDialog(null,"Connected");     
            Statement stmt;   
            stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs3;
            rs3 = stmt.executeQuery("select * FROM service ");
            
            while(rs3.next())
            {
                String s1 = rs3.getString("MobileNo");
                if(s1.equals(mobile))
                {
                    String s4 = rs3.getString("Brand");
                    String s5 = rs3.getString("Model");
                    String s7 = rs3.getString("Date");
                    jLabel21.setText(s4);
                    jLabel22.setText(s5);
                    jLabel23.setText(s1);
                    jLabel30.setText(s7);
                                       
                    j++;
                }
                //System.out.println(i);

            }
            if(j==0)
            {
                jLabel21.setText("    -");
                    jLabel22.setText("    -");
                    jLabel23.setText("    -");
                    jLabel30.setText("    -");
            }
            rs3.close();
            stmt.close();
       }
       catch(ClassNotFoundException e)
        {
          JOptionPane.showMessageDialog(null,"Not Connected");
        }
       catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
       try{
            int k=0;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","");
            //JOptionPane.showMessageDialog(null,"Connected");     
            Statement stmt;   
            stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs4;
            rs4 = stmt.executeQuery("select * FROM book ");
            while(rs4.next())
            {
                String s1 = rs4.getString("MobileNo");
                if(s1.equals(mobile))
                {
                    String s4 = rs4.getString("Brand");
                    String s5 = rs4.getString("Model");
                    String s7 = rs4.getString("Date");
                    jLabel10.setText(s4);
                    jLabel11.setText(s5);
                    jLabel18.setText(s1);
                    jLabel19.setText(s7);
                    k++;
                }

            }
            if(k==0)
            {
                jLabel10.setText("    -");
                    jLabel11.setText("    -");
                    jLabel18.setText("    -");
                    jLabel19.setText("    -");
            }
            
            
            rs4.close();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Testdrive");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Service");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Car Booking");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 140, 40));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Car City");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 170, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Brand");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Model");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mobile No");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Brand");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Model");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mobile No");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Date");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Mobile No");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Date");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Brand");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Model");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 100, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 90, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 100, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 110, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 120, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("jLabel22");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 100, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("jLabel23");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 110, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("jLabel30");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 90, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("jLabel31");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 100, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("jLabel32");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 130, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("jLabel35");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, 130, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("jLabel37");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanjith\\Downloads\\speedometer.jpg")); // NOI18N
        jLabel1.setText("Mobile No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1560, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order("8825638156").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
