import java.util.ArrayList;

public class ElectroTech {
    private ArrayList<Dispositivo> dispositivos;
    private Data data;
    
    public ElectroTech(){
        dispositivos = new ArrayList<Dispositivo>();
        data = new Data("dispositivosEnBodega.csv");
    }

    
}
