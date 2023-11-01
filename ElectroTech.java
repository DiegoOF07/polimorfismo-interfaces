import java.util.ArrayList;

/**
 * @author Diego Oswaldo Flores Rivas 23714
 * @version 3.0
 * @description Programa que se encargara de llevar el control de los dispositivos de una tienda llamada ElectroTech
 */

public class ElectroTech{
    private ArrayList<Dispositivo> dispositivos;
    private Data data;
    
    public ElectroTech(){
        dispositivos = new ArrayList<Dispositivo>();
        data = new Data("dispositivosEnBodega.csv");
    }

    /**
     * @description Metodo que retornara todos los dispositivos
     * @return ArrayList<Dispositivo>
     * @throws Exception
     * @changes El metodo retornara una lista de dispositivos
     */
    public ArrayList<Dispositivo> mostrarDispositivos() throws Exception{
        if(dispositivos.size()==0){
            for (Dispositivo dispositivo : data.readData()) {
                dispositivos.add(dispositivo);
            }
        }
        return dispositivos;
    }

    /**
     * @description Metodo que buscara individualmente a un dispositivo usando su id
     * @param id
     * @return Dispositivo
     */
    public Dispositivo buscarDispositivo(int id) throws Exception{
        if(dispositivos.size()==0){
            for (Dispositivo dispositivo : data.readData()) {
            dispositivos.add(dispositivo);
            }
        }

        Dispositivo nDispositivo = null;
        for (Dispositivo dispositivo : dispositivos) {
            if(dispositivo.getId() == id){
                nDispositivo = dispositivo;
            }
        }
        return nDispositivo;
    }

    /**
     * @description Metodo que retornara el dispositivo mas caro
     * @return Dispositivo
     * @throws Exception
     */
    public Dispositivo masCaro() throws Exception{
        if(dispositivos.size()==0){
            for (Dispositivo dispositivo : data.readData()) {
            dispositivos.add(dispositivo);
            }
        }
        Dispositivo masCaro = dispositivos.get(0);
        for (Dispositivo dispositivo : dispositivos) {
            if(masCaro.compareTo(dispositivo)<0){
                masCaro = dispositivo;
            }
        }
        return masCaro;
    }

    /**
     * @description Metodo que retorna al dispositivo mas barato
     * @return Dispositivo
     * @throws Exception
     */
    public Dispositivo masBarato() throws Exception{
        if(dispositivos.size()==0){
            for (Dispositivo dispositivo : data.readData()) {
            dispositivos.add(dispositivo);
            }
        }
        Dispositivo masBarato = dispositivos.get(0);
        for (Dispositivo dispositivo : dispositivos) {
            if(masBarato.compareTo(dispositivo)>0){
                masBarato = dispositivo;
            }
        }
        return masBarato;
    }





    
}
