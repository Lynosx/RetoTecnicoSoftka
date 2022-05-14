package dominio;

public class SalidaDTO {

    private int id;
    private String tipo;

    public SalidaDTO() {
    }

    public SalidaDTO(int id) {
        this.id = id;
    }

    public SalidaDTO(String tipo) {
        this.tipo = tipo;
    }

    public SalidaDTO(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
