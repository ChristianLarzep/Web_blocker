/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pistian Lara
 */
public class Edit {
    public void Bloqueo(){
    File file = new File("C:\\Windows\\System32\\drivers\\etc\\hosts");
	String content = "This is the new text content";
        ArrayList<String> lines = new ArrayList<>();
              
        try(FileReader current = new FileReader("C:\\Windows\\System32\\drivers\\etc\\hosts")){

	    // get the content in bytes
	    byte[] contentInBytes = content.getBytes();
            Scanner reader =  new Scanner(current);
            String line;
                        
            while((line = reader.nextLine())!=null){
                  lines.add(line);
                  }
            current.close();
            }catch(Exception e){}
                        
          //try (FileOutputStream fop = new FileOutputStream(file)) {
            try (PrintWriter fop = new  PrintWriter(file)) {
                    
               // if file doesn't exists, then create it
		if (!file.exists()) {
	              file.createNewFile();
		   }
                    
                for(String copy : lines){
                    fop.println(copy);
                    }
                  //fop.write(contentInBytes);
                  //fop.write(contentInBytes);
                        
                        fop.println("255.255.255.0  www.facebook.com");
                        fop.println("255.255.255.0  es.facebook.com");
                        fop.println("255.255.255.0  www.es.facebook.com");
                        fop.println("255.255.255.0  facebook.com/");
                        fop.println("255.255.255.0  m.facebook.com");
                        fop.println("255.255.255.0  www.es.facebook.com/");
                        fop.println("255.255.255.0  www.facebook.com/");
			fop.flush(); 
			fop.close();

			System.out.println("Cierra tu navegador");

		} catch (IOException e) {
			e.printStackTrace();
	    }
    }
    
    public void Desbloqueo(){
     File file = new File("C:\\Windows\\System32\\drivers\\etc\\hosts");
        ArrayList<String> lines = new ArrayList<>();
              
        try(FileReader current = new FileReader("C:\\Windows\\System32\\drivers\\etc\\hosts")){

            Scanner reader =  new Scanner(current);
            String line, copyline;
                        
            while((line = reader.nextLine().intern())!="255.255.255.0  www.facebook.com"){
                  lines.add(line);      
            }      
                  
            current.close();
            }catch(Exception e){}
                        
          //try (FileOutputStream fop = new FileOutputStream(file)) {
            try (PrintWriter fop = new  PrintWriter(file)) {
                    
               // if file doesn't exists, then create it
		if (!file.exists()) {
	              file.createNewFile();
		   }
                    
                for(String copy : lines){
                    fop.println(copy);
                    }   
                        

		} catch (IOException e) {
			e.printStackTrace();
	    }
    }
}
