package datos;

import dominio.RondaDTO;
import java.sql.*;
import java.util.*;

public class RondaDaoJDBC {

    private static final String SQL_SELECT = "SELECT * FROM ronda";

    public RondaDaoJDBC() {
    }

    public List<RondaDTO> seleccionar() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        RondaDTO pre = null;

        List<RondaDTO> categorias = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_SELECT);
            rs = pstm.executeQuery();

            while (rs.next()) {
                int idron = rs.getInt("id");
                String ronda = rs.getString("ronda");
                float premio = rs.getFloat("premio");

                pre = new RondaDTO(idron, ronda, premio);

                categorias.add(pre);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstm);
            Conexion.close(conn);
        }
        return categorias;
    }
}
