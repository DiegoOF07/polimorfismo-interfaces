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

    @Override
    public int compareTo(Dispositivo o) {
        if(this.getPrecio()>o.getPrecio()){
            return 1;
        }else if(this.getPrecio()<o.getPrecio()){
            return -1;
        }else{
            return 0;
        }
    }

    public int getId() {
        return id;
    }

    public String getRam() {
        return ram;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public String getDescription() {
        return description;
    }

    public double getPrecio() {
        return precio;
    }

    public int getVisaCuotas() {
        return visaCuotas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getBrillo() {
        return brillo;
    }

    public int getVideos() {
        return videos;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dispositivo [id=" + id + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", description="
                + description + ", precio=" + precio + ", visaCuotas=" + visaCuotas + ", marca=" + marca + ", modelo="
                + modelo + ", encendido=" + encendido + ", volumen=" + volumen + ", brillo=" + brillo + ", videos="
                + videos + "]";
    }

    

    
}
