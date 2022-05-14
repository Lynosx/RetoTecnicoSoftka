package vista;

import datos.*;
import dominio.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Partida extends javax.swing.JDialog {

    private int ronda, acumulado;
    private String estado;
    private List<RondaDTO> rondas;
    private List<PreguntaDTO> preguntas;
    private List<RespuestaDTO> respuestas;
    private List<SalidaDTO> salidas;

    private PartidaDTO partida;
    private JugadorDTO jugador;
    private Main main;

    public Partida(java.awt.Frame parent, boolean modal, String nombre) {
        super(parent, modal);
        jugador = new JugadorDTO();
        jugador.setNombre(nombre);

        ronda = 1;
        acumulado = 0;
        estado = "Jugando";
        rondas = new RondaDaoJDBC().seleccionar();
        salidas = new SalidaDaoJDBC().seleccionar();
        main = new Main();

        initComponents();
        establecerPreguntas();
        establecerExtras();
    }

    private void establecerPreguntas() {
        if (ronda == 1) {
            preguntas = new PreguntaDaoJDBC().seleccionPreguntas();
        }
        int idpre = preguntas.get(ronda - 1).getId();
        respuestas = new RespuestaDaoJDBC().seleccionarRespuestas(idpre);

        textPregunta.setText(preguntas.get(ronda - 1).getPregunta());
        checkRespuesta1.setText(respuestas.get(0).getRespuesta());
        checkRespuesta2.setText(respuestas.get(1).getRespuesta());
        checkRespuesta3.setText(respuestas.get(2).getRespuesta());
        checkRespuesta4.setText(respuestas.get(3).getRespuesta());
    }

    private void establecerExtras() {
        textPrincipal.setText("RONDA #" + ronda);
        textJugador.setText("Jugador: " + jugador.getNombre());
        textPremio1.setText("Ronda 1: " + (int) rondas.get(0).getPremio() + " Puntos");
        textPremio2.setText("Ronda 2: " + (int) rondas.get(1).getPremio() + " Puntos");
        textPremio3.setText("Ronda 3: " + (int) rondas.get(2).getPremio() + " Puntos");
        textPremio4.setText("Ronda 4: " + (int) rondas.get(3).getPremio() + " Puntos");
        textPremio5.setText("Ronda 5: " + (int) rondas.get(4).getPremio() + " Puntos");

        textAcumulado.setText("ACUMULADO: " + (int) acumulado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRespuestas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        textPrincipal = new javax.swing.JLabel();
        textPregunta = new javax.swing.JLabel();
        checkRespuesta1 = new javax.swing.JCheckBox();
        checkRespuesta2 = new javax.swing.JCheckBox();
        checkRespuesta3 = new javax.swing.JCheckBox();
        checkRespuesta4 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        botonRegresar = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        textPremios = new javax.swing.JLabel();
        textPremio1 = new javax.swing.JLabel();
        textPremio2 = new javax.swing.JLabel();
        textPremio3 = new javax.swing.JLabel();
        textPremio4 = new javax.swing.JLabel();
        textPremio5 = new javax.swing.JLabel();
        textAcumulado = new javax.swing.JLabel();
        textJugador = new javax.swing.JLabel();

        grupoRespuestas.add(checkRespuesta1);
        grupoRespuestas.add(checkRespuesta2);
        grupoRespuestas.add(checkRespuesta3);
        grupoRespuestas.add(checkRespuesta4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        textPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textPrincipal.setForeground(new java.awt.Color(153, 255, 255));
        textPrincipal.setText("RONDA #");

        textPregunta.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textPregunta.setForeground(new java.awt.Color(153, 255, 255));
        textPregunta.setText("Pregunta");

        checkRespuesta1.setBackground(new java.awt.Color(51, 51, 51));
        checkRespuesta1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        checkRespuesta1.setForeground(new java.awt.Color(153, 255, 255));
        checkRespuesta1.setText("Respuesta 1");
        checkRespuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRespuesta1ActionPerformed(evt);
            }
        });

        checkRespuesta2.setBackground(new java.awt.Color(51, 51, 51));
        checkRespuesta2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        checkRespuesta2.setForeground(new java.awt.Color(153, 255, 255));
        checkRespuesta2.setText("Respuesta 2");

        checkRespuesta3.setBackground(new java.awt.Color(51, 51, 51));
        checkRespuesta3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        checkRespuesta3.setForeground(new java.awt.Color(153, 255, 255));
        checkRespuesta3.setText("Respuesta 3");

        checkRespuesta4.setBackground(new java.awt.Color(51, 51, 51));
        checkRespuesta4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        checkRespuesta4.setForeground(new java.awt.Color(153, 255, 255));
        checkRespuesta4.setText("Respuesta 4");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonRegresar.setBackground(new java.awt.Color(51, 51, 51));
        botonRegresar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(153, 255, 255));
        botonRegresar.setText("Retirarse");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        botonSiguiente.setBackground(new java.awt.Color(51, 51, 51));
        botonSiguiente.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        botonSiguiente.setForeground(new java.awt.Color(153, 255, 255));
        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(botonRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSiguiente)
                .addGap(70, 70, 70))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegresar)
                    .addComponent(botonSiguiente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textPremios.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textPremios.setForeground(new java.awt.Color(153, 255, 255));
        textPremios.setText("PREMIOS");

        textPremio1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textPremio1.setForeground(new java.awt.Color(153, 255, 255));
        textPremio1.setText("Premio 1");

        textPremio2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textPremio2.setForeground(new java.awt.Color(153, 255, 255));
        textPremio2.setText("Premio 2");

        textPremio3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textPremio3.setForeground(new java.awt.Color(153, 255, 255));
        textPremio3.setText("Premio 3");

        textPremio4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textPremio4.setForeground(new java.awt.Color(153, 255, 255));
        textPremio4.setText("Premio 4");

        textPremio5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textPremio5.setForeground(new java.awt.Color(153, 255, 255));
        textPremio5.setText("Premio 5");

        textAcumulado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textAcumulado.setForeground(new java.awt.Color(153, 255, 255));
        textAcumulado.setText("ACUMULADO: ?");

        textJugador.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textJugador.setForeground(new java.awt.Color(153, 255, 255));
        textJugador.setText("Jugador: Nombre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textAcumulado)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textPremio5)
                        .addComponent(textPremio4)
                        .addComponent(textPremio3)
                        .addComponent(textPremio2)
                        .addComponent(textPremio1)
                        .addComponent(textJugador))
                    .addComponent(textPremios))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(textJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textPremios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(textPremio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPremio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPremio3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPremio4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPremio5)
                .addGap(18, 18, 18)
                .addComponent(textAcumulado)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkRespuesta2)
                            .addComponent(checkRespuesta1)
                            .addComponent(checkRespuesta3)
                            .addComponent(checkRespuesta4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(textPregunta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(textPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(textPregunta)
                .addGap(18, 18, 18)
                .addComponent(checkRespuesta1)
                .addGap(18, 18, 18)
                .addComponent(checkRespuesta2)
                .addGap(18, 18, 18)
                .addComponent(checkRespuesta3)
                .addGap(18, 18, 18)
                .addComponent(checkRespuesta4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPrincipal)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        String respuestaCorrecta = respuestaCorrecta = respuestaCorrrecta();

        String respuestaSeleccionada = checkRespuesta1.isSelected() ? checkRespuesta1.getText() : checkRespuesta2.isSelected()
                ? checkRespuesta2.getText() : checkRespuesta3.isSelected() ? checkRespuesta3.getText()
                : checkRespuesta4.isSelected() ? checkRespuesta4.getText() : "";

        if (checkRespuesta1.isSelected() || checkRespuesta2.isSelected() || checkRespuesta3.isSelected()
                || checkRespuesta4.isSelected()) {
            if (ronda >= 1 && ronda <= 5 && respuestaSeleccionada.equals(respuestaCorrecta)) {
                acumulado += rondas.get(ronda - 1).getPremio();
                ronda++;
                if (ronda < 6) {
                    establecerPreguntas();
                    establecerExtras();
                    grupoRespuestas.clearSelection();
                }
                if (ronda > 5) {
                    estado = "Ganador";
                    JOptionPane.showMessageDialog(null, "Felicidades Has Ganado la Partida");
                    partida = new PartidaDTO(acumulado, tipoSalida());
                    main.insertarHistorial(partida, jugador);
                    VolverInicio();
                }

            } else if (ronda >= 1 && ronda <= 5 && !(respuestaSeleccionada.equals(respuestaCorrecta))) {
                estado = "Perdedor";
                JOptionPane.showMessageDialog(null, "Te Equivocates y Perdiste la Partida");
                acumulado = 0;
                partida = new PartidaDTO(acumulado, tipoSalida());
                main.insertarHistorial(partida, jugador);
                VolverInicio();

            } else {
                JOptionPane.showMessageDialog(null, "Error Desconocido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una respuesta");
        }
        if (ronda > 4) {
            botonSiguiente.setText("Finalizar");
        }
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Desea Retirarse y Ganar " + acumulado + "Puntos?",
                "Retirarse", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (op == 0) {
            estado = "Retirado";
            partida = new PartidaDTO(acumulado, tipoSalida());
            main.insertarHistorial(partida, jugador);
            VolverInicio();
        }
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void checkRespuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRespuesta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRespuesta1ActionPerformed

    private int tipoSalida() {
        int id = 0;
        for (SalidaDTO sal : salidas) {
            if (estado.equals(sal.getTipo())) {
                id = sal.getId();
            }
        }
        return id;
    }

    private String respuestaCorrrecta() {
        RespuestaDTO corr = null;

        for (RespuestaDTO r : respuestas) {
            if (r.isCorrecta()) {
                corr = r;
            }
        }
        return corr.getRespuesta();
    }

    private void VolverInicio() {
        Inicio inicio = new Inicio();
        this.dispose();
        inicio.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JCheckBox checkRespuesta1;
    private javax.swing.JCheckBox checkRespuesta2;
    private javax.swing.JCheckBox checkRespuesta3;
    private javax.swing.JCheckBox checkRespuesta4;
    private javax.swing.ButtonGroup grupoRespuestas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel textAcumulado;
    private javax.swing.JLabel textJugador;
    private javax.swing.JLabel textPregunta;
    private javax.swing.JLabel textPremio1;
    private javax.swing.JLabel textPremio2;
    private javax.swing.JLabel textPremio3;
    private javax.swing.JLabel textPremio4;
    private javax.swing.JLabel textPremio5;
    private javax.swing.JLabel textPremios;
    private javax.swing.JLabel textPrincipal;
    // End of variables declaration//GEN-END:variables
}
