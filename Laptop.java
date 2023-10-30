public class Laptop extends Dispositivo {
    
    private int velocidadCPU;
    private int velocidadGPU;
    private String tipoAlmacenamiento;

    /**
     * 
     * @param id
     * @param ram
     * @param almacenamiento
     * @param description
     * @param precio
     * @param visaCuotas
     * @param marca
     * @param modelo
     * @param encendido
     * @param volumen
     * @param brillo
     * @param videos
     * @param velocidadCPU
     * @param velocidadGPU
     * @param tipoAlmacenamiento
     */
    public Laptop(int id, String ram, String almacenamiento, String description, double precio, int visaCuotas,
            String marca, String modelo, boolean encendido, int volumen, int brillo, int videos, int velocidadCPU,
            int velocidadGPU, String tipoAlmacenamiento) {
        super(id, ram, almacenamiento, description, precio, visaCuotas, marca, modelo, encendido, volumen, brillo,
                videos);
        this.velocidadCPU = velocidadCPU;
        this.velocidadGPU = velocidadGPU;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public int getVelocidadCPU() {
        return velocidadCPU;
    }

    public int getVelocidadGPU() {
        return velocidadGPU;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    @Override
    public String toString() {
        return super.toString()+"velocidadCPU=" + velocidadCPU + ", velocidadGPU=" + velocidadGPU + ", tipoAlmacenamiento="
                + tipoAlmacenamiento + "]";
    }

    

    
}
