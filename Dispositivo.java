/**
 * @author Diego Oswaldo Flores Rivas 23714
 * @version 3.0
 * @description Programa que se encargara de llevar el control de los dispositivos de una tienda llamada ElectroTech
 */
public class Dispositivo implements Comparable<Dispositivo>{

    protected int id;
    protected String ram;
    protected String almacenamiento;
    protected String description;
    protected double precio;
    protected int visaCuotas;
    protected String marca;
    protected String modelo;
    protected boolean encendido;
    protected int volumen;
    protected int brillo;
    protected int videos;

    /**
     * @description Constructor encargado de inicializar todos los atributos
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
     */
    public Dispositivo(int id, String ram, String almacenamiento, String description, double precio, int visaCuotas,
            String marca, String modelo, boolean encendido, int volumen, int brillo, int videos) {
        this.id = id;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.description = description;
        this.precio = precio;
        this.visaCuotas = visaCuotas;
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = encendido;
        this.volumen = volumen;
        this.brillo = brillo;
        this.videos = videos;
    }

     /**
     * @description Metodo que compara dos dispositivos en base a su precio
     * @param dispositivo
     * @return int
     */
    @Override
    public int compareTo(Dispositivo dispositivo) {
        if(this.getPrecio()>dispositivo.getPrecio()){
            return 1;
        }else if(this.getPrecio()<dispositivo.getPrecio()){
            return -1;
        }else{
            return 0;
        }
    }

    /**
     * @description Obtiene el id
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * @description Obtiene la ram
     * @return String
     */
    public String getRam() {
        return ram;
    }

    /**
     * @description Obtiene el almacenamiento
     * @return String
     */
    public String getAlmacenamiento() {
        return almacenamiento;
    }

    /**
     * @description Obtiene la descripcion
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * @description Obtiene el precio
     * @return double
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @description Obtiene las visa cuotas
     * @return int
     */
    public int getVisaCuotas() {
        return visaCuotas;
    }

    /**
     * @description Obtiene la marca
     * @return String
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @description Obtiene el modelo
     * @return String
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @description Obtiene si esta encendido
     * @return boolean
     */
    public boolean isEncendido() {
        return encendido;
    }

    /**
     * @description Obtiene el volumen
     * @return int
     */
    public int getVolumen() {
        return volumen;
    }

    /**
     * @description Obtiene el brillo
     * @return int
     */
    public int getBrillo() {
        return brillo;
    }

    /**
     * @description Obtiene los videos
     * @return int
     */
    public int getVideos() {
        return videos;
    }

    /**
     * @description Asigna el id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @description regresa todos los atributos
     * @return String
     */
    @Override
    public String toString() {
        return "Dispositivo [id=" + id + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", description="
                + description + ", precio=" + precio + ", visaCuotas=" + visaCuotas + ", marca=" + marca + ", modelo="
                + modelo + ", encendido=" + encendido + ", volumen=" + volumen + ", brillo=" + brillo + ", videos="
                + videos + "]";
    }
    
}
