package dominio;

public class CategoriaDTO {

    private int id;
    private String categoria;

    public CategoriaDTO() {
    }

    public CategoriaDTO(int id) {
        this.id = id;
    }

    public CategoriaDTO(String categoria) {
        this.categoria = categoria;
    }

    public CategoriaDTO(int id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return categoria;
    }   
}
