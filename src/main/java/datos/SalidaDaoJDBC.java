package datos;

import dominio.SalidaDTO;
import java.sql.*;
import java.util.*;

public class SalidaDaoJDBC {

    private static final String SQL_SELECT = "SELECT * FROM salida";

    public SalidaDaoJDBC() {
    }

    public List<SalidaDTO> seleccionar() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        SalidaDTO sal = null;

        List<SalidaDTO> salidas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_SELECT);
            rs = pstm.executeQuery();

            while (rs.next()) {
                int idsal = rs.getInt("id");
                String salida = rs.getString("tipo");

                sal = new SalidaDTO(idsal, salida);

                salidas.add(sal);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstm);
            Conexion.close(conn);
        }
        return salidas;
    }
}
