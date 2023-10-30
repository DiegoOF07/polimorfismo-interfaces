public class Telefono extends Dispositivo{
    
    private String procesador;
    private boolean microusbExterna;
    private boolean incluyeCargador;
    private boolean is5G;

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
     * @param procesador
     * @param microusbExterna
     * @param incluyeCargador
     * @param is5g
     */
    public Telefono(int id, String ram, String almacenamiento, String description, double precio, int visaCuotas,
            String marca, String modelo, boolean encendido, int volumen, int brillo, int videos, String procesador,
            boolean microusbExterna, boolean incluyeCargador, boolean is5g) {
        super(id, ram, almacenamiento, description, precio, visaCuotas, marca, modelo, encendido, volumen, brillo,
                videos);
        this.procesador = procesador;
        this.microusbExterna = microusbExterna;
        this.incluyeCargador = incluyeCargador;
        is5G = is5g;
    }

    public String getProcesador() {
        return procesador;
    }

    public boolean isMicrousbExterna() {
        return microusbExterna;
    }

    public boolean isIncluyeCargador() {
        return incluyeCargador;
    }

    public boolean isIs5G() {
        return is5G;
    }

    @Override
    public String toString() {
        return super.toString()+"procesador=" + procesador + ", microusbExterna=" + microusbExterna + ", incluyeCargador="
                + incluyeCargador + ", is5G=" + is5G + "]";
    }

    
    
    
}
