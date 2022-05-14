package datos;

import dominio.RespuestaDTO;
import java.sql.*;
import java.util.*;

public class RespuestaDaoJDBC {

    private static final String SQL_SELECT = "SELECT * FROM respuesta";
    private static final String SQL_INSERT = "INSERT INTO respuesta(respuesta, correcta, preguntas_id) VALUES(?, ?, ?)";
    private static final String SQL_SELECT_RESPUESTAS = "SELECT * FROM respuesta WHERE preguntas_id = ? ;";

    public RespuestaDaoJDBC() {
    }

    public List<RespuestaDTO> seleccionar() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        RespuestaDTO res = null;

        List<RespuestaDTO> respuestas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_SELECT);
            rs = pstm.executeQuery();

            while (rs.next()) {
                int idres = rs.getInt("id");
                String respu = rs.getString("respuesta");
                boolean corr = rs.getBoolean("correcta");
                int preid = rs.getInt("preguntas_id");

                res = new RespuestaDTO(idres, respu, corr, preid);

                respuestas.add(res);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstm);
            Conexion.close(conn);
        }
        return respuestas;
    }

    public int insertar(RespuestaDTO respuesta) {
        Connection conn = null;
        PreparedStatement pstm = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_INSERT);

            pstm.setString(1, respuesta.getRespuesta());
            pstm.setBoolean(2, respuesta.isCorrecta());
            pstm.setInt(3, respuesta.getPreguntasId());

            registros = pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(pstm);
            Conexion.close(conn);
        }
        return registros;
    }

    public List<RespuestaDTO> seleccionarRespuestas(int id) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        RespuestaDTO respuesta = null;
        List<RespuestaDTO> respuestas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_SELECT_RESPUESTAS);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            while (rs.next()) {
                int idres = rs.getInt("id");
                String resp = rs.getString("respuesta");
                boolean corr = rs.getBoolean("correcta");
                int idpre = rs.getInt("preguntas_id");

                respuesta = new RespuestaDTO(idres, resp, corr, idpre);
                respuestas.add(respuesta);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstm);
            Conexion.close(conn);
        }
        Collections.shuffle(respuestas);
        return respuestas;
    }
}
