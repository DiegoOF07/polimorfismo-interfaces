/**
 * @author Diego Oswaldo Flores Rivas 23714
 * @version 3.0
 * @description Programa que se encargara de llevar el control de los dispositivos de una tienda llamada ElectroTech
 */
public class Telefono extends Dispositivo implements iDispositivo{
    
    private String procesador;
    private boolean microusbExterna;
    private boolean incluyeCargador;
    private boolean is5G;

    /**
     * @description Contructor que inicializara todos los atributos
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

    /**
     * @description Obtiene el procesador
     * @return String
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @description Obtiene si admite la microusb
     * @return boolean
     */
    public boolean isMicrousbExterna() {
        return microusbExterna;
    }

    /**
     * @description Obtiene si incluye cargador
     * @return boolean
     */
    public boolean isIncluyeCargador() {
        return incluyeCargador;
    }

    /**
     * @description Obtiene si es 5G
     * @return boolean
     */
    public boolean isIs5G() {
        return is5G;
    }

    /**
     * @description Obtiene todos los atributos de la clase
     * @return String
     */
    @Override
    public String toString() {
        return super.toString()+"procesador=" + procesador + ", microusbExterna=" + microusbExterna + ", incluyeCargador="
                + incluyeCargador + ", is5G=" + is5G + "]";
    }

    /**
     * @description Enciende el dispositivo
     */
    @Override
    public void encender() {
        this.encendido = true;
    }

    /**
     * @description Apaga el dispositivo
     */
    @Override
    public void apagar() {
        this.encendido = false;
    }

    /**
     * @description Sube el volumen del dispositivo
     */
    @Override
    public void subirVolumen() {
        if(this.volumen<=100){
            this.volumen = this.volumen+2;
        }
    }

    /**
     * @description Baja el volumen del dispositivo
     */
    @Override
    public void bajarVolumen() {
        if(this.volumen>=2){
            this.volumen = this.volumen-2;
        }
    }

    /**
     * @description Sube el brillo del dispositivo
     */
    @Override
    public void subirBrillo() {
        if(this.brillo<=100){
            this.brillo = this.brillo+3;
        }
    }

    /**
     * @description Baja el brillo del dispositivo
     */
    @Override
    public void bajarBrillo() {
        if(this.volumen>=3){
            this.volumen = this.brillo-3;
        }
    }

    /**
     * @description Muestra la informacion del dispositivo
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("\nTelefono\n");
        System.out.println("Precio: "+this.precio);
        System.out.println("Visa cuotas: "+this.visaCuotas);
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
    }

    /**
     * @description Muestra el estado del dispositivo
     */
    @Override
    public void mostrarEstado() {
        System.out.println("RAM: "+this.ram);
        System.out.println("Procesador: "+this.procesador);
        System.out.println("Almacenamiento: "+this.almacenamiento);
        System.out.println("Acepta tarjeta externa: "+this.microusbExterna);
        System.out.println("Incluye cargador: "+this.incluyeCargador);
        System.out.println("Es 5G: "+this.is5G);
        System.out.println("Volumen: "+this.volumen);
        System.out.println("Brillo: "+this.brillo);
        System.out.println("Encendido: "+this.encendido);
    }

    /**
     * @description Controla la publicidad del dispositivo
     */
    @Override
    public void controlarPublicidad() {
        for (int i = 1; i <= this.videos; i++) {
            System.out.println("\nEl video #"+i+" se esta reproduciendo");
            System.out.println("El video #"+i+" se ha terminado");
            System.out.println("Cambiando de video...");
        }
    }

    
    
    
}
