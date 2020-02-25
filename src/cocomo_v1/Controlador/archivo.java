
package cocomo_v1.Controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class archivo {
    
    FileReader entrada;         // FileReader -> leer secuencias de caracteres
    FileOutputStream salida;
    File archivo;
int contador = 1;
    //Abrir un archivo de Texto
    public String AbrirArchivo(File Archivo){
        String contenido="";
        
        try {
            entrada = new FileReader(Archivo);      //obtener los caracteres del archivo y guardarlo en una variable
            int ascci;
            /*
            Valor ASCII
                13 -> Salto de línea
                32 -> Espacio
            */
            while ((ascci = entrada.read())!=-1) {      //obtiene el valor en ASCII de cada caracter del texto
                                                        //bucle continúa mientras tenga un valor ascii válido 
                System.out.println("acci: "+ascci);
                
                ContarLineas(ascci);
                char caracter = (char)ascci;
                contenido+=caracter;
            }
        } catch (Exception e) {
        }
        
        return contenido;
        
    }
    
    public void ContarLineas(int ascci){
        if (ascci == 13){
            contador++;
        }
        
    }
    
    public int getCountLineas(){
        
        return contador;
    }
         
}
