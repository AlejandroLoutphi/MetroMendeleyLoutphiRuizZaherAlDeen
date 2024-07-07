/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package metromendeleyloutphiruizzaheraldeen;

/**
 *
 * @author ayahzaheraldeen
 */
public class InstructionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form InstructionsFrame
     */
    public InstructionsFrame() {
        initComponents();
        this.jTextArea1.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 194, 172));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Instrucciones:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, 20));

        jLabel1.setFont(new java.awt.Font("ITF Devanagari", 3, 15)); // NOI18N
        jLabel1.setText("Lea atentamente las instrucciones antes de utilizar la aplicación.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 11)); // NOI18N
        jLabel2.setText("¡BIENVENIDO A NUESTRA APLICACIÓN DE ANÁLISIS INTEGRAL DE INVESTIGACIÓN!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 530, 50));

        jTextArea1.setBackground(new java.awt.Color(255, 230, 219));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("ITF Devanagari", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Debe haber descargado previamente el archivo principal \n\"Instructions.txt\" en su sistema. De lo contrario, la aplicación no \nse ejecutará.\n2. Una vez que hayas descargado el archivo, puedes visualizar todas \nlas investigaciones guardadas pulsando el botón \n\"Mostrar Investigaciones\"\n3. Aparecerá un listado de todas las investigaciones, y \npodrás seleccionar una de ellas para ver sus detalles.\n4. Una vez que hayas seleccionado una investigación, \npuedes pulsar el botón \"Ver Análisis\" para ver las estadísticas \nde cada investigación, incluyendo el número de \npalabras clave que se utilizan en su texto de resumen.\n5. También puedes cerrar este panel utilizando el botón \n\"Cerrar\".\n6. Ahora, puedes añadir una nueva investigación\n pulsando el botón \n\"Agregar Resumen\" para escribir directamente los detalles  \nde la investigación incluyendo el título, lista de autores, \ntexto y lista de palabras clave.\nNOTA:\n-LOS AUTORES Y PALABRAS CLAVE DEBEN ESTAR\n SEPARADOS POR COMAS.\n-TODOS LOS CAMPOS DEBEN SER COMPLEMENTADOS \nANTES DE GUARDAR LA INVESTIGACIÓN\n7. Alternativamente, puedes cargar un archivo de una\n investigación directamente, y será analizada utilizando e\nl botón \"Cargar Resumen\".\nNOTA: DEBE SER UN TEXTO.\n8. Ahora puedes cerrar la aplicación, y recargar el programa \npara analizar la nueva investigación.\n9. También puedes utilizar la opción desplegable para seleccionar\n cómo te gustaría buscar una investigación (Por Autores, Títulos o \nPalabras Clave) e ingresar el nombre en el campo de texto en \nla aplicación principal. ¡Presiona el botón \"Buscar\" y\n buscará en la lista de investigaciones el texto que estás buscando!");
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 460, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 350));

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
            java.util.logging.Logger.getLogger(InstructionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}