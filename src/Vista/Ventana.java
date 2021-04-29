/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import MóduloCálculo.LógicaCálculo;
import MóduloCálculo.Objetos.ColecciónPseudoAleatorios;
import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SERGIO
 */
public class Ventana extends javax.swing.JFrame {

    private final String[] columnaParamPrim, columnaNumAl;
    private DefaultTableModel modeloParametros, modeloAleatorios;
    private LógicaCálculo datos;

    public Ventana() {
        initComponents();
        this.columnaParamPrim = new String[]{"d", "Máx. periodo (h)", "Módulo(m)", "Raíz primitiva(a)", "Semilla(n)", "Término aditivo(c)"};
        this.columnaNumAl = new String[]{"i", "n", "xi"};
        this.modeloParametros = new DefaultTableModel(null, this.columnaParamPrim);
        this.modeloAleatorios = new DefaultTableModel(null, this.columnaNumAl);
        this.tablParametros.setModel(this.modeloParametros);
        this.tblNumAleatorios.setModel(modeloAleatorios);
        this.datos = new LógicaCálculo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCantidadAleatorios = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablParametros = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNumAleatorios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cantidad de números:");

        txtCantidadAleatorios.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadAleatorios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadAleatoriosKeyPressed(evt);
            }
        });

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tablParametros);

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtCantidadAleatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(260, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadAleatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(431, 152));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Números aleatorios solicitados");

        jScrollPane2.setViewportView(tblNumAleatorios);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(191, 191, 191))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(346, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        órdenCalcular();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void órdenCalcular() {
        if (validar()) {
            for (int i = this.modeloAleatorios.getRowCount() - 1; i >= 0; i--) {
                this.modeloAleatorios.removeRow(i);
            }
            for (int i = this.modeloParametros.getRowCount() - 1; i >= 0; i--) {
                this.modeloParametros.removeRow(i);
            }
            this.datos.calculaParámetros(Integer.parseInt(this.txtCantidadAleatorios.getText()));
            ArrayList<ColecciónPseudoAleatorios> lista = this.datos.numerosAleatorios(Integer.parseInt(this.txtCantidadAleatorios.getText()));
            this.modeloParametros.addRow(new String[]{
                String.valueOf(this.datos.getParámetroPrincipal().getD()),
                String.valueOf(this.datos.getParámetroPrincipal().getH()),
                String.valueOf(this.datos.getParámetroPrincipal().getM()),
                String.valueOf(this.datos.getParámetroPrincipal().getA()),
                String.valueOf(this.datos.getParámetroPrincipal().getN0()),
                String.valueOf(this.datos.getParámetroPrincipal().getC())
            });
            for (ColecciónPseudoAleatorios numerosAleatorio : lista) {
                this.modeloAleatorios.addRow(new String[]{String.valueOf(numerosAleatorio.getI()), String.valueOf(numerosAleatorio.getNi()), String.valueOf(numerosAleatorio.getXi())});
            }

        } else {
            JOptionPane.showMessageDialog(this, "Primero se necesita ingresar el numero de aleatorios que quieres generar", "No hay cantidad de aleatorios ingresada", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void txtCantidadAleatoriosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadAleatoriosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            órdenCalcular();
        } else if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            limpiar();
        }


    }//GEN-LAST:event_txtCantidadAleatoriosKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void limpiar() {
        this.txtCantidadAleatorios.setText("");
        for (int i = this.modeloAleatorios.getRowCount() - 1; i >= 0; i--) {
            this.modeloAleatorios.removeRow(i);
        }
        for (int i = this.modeloParametros.getRowCount() - 1; i >= 0; i--) {
            this.modeloParametros.removeRow(i);
        }
    }

    private boolean validar() {
        return !this.txtCantidadAleatorios.getText().isEmpty();
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablParametros;
    private javax.swing.JTable tblNumAleatorios;
    private javax.swing.JTextField txtCantidadAleatorios;
    // End of variables declaration//GEN-END:variables
}
