public class objFastFood 
{
    private String tipo;
    private String tam;
    private String descripcion;
    private int vr;
    private boolean servicio;

    public objFastFood() { }

    public objFastFood(String tipo, String tam, String descripcion, int vr, boolean servicio) 
    {
        this.tipo = tipo;
        this.tam = tam;
        this.descripcion = descripcion;
        this.vr = vr;
        this.servicio = servicio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getVr() {
        return vr;
    }

    public void setVr(int vr) {
        this.vr = vr;
    }

    public boolean isServicio() {
        return servicio;
    }

    public void setServicio(boolean servicio) {
        this.servicio = servicio;
    }

}
