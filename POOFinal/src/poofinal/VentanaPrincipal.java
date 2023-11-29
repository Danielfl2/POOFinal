package poofinal;

import javax.swing.JOptionPane;


public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contactoslbl = new javax.swing.JLabel();
        displayFriendsBTN = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        AddBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Contactos = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        ResultadoLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contactoslbl.setText("Contactos");

        displayFriendsBTN.setText("Cargar Contactos");
        displayFriendsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayFriendsBTNActionPerformed(evt);
            }
        });

        DeleteBTN.setText("Borrar Contacto");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });

        AddBTN.setText("Añadir contactos");
        AddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTNActionPerformed(evt);
            }
        });

        Contactos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = CargarAmigos.displayFriends();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Contactos);

        jButton1.setText("Actualizar Numero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ResultadoLBL.setText("Realizado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(displayFriendsBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(DeleteBTN)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(contactoslbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(ResultadoLBL)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(AddBTN)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contactoslbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AddBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayFriendsBTN)
                    .addComponent(DeleteBTN)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResultadoLBL)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_AddBTNActionPerformed
        // TODO add your handling code here:
        // Cerrar la ventana principal y abrir la ventana de añadir contactos con la
        // clase AñadirContactos
        this.setVisible(false);
        AñadirContactos añadirContactos = new AñadirContactos();
        añadirContactos.setVisible(true);

    }// GEN-LAST:event_AddBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Obtener el contacto seleccionado en el JList, mostrar una ventana emergente
        // con el nuevo numero
        // usar el metodo UpdateFriend y imprimir en el jlabel el resultado de la
        // operacion
        String contacto = Contactos.getSelectedValue();
        // Hacer un split para sacar el nombre y el numero
        String[] contactoSplit = contacto.split(":");
        // Mostrar una ventana emergente con el nuevo numero
        String nuevoNumero = JOptionPane.showInputDialog("Ingrese el nuevo numero de " + contactoSplit[0]);
        // Actualizar el numero del contacto
        ResultadoLBL.setText("Realizado: " + ActualizarAmigo.updateFriend(contactoSplit[0],
                Long.parseLong(contactoSplit[1]), Long.parseLong(nuevoNumero)));
        // Actualizar la lista de contactos
        Contactos.setListData(CargarAmigos.displayFriends());

    }// GEN-LAST:event_jButton1ActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DeleteBTNActionPerformed
        // TODO add your handling code here:
        // Obtener el contacto seleccionado en el JList, usar el metodo DeleteFriend y
        // mostrar el resultado en el JLabel
        String contacto = Contactos.getSelectedValue();
        // sacar una substring del contacto para obtener el nombre
        String nombre = contacto.substring(0, contacto.indexOf(":"));
        // actualizar la jlabel con el resultado de la operacion
        ResultadoLBL.setText("Realizado: " + BorrarAmigos.deleteFriend(nombre));
        // Actualizar la lista de contactos
        Contactos.setListData(CargarAmigos.displayFriends());

    }// GEN-LAST:event_DeleteBTNActionPerformed

    private void displayFriendsBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_displayFriendsBTNActionPerformed
        // TODO add your handling code here:
        // Usar el metodo DisplayFriends y mostrar la lista retornada en el JList
        Contactos.setListData(CargarAmigos.displayFriends());
    }// GEN-LAST:event_displayFriendsBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBTN;
    private javax.swing.JList<String> Contactos;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JLabel ResultadoLBL;
    private javax.swing.JLabel contactoslbl;
    private javax.swing.JButton displayFriendsBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}