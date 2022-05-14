package dominio;

public class PartidaDTO {

    private int id;
    private int pacumulado;
    private int salidaId;

    public PartidaDTO() {
    }

    public PartidaDTO(int id) {
        this.id = id;
    }

    public PartidaDTO(int pacumulado, int salidaId) {
        this.pacumulado = pacumulado;
        this.salidaId = salidaId;
    }

    public PartidaDTO(int id, int pacumulado, int salidaId) {
        this.id = id;
        this.pacumulado = pacumulado;
        this.salidaId = salidaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPacumulado() {
        return pacumulado;
    }

    public void setPacumulado(int pacumulado) {
        this.pacumulado = pacumulado;
    }

    public int getSalidaId() {
        return salidaId;
    }

    public void setSalidaId(int salidaId) {
        this.salidaId = salidaId;
    }
}
