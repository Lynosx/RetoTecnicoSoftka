package dominio;

public class RespuestaDTO {

    private int id;
    private String respuesta;
    private boolean correcta;
    private int preguntasId;

    public RespuestaDTO() {
    }

    public RespuestaDTO(int id) {
        this.id = id;
    }

    public RespuestaDTO(String respuesta, boolean correcta, int preguntasId) {
        this.respuesta = respuesta;
        this.correcta = correcta;
        this.preguntasId = preguntasId;
    }

    public RespuestaDTO(int id, String respuesta, boolean correcta, int preguntasId) {
        this.id = id;
        this.respuesta = respuesta;
        this.correcta = correcta;
        this.preguntasId = preguntasId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }

    public int getPreguntasId() {
        return preguntasId;
    }

    public void setPreguntasId(int preguntasId) {
        this.preguntasId = preguntasId;
    }
}
