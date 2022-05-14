package vista;

import datos.CategoriaDaoJDBC;
import dominio.*;
import java.util.*;
import javax.swing.*;

public class AgregarPregunta extends javax.swing.JDialog {

    private DefaultComboBoxModel modeloCategorias = new DefaultComboBoxModel();
    private DefaultComboBoxModel modeloCorrecta = new DefaultComboBoxModel();
    private Main main = new Main();

    private List<CategoriaDTO> categorias = new CategoriaDaoJDBC().seleccionar();
    private PreguntaDTO pregunta = null;
    private RespuestaDTO respuesta = null;

    public AgregarPregunta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        llenarmodelos();
        initComponents();
    }

    public void llenarmodelos() {
        String[] preg = {"Respuesta 1", "Respuesta 2", "Respuesta 3", "Respuesta 4"};
        categorias.forEach(categoria -> {
            modeloCategorias.addElement(categoria);
        });

        for (int i = 0; i < preg.length; i++) {
            modeloCorrecta.addElement(preg[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonRegresar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        textPregunta = new javax.swing.JLabel();
        campoPregunta = new javax.swing.JTextField();
        textRespuesta1 = new javax.swing.JLabel();
        campoRespuesta1 = new javax.swing.JTextField();
        textPrincipal = new javax.swing.JLabel();
        textRespuesta2 = new javax.swing.JLabel();
        textRespuesta3 = new javax.swing.JLabel();
        textRespuesta4 = new javax.swing.JLabel();
        campoRespuestaCorrecta = new javax.swing.JComboBox<>();
        campoRespuesta2 = new javax.swing.JTextField();
        campoRespuesta3 = new javax.swing.JTextField();
        campoRespuesta4 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        textRespuestaCorrecta = new javax.swing.JLabel();
        textCategoriaR = new javax.swing.JLabel();
        campoCategoriaP = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botonRegresar.setBackground(new java.awt.Color(51, 51, 51));
        botonRegresar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(153, 255, 255));
        botonRegresar.setText("REGRESAR");
        botonRegresar.setFocusable(false);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        botonAgregar.setBackground(new java.awt.Color(51, 51, 51));
        botonAgregar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(153, 255, 255));
        botonAgregar.setText("AGREGAR");
        botonAgregar.setFocusable(false);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        textPregunta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        textPregunta.setForeground(new java.awt.Color(153, 255, 255));
        textPregunta.setText("Pregunta: ");

        textRespuesta1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textRespuesta1.setForeground(new java.awt.Color(153, 255, 255));
        textRespuesta1.setText("Respuesta 1:");

        textPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        textPrincipal.setForeground(new java.awt.Color(153, 255, 255));
        textPrincipal.setText("CREADOR DE PREGUNTAS");

        textRespuesta2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textRespuesta2.setForeground(new java.awt.Color(153, 255, 255));
        textRespuesta2.setText("Respuesta 2:");

        textRespuesta3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textRespuesta3.setForeground(new java.awt.Color(153, 255, 255));
        textRespuesta3.setText("Respuesta 3:");

        textRespuesta4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textRespuesta4.setForeground(new java.awt.Color(153, 255, 255));
        textRespuesta4.setText("Respuesta 4:");

        campoRespuestaCorrecta.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        campoRespuestaCorrecta.setModel(modeloCorrecta);

        textRespuestaCorrecta.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textRespuestaCorrecta.setForeground(new java.awt.Color(153, 255, 255));
        textRespuestaCorrecta.setText("Respuesta Correcta");

        textCategoriaR.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textCategoriaR.setForeground(new java.awt.Color(153, 255, 255));
        textCategoriaR.setText("Categoria Pregunta");

        campoCategoriaP.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        campoCategoriaP.setModel(modeloCategorias);
        campoCategoriaP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textRespuesta1)
                            .addComponent(textRespuesta2)
                            .addComponent(textRespuesta3)
                            .addComponent(textRespuesta4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(textPregunta)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textPrincipal)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoRespuesta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(campoRespuesta2)
                                    .addComponent(campoRespuesta3)
                                    .addComponent(campoRespuesta4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCategoriaR)
                                    .addComponent(textRespuestaCorrecta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoRespuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCategoriaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addComponent(botonAgregar)))
                .addGap(46, 46, 46))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(textPrincipal)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textRespuesta1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textCategoriaR)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRespuesta2))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRespuesta3))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textRespuesta4)
                                    .addComponent(campoRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoCategoriaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoRespuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRespuestaCorrecta))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonRegresar)
                            .addComponent(botonAgregar))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textPregunta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        Inicio inicio = new Inicio();
        this.dispose();
        inicio.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        boolean camposNoNulos = campoPregunta.getText() != null && campoRespuesta1.getText() != null
                && campoRespuesta2.getText() != null && campoRespuesta3.getText() != null && campoRespuesta4.getText() != null
                ? true : false;
        boolean camposNoVacios = !((campoPregunta.getText()).trim()).equals("") && !((campoRespuesta1.getText()).trim()).equals("")
                && !((campoRespuesta2.getText()).trim()).equals("") && !((campoRespuesta3.getText()).trim()).equals("")
                && !((campoRespuesta4.getText()).trim()).equals("") ? true : false;
        boolean cantidadCaracteresValida = campoPregunta.getText().length() <= 100 && campoRespuesta1.getText().length()
                <= 100 && campoRespuesta2.getText().length() <= 100 && campoRespuesta3.getText().length() <= 100
                && campoRespuesta4.getText().length() <= 100 ? true : false;

        int confirmacion = JOptionPane.showConfirmDialog(null, "Desea Agregar la Pregunta", "Agregar Pregunta",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirmacion == 0) {
            if (camposNoVacios && camposNoNulos && cantidadCaracteresValida) {
                agregarPregunta();
                vaciarCampos();

            } else {
                JOptionPane.showMessageDialog(null, "Llene todos los Campos o Verifique Que Tengan Menos de 100 Caracteres");
            }
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void agregarPregunta() {
        RespuestaDTO[] resp = new RespuestaDTO[4];
        String r = "";
        pregunta = new PreguntaDTO(campoPregunta.getText().trim(), campoCategoriaP.getSelectedIndex() + 1);

        for (int i = 0; i < resp.length; i++) {
            r = (i == 0) ? campoRespuesta1.getText() : (i == 1) ? campoRespuesta2.getText() : (i == 2)
                    ? campoRespuesta3.getText() : (i == 3) ? campoRespuesta4.getText() : "";

            if (campoRespuestaCorrecta.getSelectedIndex() == i) {
                resp[i] = new RespuestaDTO(r.trim(), true, 0);
            } else {
                resp[i] = new RespuestaDTO(r.trim(), false, 0);

            }
        }
        main.insertarPregunta(pregunta, resp);
    }

    private void vaciarCampos() {
        campoPregunta.setText("");
        campoRespuesta1.setText("");
        campoRespuesta2.setText("");
        campoRespuesta3.setText("");
        campoRespuesta4.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> campoCategoriaP;
    private javax.swing.JTextField campoPregunta;
    private javax.swing.JTextField campoRespuesta1;
    private javax.swing.JTextField campoRespuesta2;
    private javax.swing.JTextField campoRespuesta3;
    private javax.swing.JTextField campoRespuesta4;
    private javax.swing.JComboBox<String> campoRespuestaCorrecta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel textCategoriaR;
    private javax.swing.JLabel textPregunta;
    private javax.swing.JLabel textPrincipal;
    private javax.swing.JLabel textRespuesta1;
    private javax.swing.JLabel textRespuesta2;
    private javax.swing.JLabel textRespuesta3;
    private javax.swing.JLabel textRespuesta4;
    private javax.swing.JLabel textRespuestaCorrecta;
    // End of variables declaration//GEN-END:variables
}
