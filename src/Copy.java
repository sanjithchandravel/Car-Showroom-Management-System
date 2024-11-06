
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sanjith
 */
public class Copy extends javax.swing.JFrame {

    /**
     * Creates new form Order
     * @param mobile
     */
    public Copy(String mobile) {
        initComponents();
        initComponents();
        setBounds(0, 0, 1536, 864);
        //jLabel4.setText(user);
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
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
                    String s7 = rs1.getString("Date");
                    System.out.println("hello");
                    //String c[]={"Brand","Model","MobileNo","Date"};
                    //String data[][]={{s4,s5,s1,s7}};
                    DefaultTableModel model =(DefaultTableModel)jTable3.getModel();
                    //jTable3.setModel(model);
                    model.addRow(new Object[]{s4, s5, s1, s7});
                    jTable3.setModel(model);
                    //jTable2.add(new String[]{s4, s5, s1, s7});
                    //jTable2.getModel().addRow(new String[]{s4, s5, s1, s7});
                    //jTable2.add(this, i);
                    //jTable3.getModel().setValueAt(s4, 0,0);
                    //jTable3.getModel().setValueAt(s5, 0,1);
                    //jTable3.getModel().setValueAt(s1, 0,2);
                    //jTable3.getModel().setValueAt(s7, 0,3);
                    //jTable2.add(s7, this);
                    i++;
                }

            }

            if(i==0)
            {
                String c[]={"Brand","Model","MobileNo","Date"};
                String data[][]={{"-","-","-","-"}};
                DefaultTableModel model = new DefaultTableModel(data,c);
                jTable3.setModel(model);
                //jTable3.getModel().setValueAt("-", 0, 0);
                //jTable3.getModel().setValueAt("-", 0, 1);
                //jTable3.getModel().setValueAt("-", 0, 2);
                //jTable3.getModel().setValueAt("-", 0, 3);
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
                    //jTable2.addRow(new Object[]{s4, s5, s1, s7});
                    //jTable2.add(this, i);
                    jTable1.getModel().setValueAt(s4, 0, 0);
                    jTable1.getModel().setValueAt(s5, 0, 1);
                    jTable1.getModel().setValueAt(s1, 0, 2);
                    jTable1.getModel().setValueAt(s7, 0, 3);
                    //jTable2.add(s7, this);
                    
                    j++;
                }
                //System.out.println(i);

            }
            if(j==0)
            {
                jTable1.getModel().setValueAt("-", 0, 0);
                jTable1.getModel().setValueAt("-", 0, 1);
                jTable1.getModel().setValueAt("-", 0, 2);
                jTable1.getModel().setValueAt("-", 0, 3);
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
                    
                    //jTable2.addRow(new Object[]{s4, s5, s1, s7});
                    //jTable2.add(this, i);
                    jTable2.getModel().setValueAt(s4, 0, 0);
                    jTable2.getModel().setValueAt(s5, 0, 1);
                    jTable2.getModel().setValueAt(s1, 0, 2);
                    jTable2.getModel().setValueAt(s7, 0, 3);
                    //jTable2.add(s7, this);
                    k++;
                }

            }
            if(k==0)
            {
                jTable2.getModel().setValueAt("-", 0, 0);
                jTable2.getModel().setValueAt("-", 0, 1);
                jTable2.getModel().setValueAt("-", 0, 2);
                jTable2.getModel().setValueAt("-", 0, 3);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Testdrive");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 100, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Brand", "Model", "Mobile No", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 540, 50));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Brand", "Model", "Mobile No", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 540, 50));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Service");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 130, 30));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Brand", "Title", "Mobile", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 540, 50));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Car Booking");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 110, 30));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("CAR CITY");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanjith\\Downloads\\speedometer.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1560, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
