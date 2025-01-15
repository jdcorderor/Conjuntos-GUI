package PLogicaSimbolica;

/**
 *
 * @author Juan Diego Cordero
 */
public class Manual extends javax.swing.JFrame {

    public Manual() {
        initComponents();
        this.setLocationRelativeTo(null);
        menuButton.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manual de Usuario");

        closeButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        closeButton.setText("Salir");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        menuButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        menuButton.setText("Menú");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("¡Estimado Usuario! Bienvenido al Software de Operaciones con Conjuntos.\n\n- Modo Interactivo: El Modo Interactivo ha sido diseñado con el objetivo de ofrecer al Usuario una experiencia versátil. Hemos configurado la modalidad con el propósito de garantizar un control eficiente de errores, a través de una interfaz intuitiva, que \npermite procesar los conjuntos de elementos manualmente.\n\nModo de Uso:\n• Ingresar el número de elementos del Conjunto Universal (C.U). Presione “Enter” para guardar.\n• En el campo habilitado, ingresar uno a uno los elementos del C.U. Presione “Enter” para guardar cada elemento. \n• Al culminar la adición de elementos, se habilitarán dos botones: “Editar” para sustituir elementos; “Cargar” para almacenar el conjunto en memoria y mostrarlo en pantalla.\n• Ingresar el número de subconjuntos a generar. El valor insertado debe ser superior a tres (3).  \n• En el campo habilitado, ingresar el número de elementos que contendrá el subconjunto. Se habilitará una lista desplegable que contendrá los elementos del C.U. \n• Seleccionar los elementos del subconjunto.\n• Al culminar la adición, se habilitarán tres botones: “Ver” para mostrar los elementos; “Descartar” para eliminar el subconjunto; “Cargar” para almacenar en memoria y mostrar el subconjunto en pantalla.\n• Este proceso se iterará hasta que se alcance el número estipulado de subconjuntos. \n\n- Modo de Generación Aleatoria: El Modo de Generación Aleatoria ha sido diseñado con el objetivo de ofrecer al Usuario una experiencia automatizada. El ingreso de elementos es aleatorio. No obstante, el usuario asignará la cantidad de elementos y \nsubconjuntos que serán almacenados.\n\nModo de Uso:\n• Ingresar el número de elementos del Conjunto Universal (C.U). Presione “Enter” para guardar.\n• Presionar el botón “Cargar” para almacenar en memoria y mostrar el conjunto en pantalla.\n• Ingresar el número de subconjuntos a generar. El valor insertado debe ser superior a tres (3).\n• Ingresar el número de elementos que contendrá el subconjunto. \n• Presionar el botón “Cargar” para almacenar en memoria y mostrar en pantalla.\n• Este procedimiento se iterará hasta que se alcance el número estipulado de subconjuntos.\n\n- Módulo de Operaciones:\nAl culminar el ingreso de elementos, de forma manual o aleatoria; podrán ejecutarse operaciones de Unión, Intersección, Diferencia y Complemento. \n• Seleccionar el primer conjunto de la operación en la lista desplegable N° 1.\n• Presionar el botón correspondiente a la operación que se desea ejecutar. El botón \"Todas las Operaciones\", ejecutará automáticamente todas las operaciones posibles sobre los conjuntos seleccionados.\n• De presionar el botón “Complemento”, será inhabilitada la lista N° 2. En el restante de casos: Ingresar el segundo conjunto de la operación.\n• Al ser ingresada la operación, que se podrá visualizar en la pantalla de ejecución; se habilitarán tres botones: “Ejecutar” para confirmar, procesar, almacenar en memoria y mostrar en pantalla el resultado de la operación; “Limpiar” para eliminar la \noperación; y “Diagrama de Venn” para habilitar una ventana gráfica que muestra los conjuntos seleccionados. \nCada iteración ejecutada será guardada en memoria, por lo que podrá ser seleccionada con el objetivo de ejecutar operaciones compuestas, paso a paso, con alcance ilimitado.\n\nGeneralidades:\n• Presionar el botón “Menú”, retorna al menú principal.\n• Presionar el botón “Limpiar”, desecha todos los conjuntos generados en la ejecución.\n• Presionar el botón “Salir”, culmina la ejecución del Software.");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(498, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(494, 494, 494))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuButton)
                    .addComponent(closeButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        dispose();
        Main pmain = new Main();
        pmain.setVisible(true);
    }//GEN-LAST:event_menuButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JButton menuButton;
    // End of variables declaration//GEN-END:variables
}
