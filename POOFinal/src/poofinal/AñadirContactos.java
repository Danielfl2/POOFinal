package poofinal;
import javax.swing.JOptionPane;

public class AñadirContactos extends javax.swing.JFrame {
    
    public AñadirContactos() { 
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents 
    
    private void initComponents() {
    
        addContactslbl = new javax.swing.JLabel(); 
        NumberLBL = new javax.swing.JLabel(); 
        NameLBL = new javax.swing.JLabel(); 
        NombreTXT = new javax.swing.JTextField(); 
        NumeroTXT = new javax.swing.JTextField(); 
        AddContactBTN = new javax.swing.JButton(); 
        VolverTXT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
        addContactslbl.setText("AÑADIR CONTACTOS"); 
        NumberLBL.setText("Numero:");
        NameLBL.setText("Nombre:");
        
        AddContactBTN.setText("Añadir Contacto");
        AddContactBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddContactBTNActionPerformed(evt);
            }
        });
        
        VolverTXT.setText("Volver");
        VolverTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverTXTActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup( layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addGroup(layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(NameLBL)
        .addComponent(NumberLBL))
        .addGap(70, 70, 70)
        .addGroup(layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(NombreTXT)
        .addComponent(NumeroTXT)))
        .addGroup(layout.createSequentialGroup()
        .addGroup(layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGap(114, 114, 114)
        .addComponent(addContactslbl))
        .addGroup(layout.createSequentialGroup()
        .addGap(77, 77, 77)
        .addComponent(VolverTXT)
        .addGap(18, 18, 18)
        .addComponent(AddContactBTN)))
        .addGap(0, 63, Short.MAX_VALUE)))
        .addContainerGap())); layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(addContactslbl)
        .addGap(27, 27, 27)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(NameLBL)
        .addComponent(NombreTXT,
        javax.swing.GroupLayout.PREFERRED_SIZE,
        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(NumberLBL)
        .addComponent(NumeroTXT,
        javax.swing.GroupLayout.PREFERRED_SIZE,
        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(AddContactBTN)
        .addComponent(VolverTXT))
        .addContainerGap(24, Short.MAX_VALUE)));

        pack();
        
    }// </editor-fold>//GEN-END:initComponents
    
    private void VolverTXTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_VolverTXTActionPerformed

        this.setVisible(false);
        new VentanaPrincipal().setVisible(true);

        
    }// GEN-LAST:event_VolverTXTActionPerformed
    
    private void AddContactBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddContactBTNActionPerformed
        String nombre = NombreTXT.getText();
        Long numero = Long.parseLong(NumeroTXT.getText());
        JOptionPane.showMessageDialog(null, AgregarAmigo.addFriend(nombre, numero));
    }// GEN-LAST:event_AddContactBTNActionPerformed
    
    public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    /*
    *	If Nimbus (introduced in Java SE 6) is not available, stay with the default
    *	look and feel.
    *	For details see
    *	http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
    */ 
    
        try {
            for	(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { 
                    javax.swing.UIManager.setLookAndFeel(info.getClassName()); 
                } 
                break;
            }
        }catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AñadirContactos.class.getName()).log(java.util.logging.Level.SEVERE,null, ex);
        }catch(InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirContactos.class.getName()).log(java.util.logging.Level.SEVERE,null, ex);
        }catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new AñadirContactos().setVisible(true);
            }
        });
    }
        // Variables declaration - do not modify//GEN-BEGIN:variables 
        private javax.swing.JButton AddContactBTN;
        private javax.swing.JLabel NameLBL; 
        private javax.swing.JTextField NombreTXT; 
        private javax.swing.JLabel NumberLBL; 
        private javax.swing.JTextField NumeroTXT; 
        private javax.swing.JButton VolverTXT; 
        private javax.swing.JLabel addContactslbl;
        // End of variables declaration//GEN-END:variables
    
}
