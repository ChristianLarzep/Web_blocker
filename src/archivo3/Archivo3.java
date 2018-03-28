/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Pistian Lara
 */
public class Archivo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Edit archivo = new Edit();
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Bloquear   2.Desbloquear: ");
        
        opcion = sc.nextInt();
        
        if(opcion == 1){
            archivo.Bloqueo();
        }
        else if(opcion == 2){
           archivo.Desbloqueo();
        }
        
        
    }
    
}
//Conformaciokn de cerrar https://byspel.com/java-confirmacion-al-cerrar-un-jframe-netbeans/

//https://stackoverflow.com/questions/13996547/how-do-i-bundle-a-jre-into-an-exe-for-a-java-application-launch4j-says-runtime
//Source: "M:\Netbeans\MyApp\jre6\*"; DestDir: "{app}\jre6\"; Flags: recursesubdirs createallsubdirs     