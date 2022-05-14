package datos;

import dominio.JugadorDTO;
import java.sql.*;
import java.util.*;

public class JugadorDaoJDBC {

    private static final String SQL_SELECT = "SELECT * FROM jugador ORDER BY id ";
    private static final String SQL_INSERT = "INSERT INTO jugador(nombre, partida_id) VALUES(?, ?)";

    public JugadorDaoJDBC() {
    }

    public List<JugadorDTO> seleccionar() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        JugadorDTO jugador = null;

        List<JugadorDTO> jugadores = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_SELECT);
            rs = pstm.executeQuery();

            while (rs.next()) {
                int idj = rs.getInt("id");
                String nom = rs.getString("nombre");
                int idpar = rs.getInt("partida_id");

                jugador = new JugadorDTO(idj, nom, idpar);

                jugadores.add(jugador);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstm);
            Conexion.close(conn);

        }
        return jugadores;
    }

    public int insertar(JugadorDTO jugador) {
        Connection conn = null;
        PreparedStatement pstm = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_INSERT);

            pstm.setString(1, jugador.getNombre());
            pstm.setInt(2, jugador.getPartidaId());

            registros = pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(pstm);
            Conexion.close(conn);

        }
        return registros;
    }
}
