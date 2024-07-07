/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package metromendeleyloutphiruizzaheraldeen;

import javax.swing.JFileChooser;

import java.io.File;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/**
 *
 * @author ayahzaheraldeen
 */
public class MainFrame extends javax.swing.JFrame {

    private String[] Prueba = (new String[] { "Título", "Autor", "Palabras Clave" });
    private App app;

    /**
     * Creates new form MainFrame
     *
     * @param app app object
     */
    public MainFrame(App app) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.app = app;
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveDataOnClose();

            }
        });

    }

    private void saveDataOnClose() {
        if (app.isStringNotEmpty()) {
            try {
                app.appendNewTextToFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving text to file: " + ex.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AddAbstract = new javax.swing.JButton();
        LoadAbstract = new javax.swing.JButton();
        InstructionsButton = new javax.swing.JButton();
        SearchHash = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SearchedKeyword = new javax.swing.JLabel();
        SearchedWord = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        DisplayListButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 230, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Academy Engraved LET", 1, 24)); // NOI18N
        jLabel1.setText("Metro Mendeley");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        AddAbstract.setBackground(new java.awt.Color(179, 199, 247));
        AddAbstract.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 13)); // NOI18N
        AddAbstract.setText("Agregar Resumen");
        AddAbstract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAbstractActionPerformed(evt);
            }
        });
        jPanel1.add(AddAbstract, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        LoadAbstract.setBackground(new java.awt.Color(179, 199, 247));
        LoadAbstract.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 13)); // NOI18N
        LoadAbstract.setText("Cargar Resumen");
        LoadAbstract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadAbstractActionPerformed(evt);
            }
        });
        jPanel1.add(LoadAbstract, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        InstructionsButton.setBackground(new java.awt.Color(250, 175, 144));
        InstructionsButton.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 13)); // NOI18N
        InstructionsButton.setForeground(new java.awt.Color(51, 0, 51));
        InstructionsButton.setText("Instrucciones");
        InstructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructionsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(InstructionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        SearchHash.setBackground(new java.awt.Color(139, 171, 241));
        SearchHash.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        SearchHash.setText("Buscar");
        SearchHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchHashActionPerformed(evt);
            }
        });
        jPanel1.add(SearchHash, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel2.setText("Buscar Investigacion Por:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        SearchedKeyword.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        SearchedKeyword.setText("Nombre del contenido");
        jPanel1.add(SearchedKeyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 270, 20));

        SearchedWord.setBackground(new java.awt.Color(139, 171, 241));
        SearchedWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchedWordActionPerformed(evt);
            }
        });
        jPanel1.add(SearchedWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 270, -1));

        jComboBox2.setBackground(new java.awt.Color(139, 171, 241));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(Prueba));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        DisplayListButton.setBackground(new java.awt.Color(250, 175, 144));
        DisplayListButton.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 13)); // NOI18N
        DisplayListButton.setText("Mostrar Todas las Investigaciones");
        DisplayListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayListButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DisplayListButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 370, -1));

        CloseButton.setBackground(new java.awt.Color(139, 171, 241));
        CloseButton.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 13)); // NOI18N
        CloseButton.setText("Guardar y Cerrar");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CloseButtonActionPerformed
        try {
            this.app.appendNewTextToFile();
            System.exit(0);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al guardar datos en archivo \"" + App.INPUT_FILE_NAME + "\"", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_CloseButtonActionPerformed

    private void LoadAbstractActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LoadAbstractActionPerformed
        if (app.isAdmin()) {
            loadSelectedFile();
        }
    }

    // Method to handle file loading
    private void loadSelectedFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            // Check if the file has .txt extension
            if (!selectedFile.getName().toLowerCase().endsWith(".txt")) {
                JOptionPane.showMessageDialog(this,
                        "Error: archivo debe ser del formato .txt",
                        "Error Cargando Archivo", JOptionPane.ERROR_MESSAGE);
                return; // Exit method if format is incorrect
            }

            try {
                if (!app.uploadFile(selectedFile.getAbsolutePath())) {
                    JOptionPane.showMessageDialog(this, "Ya existe una investigación con ese título", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "Error: " + ex.getMessage(),
                        "Error Cargando archivo", JOptionPane.ERROR_MESSAGE);
            }
        }

    }// GEN-LAST:event_LoadAbstractActionPerformed

    private void SearchHashActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SearchHashActionPerformed

        if (jComboBox2.getSelectedItem().equals("Título")) {
            Investigation[] investigations = this.app.getInvestigationsWithTitle(SearchedWord.getText().trim());
            if (investigations.length == 0) {
                JOptionPane.showMessageDialog(this, "No existen investigaciones con este título", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            ShowInvesList displayFrame = new ShowInvesList(this.app, investigations);
        } else if (jComboBox2.getSelectedItem().equals("Autor")) {
            Investigation[] investigationsWithAuthor = this.app.getInvestigationsWithAuthor(SearchedWord.getText().trim());
            if (investigationsWithAuthor.length == 0) {
                JOptionPane.showMessageDialog(this, "No existen investigaciones escritas por este autor", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            ShowInvesList displayFrame = new ShowInvesList(this.app, investigationsWithAuthor);
        } else {
            Investigation[] investigationsWithKeyword = this.app.getInvestigationsWithKeyword(SearchedWord.getText().trim());
            if (investigationsWithKeyword.length == 0) {
                JOptionPane.showMessageDialog(this, "No existen investigaciones con esta palabra clave", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            ShowInvesList displayFrame = new ShowInvesList(this.app, investigationsWithKeyword);
        }
    }// GEN-LAST:event_SearchHashActionPerformed

    private void SearchedWordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SearchedWordActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_SearchedWordActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SearchedWordActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_SearchedWordActionPerformed

    private void DisplayListButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DisplayListButtonActionPerformed
        ShowInvesList displayFrame = new ShowInvesList(this.app, this.app.getInvestigationsSortedByTitle());

    }// GEN-LAST:event_DisplayListButtonActionPerformed

    private void AddAbstractActionPerformed(java.awt.event.ActionEvent evt) {
        if (app.isAdmin()) {
            AddDirectAbstract addDirectAbstract = new AddDirectAbstract(this.app);
        }
    }// GEN-LAST:event_AddAbstractActionPerformed

    private void InstructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_InstructionsButtonActionPerformed
        if (evt.getSource() == InstructionsButton) {
            InstructionsFrame instructionsFrame = new InstructionsFrame();
            instructionsFrame.setVisible(true);
        }
    }// GEN-LAST:event_InstructionsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting
        // code(optional) ">
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame(new App()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAbstract;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton DisplayListButton;
    private javax.swing.JButton InstructionsButton;
    private javax.swing.JButton LoadAbstract;
    private javax.swing.JButton SearchHash;
    private javax.swing.JLabel SearchedKeyword;
    private javax.swing.JTextField SearchedWord;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
