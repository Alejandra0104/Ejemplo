public class objFastFood 
{
    private int tipo;
    private int tam;
    private int descripcion;
    private double vr;
    private boolean servicio;

    public objFastFood() { }

    public objFastFood(int tipo, int tam, int descripcion, double vr, boolean servicio) 
    {
        this.tipo = tipo;
        this.tam = tam;
        this.descripcion = descripcion;
        this.vr = vr;
        this.servicio = servicio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public double getVr() {
        return vr;
    }

    public void setVr(double vr) {
        this.vr = vr;
    }

    public boolean isServicio() {
        return servicio;
    }

    public void setServicio(boolean servicio) {
        this.servicio = servicio;
    }

}
