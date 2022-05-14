package datos;

import dominio.PartidaDTO;
import java.sql.*;
import java.util.*;

public class PartidaDaoJDBC {

    private static final String SQL_SELECT = "SELECT * FROM partida ORDER BY id ";
    private static final String SQL_INSERT = "INSERT INTO partida(pacumulado, salida_id) VALUES(?, ?)";
    private static final String SQL_ULTIMO_ID = "SELECT max(id) ultima_id from partida;";

    public PartidaDaoJDBC() {
    }

    public List<PartidaDTO> seleccionar() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        PartidaDTO partida = null;

        List<PartidaDTO> partidas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_SELECT);
            rs = pstm.executeQuery();

            while (rs.next()) {
                int idpar = rs.getInt("id");
                int pac = rs.getInt("pacumulado");
                int said = rs.getInt("salida_id");

                partida = new PartidaDTO(idpar, pac, said);

                partidas.add(partida);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstm);
            Conexion.close(conn);

        }
        return partidas;
    }

    public int insertar(PartidaDTO partida) {
        Connection conn = null;
        PreparedStatement pstm = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_INSERT);

            pstm.setInt(1, partida.getPacumulado());
            pstm.setInt(2, partida.getSalidaId());

            registros = pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(pstm);
            Conexion.close(conn);
        }
        return registros;
    }

    public int ultimoID() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int id = 0;
        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_ULTIMO_ID);
            rs = pstm.executeQuery();
            if (rs.next()) {
                id = rs.getInt("ultima_id");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstm);
            Conexion.close(conn);
        }
        return id;
    }
}
