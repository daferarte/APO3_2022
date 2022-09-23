/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemones;

import MenuPrincipal.MenuPrincipal;

/**
 *
 * @author dafer
 */
public class AgregarPokemon extends javax.swing.JFrame {

    private static AgregarPokemon agregarpokemon;
    /**
     * Creates new form AgregarPokemon
     */
    private AgregarPokemon() {
        initComponents();
    }
    
    public static AgregarPokemon getInstance(){
        if(agregarpokemon == null)
            agregarpokemon=new AgregarPokemon();
        return agregarpokemon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexodepokemon = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        TexFieCodPok = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        TexFieNomPok = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        sliEst = new javax.swing.JSlider();
        spiEst = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Agregar Pokemon");
        getContentPane().add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo pokedex"));
        jPanel6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        TexFieCodPok.setText("Codigo");
        TexFieCodPok.setToolTipText("");
        TexFieCodPok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TexFieCodPokMouseClicked(evt);
            }
        });
        TexFieCodPok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TexFieCodPokKeyTyped(evt);
            }
        });
        jPanel6.add(TexFieCodPok);

        jPanel1.add(jPanel6);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del pokemon"));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        TexFieNomPok.setText("Nombre");
        TexFieNomPok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TexFieNomPokMouseClicked(evt);
            }
        });
        jPanel5.add(TexFieNomPok);

        jPanel1.add(jPanel5);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));
        jPanel2.setLayout(new java.awt.GridLayout(0, 2));

        jCheckBox1.setText("Electrico");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1);

        jCheckBox3.setText("Fuego");
        jPanel2.add(jCheckBox3);

        jCheckBox4.setText("Agua");
        jPanel2.add(jCheckBox4);

        jCheckBox5.setText("Planta");
        jPanel2.add(jCheckBox5);

        jPanel1.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        sexodepokemon.add(jRadioButton1);
        jRadioButton1.setText("Macho");
        jPanel3.add(jRadioButton1);

        sexodepokemon.add(jRadioButton2);
        jRadioButton2.setText("Hembra");
        jPanel3.add(jRadioButton2);

        jPanel1.add(jPanel3);

        jCheckBox2.setText("Vario Color");
        jPanel1.add(jCheckBox2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadisticas"));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        sliEst.setMinorTickSpacing(10);
        sliEst.setPaintLabels(true);
        sliEst.setPaintTicks(true);
        sliEst.setSnapToTicks(true);
        sliEst.setToolTipText("0");
        sliEst.setValue(0);
        sliEst.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliEstStateChanged(evt);
            }
        });
        jPanel4.add(sliEst);

        spiEst.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(100.0f), Float.valueOf(1.0f)));
        spiEst.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiEstStateChanged(evt);
            }
        });
        jPanel4.add(spiEst);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("Guardar pokemon");
        jPanel7.add(jButton1);

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);

        getContentPane().add(jPanel7, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void TexFieCodPokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TexFieCodPokMouseClicked
        // TODO add your handling code here:
        TexFieCodPok.setText("");
    }//GEN-LAST:event_TexFieCodPokMouseClicked

    private void TexFieNomPokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TexFieNomPokMouseClicked
        // TODO add your handling code here:
        TexFieNomPok.setText("");
    }//GEN-LAST:event_TexFieNomPokMouseClicked

    private void TexFieCodPokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TexFieCodPokKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();
        
    }//GEN-LAST:event_TexFieCodPokKeyTyped

    private void sliEstStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliEstStateChanged
        // TODO add your handling code here:
        spiEst.setValue(sliEst.getValue());
    }//GEN-LAST:event_sliEstStateChanged

    private void spiEstStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiEstStateChanged
        // TODO add your handling code here:  
        sliEst.setValue((int) Float.parseFloat(spiEst.getValue()+""));
       
    }//GEN-LAST:event_spiEstStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menuprincipal = MenuPrincipal.getInstance();
        menuprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TexFieCodPok;
    private javax.swing.JTextField TexFieNomPok;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.ButtonGroup sexodepokemon;
    private javax.swing.JSlider sliEst;
    private javax.swing.JSpinner spiEst;
    // End of variables declaration//GEN-END:variables
}
