import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Data {
    private File file;

    /**
     * @description Constructor que inicializa el archivo .CSV
     * @param fileName
     */
    public Data(String fileName){
        file = new File(fileName);
    }
    
    /** 
     * @description Metodo que lee el archivo .CSV en busca de todos los dispositivos
     * @return ArrayList<Jugador>
     * @throws Exception
     */
    public ArrayList<Dispositivo> readData() throws Exception{
        ArrayList<Dispositivo> guardados = new ArrayList<Dispositivo>();
        BufferedReader bufer = new BufferedReader(new FileReader(file));
        String linea = bufer.readLine();
        while(linea != null){
            List<String> items = Stream.of(linea.split("\\s*,\\s*")).toList();
            linea = bufer.readLine();
            if(items.get(items.size()-1).equals("1")){
                guardados.add(
                    new Telefono(
                        Integer.parseInt(items.get(0)), 
                        items.get(1), 
                        items.get(2), 
                        items.get(3), 
                        Double.parseDouble(items.get(4)), 
                        Integer.parseInt(items.get(5)), 
                        items.get(6),items.get(7),
                        Boolean.parseBoolean(items.get(8)), 
                        Integer.parseInt(items.get(9)), 
                        Integer.parseInt(items.get(10)), 
                        Integer.parseInt(items.get(11)),
                        items.get(12),
                        Boolean.parseBoolean(items.get(13)),
                        Boolean.parseBoolean(items.get(14)), 
                        Boolean.parseBoolean(items.get(15))
                        )
                    );
            }else{
                guardados.add(
                    new Laptop(
                        Integer.parseInt(items.get(0)), 
                        items.get(1), 
                        items.get(2), 
                        items.get(3), 
                        Double.parseDouble(items.get(4)), 
                        Integer.parseInt(items.get(5)), 
                        items.get(6),items.get(7),
                        Boolean.parseBoolean(items.get(8)), 
                        Integer.parseInt(items.get(9)), 
                        Integer.parseInt(items.get(10)), 
                        Integer.parseInt(items.get(11)),
                        Integer.parseInt(items.get(16)),
                        Integer.parseInt(items.get(17)),
                        items.get(18)
                    )
                );
            }
        }
        bufer.close();
        return guardados;
    }
}
