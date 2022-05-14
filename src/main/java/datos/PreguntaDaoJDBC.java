package datos;

import dominio.PreguntaDTO;
import java.sql.*;
import java.util.*;

public class PreguntaDaoJDBC {

    private static final String SQL_SELECT = "SELECT * FROM pregunta ORDER BY id ";
    private static final String SQL_INSERT = "INSERT INTO pregunta(pregunta, categorias_id) VALUES(?, ?)";
    private static final String SQL_ULTIMO_ID = "SELECT max(id) ultima_id from pregunta;";
    private static final String SQL_SELECT_PREGUNTA = "SELECT * FROM pregunta WHERE categorias_id = ? ORDER BY RAND() LIMIT 1";

    public PreguntaDaoJDBC() {
    }

    public List<PreguntaDTO> seleccionar() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        PreguntaDTO pregunta = null;

        List<PreguntaDTO> preguntas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_SELECT);
            rs = pstm.executeQuery();

            while (rs.next()) {
                int idpre = rs.getInt("id");
                String preg = rs.getString("pregunta");
                int idcat = rs.getInt("categorias_id");

                pregunta = new PreguntaDTO(idpre, preg, idcat);

                preguntas.add(pregunta);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstm);
            Conexion.close(conn);
        }
        return preguntas;
    }

    public int insertar(PreguntaDTO pregunta) {
        Connection conn = null;
        PreparedStatement pstm = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_INSERT);

            pstm.setString(1, pregunta.getPregunta());
            pstm.setInt(2, pregunta.getCategoriaId());

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

    public List<PreguntaDTO> seleccionPreguntas() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        PreguntaDTO pregunta = null;

        List<PreguntaDTO> preguntas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            for (int i = 0; i < 5; i++) {
                pstm = conn.prepareStatement(SQL_SELECT_PREGUNTA);
                pstm.setInt(1, i + 1);
                rs = pstm.executeQuery();

                while (rs.next()) {
                    int idpre = rs.getInt("id");
                    String preg = rs.getString("pregunta");
                    int idcat = rs.getInt("categorias_id");

                    pregunta = new PreguntaDTO(idpre, preg, idcat);
                    preguntas.add(pregunta);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstm);
            Conexion.close(conn);
        }
        return preguntas;
    }
}
