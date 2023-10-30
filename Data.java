import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Data {
    private File file;

    public Data(String fileName){
        file = new File(fileName);
    }
    
    /** 
     * @return ArrayList<Jugador>
     * @throws Exception
     */
    public ArrayList<Dispositivo> readData() throws Exception{
        ArrayList<Dispositivo> archivados = new ArrayList<Dispositivo>();
        BufferedReader bufer = new BufferedReader(new FileReader(file));
        String linea = bufer.readLine();
        while(linea != null){
            List<String> items = Stream.of(linea.split("\\s*,\\s*")).toList();
            linea = bufer.readLine();
        }
        if(linea !=null){
            bufer.close();
        }
        return archivados;
    }
}
