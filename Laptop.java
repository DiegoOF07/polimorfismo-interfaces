/**
 * @author Diego Oswaldo Flores Rivas 23714
 * @version 3.0
 * @description Programa que se encargara de llevar el control de los dispositivos de una tienda llamada ElectroTech
 */
public class Laptop extends Dispositivo implements iDispositivo{
    
    private int velocidadCPU;
    private int velocidadGPU;
    private String tipoAlmacenamiento;

    /**
     * @description Constructor que inicializa todos los atributos
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

    /**
     * @description Obtiene la velocidad de la CPU
     * @return int
     */
    public int getVelocidadCPU() {
        return velocidadCPU;
    }

    /**
     * @description Obtiene la velocidad de la GPU
     * @return int
     */
    public int getVelocidadGPU() {
        return velocidadGPU;
    }

    /**
     * @description Obtiene el tipo de almacenamiento
     * @return String
     */
    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    /**
     * @description Obtiene todos los atributos de la clase
     * @return String
     */
    @Override
    public String toString() {
        return super.toString()+"velocidadCPU=" + velocidadCPU + ", velocidadGPU=" + velocidadGPU + ", tipoAlmacenamiento="
                + tipoAlmacenamiento + "]";
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
            this.volumen = this.volumen+10;
        }
    }

    /**
     * @description Baja el volumen del dispositivo
     */
    @Override
    public void bajarVolumen() {
        if(this.volumen>=10){
            this.volumen = this.volumen-10;
        }
    }

    /**
     * @description Sube el brillo del dispositivo
     */
    @Override
    public void subirBrillo() {
        if(this.brillo<=100){
            this.brillo = this.brillo+5;
        }
    }

    /**
     * @description Baja el brillo del dispositivo
     */
    @Override
    public void bajarBrillo() {
        if(this.volumen>=5){
            this.volumen = this.brillo-5;
        }
    }

    /**
     * @description Muestra la informacion del dispositivo
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("\nLaptop\n");
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
        System.out.println("Almacenamiento: "+this.almacenamiento);
        System.out.println("Tipo de almacenamiento: "+this.tipoAlmacenamiento);
        System.out.println("Velocidad de CPU: "+this.velocidadCPU);
        System.out.println("Velocidad GPU: "+this.velocidadGPU);
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
