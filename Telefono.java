public class Telefono extends Dispositivo implements iDispositivo{
    
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

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    @Override
    public void subirVolumen() {
        if(this.volumen<=100){
            this.volumen = this.volumen+2;
        }
    }

    @Override
    public void bajarVolumen() {
        if(this.volumen>=2){
            this.volumen = this.volumen-2;
        }
    }

    @Override
    public void subirBrillo() {
        if(this.brillo<=100){
            this.brillo = this.brillo+3;
        }
    }

    @Override
    public void bajarBrillo() {
        if(this.volumen>=3){
            this.volumen = this.volumen-3;
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nTelefono\n");
        System.out.println("Precio: "+this.precio);
        System.out.println("Visa cuotas: "+this.visaCuotas);
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
    }

    @Override
    public void mostrarEstado() {
        System.out.println("RAM: "+this.ram);
        System.out.println("Procesador: "+this.procesador);
        System.out.println("Almacenamiento: "+this.almacenamiento);
        System.out.println("Acepta tarjeta externa: "+this.microusbExterna);
        System.out.println("Incluye cargador: "+this.incluyeCargador);
        System.out.println("Es 5G: "+this.is5G);
    }

    @Override
    public void controlarPublicidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'controlarPublicidad'");
    }

    
    
    
}
