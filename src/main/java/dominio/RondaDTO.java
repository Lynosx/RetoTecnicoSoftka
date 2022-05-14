package dominio;

public class RondaDTO {

    private int id;
    private String ronda;
    private float premio;

    public RondaDTO() {
    }

    public RondaDTO(int id) {
        this.id = id;
    }

    public RondaDTO(String ronda, float premio) {
        this.ronda = ronda;
        this.premio = premio;
    }

    public RondaDTO(int id, String ronda, float premio) {
        this.id = id;
        this.ronda = ronda;
        this.premio = premio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPremio() {
        return premio;
    }

    public void setPremio(float premio) {
        this.premio = premio;
    }

    public String getRonda() {
        return ronda;
    }

    public void setRonda(String ronda) {
        this.ronda = ronda;
    }
}
