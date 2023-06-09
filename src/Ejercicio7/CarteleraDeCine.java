/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Camilo
 */
public class CarteleraDeCine extends javax.swing.JFrame {

    /**
     * Creates new form CarteleraDeCine
     */
    public CarteleraDeCine() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        etiquetaNemo = new javax.swing.JLabel();
        etiquetaLosIncreibles = new javax.swing.JLabel();
        etiquetaToyStory = new javax.swing.JLabel();
        etiquetaWalle = new javax.swing.JLabel();
        eitquetaGeneroNemo = new javax.swing.JLabel();
        etiquetaTituloLosIncreibles = new javax.swing.JLabel();
        etiquetaGeneroLosIncreibles = new javax.swing.JLabel();
        tituloBuscandoANemo = new javax.swing.JLabel();
        etiquetaTituloToyStory = new javax.swing.JLabel();
        etiquetaGeneroToyStory = new javax.swing.JLabel();
        etiquetaTituloWalle = new javax.swing.JLabel();
        etiquetaGeneroWalle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cartelera De Cine");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        etiquetaNemo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nemo.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 15);
        jPanel1.add(etiquetaNemo, gridBagConstraints);

        etiquetaLosIncreibles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/losIncreibles.jpeg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 15);
        jPanel1.add(etiquetaLosIncreibles, gridBagConstraints);

        etiquetaToyStory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/toyStory.jpeg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 15);
        jPanel1.add(etiquetaToyStory, gridBagConstraints);

        etiquetaWalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/walle.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 15);
        jPanel1.add(etiquetaWalle, gridBagConstraints);

        eitquetaGeneroNemo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eitquetaGeneroNemo.setText("Genero: Aventura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 15);
        jPanel1.add(eitquetaGeneroNemo, gridBagConstraints);

        etiquetaTituloLosIncreibles.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaTituloLosIncreibles.setText("Titulo: Los Increibles 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 15);
        jPanel1.add(etiquetaTituloLosIncreibles, gridBagConstraints);

        etiquetaGeneroLosIncreibles.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaGeneroLosIncreibles.setText("Genero: Aventura, Accion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 15);
        jPanel1.add(etiquetaGeneroLosIncreibles, gridBagConstraints);

        tituloBuscandoANemo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloBuscandoANemo.setText("Ttitulo: Buscando a Nemo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 15);
        jPanel1.add(tituloBuscandoANemo, gridBagConstraints);

        etiquetaTituloToyStory.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaTituloToyStory.setText("Titulo: Toy Story 4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 15);
        jPanel1.add(etiquetaTituloToyStory, gridBagConstraints);

        etiquetaGeneroToyStory.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaGeneroToyStory.setText("Genero: Aventura");
        etiquetaGeneroToyStory.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 15);
        jPanel1.add(etiquetaGeneroToyStory, gridBagConstraints);

        etiquetaTituloWalle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaTituloWalle.setText("Titulo: Walle");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 15);
        jPanel1.add(etiquetaTituloWalle, gridBagConstraints);

        etiquetaGeneroWalle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaGeneroWalle.setText("Genero: Aventura, Accion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 15);
        jPanel1.add(etiquetaGeneroWalle, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(CarteleraDeCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarteleraDeCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarteleraDeCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarteleraDeCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarteleraDeCine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eitquetaGeneroNemo;
    private javax.swing.JLabel etiquetaGeneroLosIncreibles;
    private javax.swing.JLabel etiquetaGeneroToyStory;
    private javax.swing.JLabel etiquetaGeneroWalle;
    private javax.swing.JLabel etiquetaLosIncreibles;
    private javax.swing.JLabel etiquetaNemo;
    private javax.swing.JLabel etiquetaTituloLosIncreibles;
    private javax.swing.JLabel etiquetaTituloToyStory;
    private javax.swing.JLabel etiquetaTituloWalle;
    private javax.swing.JLabel etiquetaToyStory;
    private javax.swing.JLabel etiquetaWalle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloBuscandoANemo;
    // End of variables declaration//GEN-END:variables
}
