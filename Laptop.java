public class Laptop extends Dispositivo implements iDispositivo{
    
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
            this.volumen = this.volumen+10;
        }
    }

    @Override
    public void bajarVolumen() {
        if(this.volumen>=10){
            this.volumen = this.volumen-10;
        }
    }

    @Override
    public void subirBrillo() {
        if(this.brillo<=100){
            this.brillo = this.brillo+5;
        }
    }

    @Override
    public void bajarBrillo() {
        if(this.volumen>=5){
            this.volumen = this.volumen-5;
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nLaptop\n");
        System.out.println("Precio: "+this.precio);
        System.out.println("Visa cuotas: "+this.visaCuotas);
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
    }

    @Override
    public void mostrarEstado() {
        System.out.println("RAM: "+this.ram);
        System.out.println("Almacenamiento: "+this.almacenamiento);
        System.out.println("Tipo de almacenamiento: "+this.tipoAlmacenamiento);
        System.out.println("Velocidad de CPU: "+this.velocidadCPU);
        System.out.println("Velocidad GPU: "+this.velocidadGPU);
    }

    @Override
    public void controlarPublicidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'controlarPublicidad'");
    }

    

    
}
