
package vista;

public class VistaPersona extends javax.swing.JFrame {


    public VistaPersona() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaBuscar = new javax.swing.JTextField();
        cajaId = new javax.swing.JTextField();
        etiquetaClave = new javax.swing.JLabel();
        cajaClave = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaDomicilio = new javax.swing.JLabel();
        cajaDomicilio = new javax.swing.JTextField();
        etiquetaCelular = new javax.swing.JLabel();
        cajaCelular = new javax.swing.JTextField();
        etiquetaCorreo = new javax.swing.JLabel();
        cajaCorreo = new javax.swing.JTextField();
        etiquetaNacimiento = new javax.swing.JLabel();
        cajaNacimiento = new javax.swing.JTextField();
        etiquetaGenero = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox<>();
        botonBuscar = new javax.swing.JButton();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 100, -1));

        cajaId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 77, -1));

        etiquetaClave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaClave.setText("Clave:");
        jPanel1.add(etiquetaClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        cajaClave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 320, -1));

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaNombre.setText("Nombre: ");
        jPanel1.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, -1, -1));

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 320, -1));

        etiquetaDomicilio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaDomicilio.setText("Domicilio:");
        jPanel1.add(etiquetaDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 168, -1, -1));

        cajaDomicilio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 320, -1));

        etiquetaCelular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaCelular.setText("Celular:");
        jPanel1.add(etiquetaCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        cajaCelular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 320, -1));

        etiquetaCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaCorreo.setText("Correo electrónico:");
        jPanel1.add(etiquetaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        cajaCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 250, -1));

        etiquetaNacimiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaNacimiento.setText("Fecha nacimiento:");
        jPanel1.add(etiquetaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        cajaNacimiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 250, -1));

        etiquetaGenero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaGenero.setText("Género:");
        jPanel1.add(etiquetaGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        comboGenero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Femenino", "Masculino" }));
        jPanel1.add(comboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 320, -1));

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonBuscar.setText("Buscar");
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 80, -1));

        botonInsertar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonInsertar.setText("Insertar");
        jPanel1.add(botonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        botonModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonModificar.setText("Modificar");
        jPanel1.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        botonEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonEliminar.setText("Eliminar");
        jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        botonLimpiar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonLimpiar.setText("Limpiar");
        jPanel1.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonBuscar;
    public javax.swing.JButton botonEliminar;
    public javax.swing.JButton botonInsertar;
    public javax.swing.JButton botonLimpiar;
    public javax.swing.JButton botonModificar;
    public javax.swing.JTextField cajaBuscar;
    public javax.swing.JTextField cajaCelular;
    public javax.swing.JTextField cajaClave;
    public javax.swing.JTextField cajaCorreo;
    public javax.swing.JTextField cajaDomicilio;
    public javax.swing.JTextField cajaId;
    public javax.swing.JTextField cajaNacimiento;
    public javax.swing.JTextField cajaNombre;
    public javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JLabel etiquetaCelular;
    private javax.swing.JLabel etiquetaClave;
    private javax.swing.JLabel etiquetaCorreo;
    private javax.swing.JLabel etiquetaDomicilio;
    private javax.swing.JLabel etiquetaGenero;
    private javax.swing.JLabel etiquetaNacimiento;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
