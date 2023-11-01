/**
 * @author Diego Oswaldo Flores Rivas 23714
 * @version 3.0
 * @description Programa que se encargara de llevar el control de los dispositivos de una tienda llamada ElectroTech
 */
public interface iDispositivo {

    public abstract void encender();
    public abstract void apagar();
    public abstract void subirVolumen();
    public abstract void bajarVolumen();
    public abstract void subirBrillo();
    public abstract void bajarBrillo();
    public abstract void mostrarInformacion();
    public abstract void mostrarEstado();
    public abstract void controlarPublicidad();
    
}