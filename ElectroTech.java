import java.util.ArrayList;

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
        for (Dispositivo dispositivo : data.readData()) {
            dispositivos.add(dispositivo);
        }
        return dispositivos;
    }

    /**
     * @description Metodo que buscara individualmente a un dispositivo usando su id
     * @param id
     * @return Dispositivo
     */
    public Dispositivo buscarDispositivo(int id){
        Dispositivo nDispositivo = null;
        for (Dispositivo dispositivo : dispositivos) {
            if(dispositivo.getId() == id){
                nDispositivo = dispositivo;
            }
        }
        return nDispositivo;
    }

    public Dispositivo masCaro(){
        Dispositivo masCaro = dispositivos.get(0);
        for (Dispositivo dispositivo : dispositivos) {
            if(masCaro.compareTo(dispositivo)>0){
                masCaro = dispositivo;
            }
        }
        return masCaro;
    }

    public Dispositivo masBarato(){
        Dispositivo masBarato = dispositivos.get(0);
        for (Dispositivo dispositivo : dispositivos) {
            if(masBarato.compareTo(dispositivo)<0){
                masBarato = dispositivo;
            }
        }
        return masBarato;
    }





    
}
