package datos;

import dominio.CategoriaDTO;
import java.sql.*;
import java.util.*;

public class CategoriaDaoJDBC {

    private static final String SQL_SELECT = "SELECT * FROM categoria ORDER BY id ";

    public CategoriaDaoJDBC() {
    }

    public List<CategoriaDTO> seleccionar() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        CategoriaDTO cat = null;

        List<CategoriaDTO> categorias = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_SELECT);
            rs = pstm.executeQuery();

            while (rs.next()) {
                int idcat = rs.getInt("id");
                String categ = rs.getString("dificultad");

                cat = new CategoriaDTO(idcat, categ);

                categorias.add(cat);
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
