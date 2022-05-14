package dominio;

public class PreguntaDTO {

    private int id;
    private String pregunta;
    private int categoriaId;

    public PreguntaDTO() {
    }

    public PreguntaDTO(int id) {
        this.id = id;
    }

    public PreguntaDTO(String pregunta, int categoriaId) {
        this.pregunta = pregunta;
        this.categoriaId = categoriaId;
    }

    public PreguntaDTO(int id, String pregunta, int categoriaId) {
        this.id = id;
        this.pregunta = pregunta;
        this.categoriaId = categoriaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoria(int categoriaId) {
        this.categoriaId = categoriaId;
    }
}
