package vista;

import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonIniciar = new javax.swing.JButton();
        botonAgregarP = new javax.swing.JButton();
        botonHistorial = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botonIniciar.setBackground(new java.awt.Color(51, 51, 51));
        botonIniciar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        botonIniciar.setForeground(new java.awt.Color(153, 255, 255));
        botonIniciar.setText("Iniciar Partida");
        botonIniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonIniciar.setFocusable(false);
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        botonAgregarP.setBackground(new java.awt.Color(51, 51, 51));
        botonAgregarP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        botonAgregarP.setForeground(new java.awt.Color(153, 255, 255));
        botonAgregarP.setText("Agregar Pregunta");
        botonAgregarP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarP.setFocusable(false);
        botonAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPActionPerformed(evt);
            }
        });

        botonHistorial.setBackground(new java.awt.Color(51, 51, 51));
        botonHistorial.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        botonHistorial.setForeground(new java.awt.Color(153, 255, 255));
        botonHistorial.setText("Ver Historial");
        botonHistorial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonHistorial.setFocusable(false);
        botonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHistorialActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(51, 51, 51));
        botonSalir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(153, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSalir.setFocusable(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAgregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        String nom = null;
        nom = JOptionPane.showInputDialog("Ingrese Su Nombre de Jugador");

        if (nom == null) {

        } else if (!(nom.trim()).equals("")) {
            if ((nom.trim()).length() <= 45) {
                Partida partida = new Partida(this, true, nom);
                this.dispose();
                partida.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Nombre Demasiado Largo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un Nombre Valido");
        }
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPActionPerformed
        AgregarPregunta nueva = new AgregarPregunta(this, true);
        this.dispose();
        nueva.setVisible(true);
    }//GEN-LAST:event_botonAgregarPActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHistorialActionPerformed
        VerHistorial historial = new VerHistorial(this, true);
        this.dispose();
        historial.setVisible(true);
    }//GEN-LAST:event_botonHistorialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarP;
    private javax.swing.JButton botonHistorial;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
