import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Diego Oswaldo Flores Rivas 23714
 * @version 3.0
 * @description Programa que se encargara de llevar el control de los dispositivos de una tienda llamada ElectroTech
 */

public class Principal {

    /**
    * @description Metodo main que lanza el programa
    */
    public static void main(String[] args) {
        ElectroTech et = new ElectroTech();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMENU PRINCIPAL\n");
            System.out.println("1. Mostrar todos los dispositivos");
            System.out.println("2. Buscar un dispositivo");
            System.out.println("3. Interactuar con un dispositivo");
            System.out.println("4. Dispositivo mas caro");
            System.out.println("5. Dispositivo mas barato");
            System.out.println("6. Salir");
            System.out.print("Elige la opcion que desees: ");
            String op = sc.nextLine();
            switch (op) {
                case "1":
                    try {
                        for (Dispositivo dispositivo : et.mostrarDispositivos()) {
                            if(dispositivo instanceof Telefono){
                                ((Telefono)dispositivo).mostrarInformacion();  
                                ((Telefono)dispositivo).mostrarEstado(); 
                            }else{
                                ((Laptop)dispositivo).mostrarInformacion();
                                ((Laptop)dispositivo).mostrarEstado();
                            }
                            System.out.println("ID: "+dispositivo.getId());
                        }
                    } catch (Exception e) {
                        System.out.println("Ocurrio un problema al mostrar a todos los dispositivos");
                        sc.nextLine();
                    }
                    break;
                case "2":
                    try {
                        System.out.print("Ingresa el id del dispositivo que quieres buscar: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        Dispositivo dispo = et.buscarDispositivo(id);
                        if(dispo != null){
                            if(dispo instanceof Telefono){
                                ((Telefono)dispo).mostrarInformacion();  
                                ((Telefono)dispo).mostrarEstado(); 
                            }else{
                                ((Laptop)dispo).mostrarInformacion();
                                ((Laptop)dispo).mostrarEstado();
                            }
                            System.out.println("ID: "+dispo.getId());
                        }else{
                            System.out.println("No se encontro ese dispositivo");
                        }
                    }catch(InputMismatchException e){
                        System.out.println("Solo puedes ingresar numeros");
                        sc.nextLine();
                    }catch (Exception e) {
                        System.out.println("Ocurrio un error al cargar el dispositivo");
                        e.printStackTrace();
                    }
                    break;
                case "3":
                    try {
                        System.out.print("Ingresa el ID del dispositivo que deseas buscar: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        Dispositivo disp = et.buscarDispositivo(id);
                        boolean continuar2 = true;
                        if(disp!=null){
                            while (continuar2) {
                                System.out.println("\nMENU DEL DISPOSITIVO\n");
                                System.out.println("1. Encender");
                                System.out.println("2. Apagar");
                                System.out.println("3. Subir volumen");
                                System.out.println("4. Bajar volumen");
                                System.out.println("5. Subir brillo");
                                System.out.println("6. Bajar brillo");
                                System.out.println("7. Mostrar informacion");
                                System.out.println("8. Mostrar estado");
                                System.out.println("9. Controlar publicidad");
                                System.out.println("10. Regresar");
                                System.out.print("Elige la opcion que deseas: ");
                                String op2 = sc.nextLine();
                                switch (op2) {
                                    case "1":
                                        if(disp instanceof Telefono){
                                            ((Telefono)disp).encender();
                                        }else{
                                            ((Laptop)disp).encender();
                                        }
                                        System.out.println("\nDispositivo encendido correctamente\n");
                                        break;
                                    case "2":
                                        if(disp instanceof Telefono){
                                            ((Telefono)disp).apagar();
                                        }else{
                                            ((Laptop)disp).apagar();
                                        }
                                        System.out.println("\nDispositivo apagado correctamente\n");
                                        break;
                                    case "3":
                                        if(disp instanceof Telefono){
                                            ((Telefono)disp).subirVolumen();
                                            System.out.println("\nEl volumen aumento un 2%\n");
                                        }else{
                                            ((Laptop)disp).subirVolumen();
                                            System.out.println("\nEl volumen aumento un 10%\n");
                                        }
                                        break;
                                    case "4":
                                        if(disp instanceof Telefono){
                                            ((Telefono)disp).bajarVolumen();
                                            System.out.println("\nEl volumen se redujo un 2%\n");
                                        }else{
                                            ((Laptop)disp).bajarVolumen();
                                            System.out.println("El volumen se redujo un 10%");
                                        }
                                        break;
                                    case "5":
                                        if(disp instanceof Telefono){
                                            ((Telefono)disp).subirBrillo();
                                            System.out.println("\nEl brillo aumento un 3%\n");
                                        }else{
                                            ((Laptop)disp).subirBrillo();
                                            System.out.println("\nEl brillo aumento un 5%\n");
                                        }
                                        break;
                                    case "6":
                                        if(disp instanceof Telefono){
                                            ((Telefono)disp).bajarBrillo();
                                            System.out.println("\nEl brillo se redujo 3%\n");
                                        }else{
                                            ((Laptop)disp).bajarBrillo();
                                            System.out.println("\nEl brillo se redujo un 5%\n");
                                        }
                                        break;
                                    case "7":
                                        if(disp instanceof Telefono){
                                            ((Telefono)disp).mostrarInformacion();
                                        }else{
                                            ((Laptop)disp).mostrarInformacion();
                                        }
                                        break;
                                    case "8":
                                        System.out.println("\nEstado del dispostivo\n");
                                        if(disp instanceof Telefono){
                                            ((Telefono)disp).mostrarEstado();
                                        }else{
                                            ((Laptop)disp).mostrarEstado();
                                        }
                                        break;
                                    case "9":
                                        if(disp instanceof Telefono){
                                            ((Telefono)disp).controlarPublicidad();
                                        }else{
                                            ((Laptop)disp).controlarPublicidad();
                                        }
                                        break;
                                    case "10":
                                        continuar2 = false;
                                        break;
                                    default:
                                    System.out.println("Opcion invalida");
                                        break;
                                } 
                            }
                        }else{
                            System.out.println("No se encontro el dispositivo");
                        }
                        
                    } catch(InputMismatchException e){
                        System.out.println("Solo puedes ingresar numeros");
                        sc.nextLine();
                    }catch (Exception e) {
                        System.out.println("Ocurrio un problema al ingresar al dispositivo");
                    }
                    break;
                case "4":
                    try {
                        Dispositivo dispo = et.masCaro();
                        if(dispo != null){
                            if(dispo instanceof Telefono){
                                ((Telefono)dispo).mostrarInformacion();  
                                ((Telefono)dispo).mostrarEstado(); 
                            }else{
                                ((Laptop)dispo).mostrarInformacion();
                                ((Laptop)dispo).mostrarEstado();
                            }
                            System.out.println("ID: "+dispo.getId());
                        }else{
                            System.out.println("No se encontro un dispositivo mas caro que los demas");
                        }
                    }catch (Exception e) {
                        System.out.println("Ocurrio un error al cargar el dispositivo");
                        e.printStackTrace();
                    }
                    break;
                case "5":
                    try {
                        Dispositivo dispo = et.masBarato();
                        if(dispo != null){
                            if(dispo instanceof Telefono){
                                ((Telefono)dispo).mostrarInformacion();  
                                ((Telefono)dispo).mostrarEstado(); 
                            }else{
                                ((Laptop)dispo).mostrarInformacion();
                                ((Laptop)dispo).mostrarEstado();
                            }
                            System.out.println("ID: "+dispo.getId());
                        }else{
                            System.out.println("No se encontro un dispositivo mas caro que los demas");
                        }
                    }catch (Exception e) {
                        System.out.println("Ocurrio un error al cargar el dispositivo");
                        e.printStackTrace();
                    }
                    break;
                case "6":
                    continuar = false;
                    break; 
                default:
                System.out.println("\nOpcion invalida\n");
                    break;
            }
        }
    }

}
