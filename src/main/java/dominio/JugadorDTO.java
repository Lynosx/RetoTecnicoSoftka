package dominio;

public class JugadorDTO {

    private int id;
    private String nombre;
    private int partidaId;

    public JugadorDTO() {
    }

    public JugadorDTO(int id) {
        this.id = id;
    }

    public JugadorDTO(String nombre, int partidaId) {
        this.nombre = nombre;
        this.partidaId = partidaId;
    }

    public JugadorDTO(int id, String nombre, int partidaId) {
        this.id = id;
        this.nombre = nombre;
        this.partidaId = partidaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidaId() {
        return partidaId;
    }

    public void setPartidaId(int partidaId) {
        this.partidaId = partidaId;
    }
}
