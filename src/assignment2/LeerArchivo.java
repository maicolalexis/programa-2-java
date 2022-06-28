/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author User1
 */
public class LeerArchivo {

    GetYSet gs = new GetYSet();
    int contador1, contador2, contador3, contador4, contador5, contador6, contador7= 0;
    String caracter2, caracter, bread = "";

    public void LeerText(String direccion) {
        
        try {
            //BufferedReader es una clase de Java para leer el texto de una secuencia de entrada (como un archivo)
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            //bread toma el valor de bf.readLine que es método que  lee todos los caracteres
            while ((bread = bf.readLine()) != null) {   
                caracter = bread;
                String trim = caracter.trim();
                //llamamos los metodos y les pasamos el String por parametro
                contadorGlobal(trim);
                contadorCorchetes(trim);
                contadorComentarios(trim);
                contadorClases(trim);
                contadorVacio(trim);
                contadorMetodos(trim);
                contadorMetodosSet(trim);
                contadorMetodosget(trim);
            }

        } catch (Exception e) {
            System.err.println("no se encontro archivos");
        }
    }
    //metodo global cuenta todas las lineas de los archivos
    public void contadorGlobal(String archivo) {
        contador1++;
        gs.setContador(contador1);

    }
    //metodo de cortechetes cuenta todos los corchetes de los archivos
    public void contadorCorchetes(String archivo) {
        if (archivo.startsWith("}")) {
            contador2++;
            gs.setContadorCorchetes(contador2);
        }
    }
//metodo de comentarios cuenta todos los comentarios de los archivos
    public void contadorComentarios(String archivo) {
        
        if (archivo.startsWith("/") || archivo.startsWith("*")) {
            contador3++;
            gs.setContadorC(contador3);

        }

    }
//metodo de clases cuenta todas los clases que contienen los archivos
    public void contadorClases(String archivo) {
        
        if (archivo.startsWith("public class")) {
            contador4++;
            gs.setContadorClases(contador4);
        }
        
    }
//metodo de lienas vacias cuenta todas las lineas vacias de los archivos
    public void contadorVacio(String archivo) {
        
        if (archivo.isEmpty()) {
            contador5++;
            gs.setContadorV(contador5);
        }

    }
//metodo para contar metodos cuenta todos los metodos de los archivos
    public void contadorMetodos(String archivo) {
        
        if (archivo.startsWith("public void")
                || archivo.startsWith("public int")
                || archivo.startsWith("public boolean")
                || archivo.startsWith("public String")
                || archivo.startsWith("public char")
                || archivo.startsWith("public static")) {
            contador6++;
            gs.setContadorM(contador6);
        }
        
    }
    //metodo que cuenta los set que contiene cada archivo
    public void contadorMetodosSet(String archivo) {
        
        if (archivo.startsWith("public void set")
                || archivo.startsWith("public int set")
                || archivo.startsWith("public boolean set")
                || archivo.startsWith("public String set")
                || archivo.startsWith("public char set")
                || archivo.startsWith("public static set")) {
            contador7++;
            gs.setContadorSetyGet(contador7);
        }
        
    }
    //metodo que cuenta los get que contiene cada archivo
    public void contadorMetodosget(String archivo) {
        
        if (archivo.startsWith("public void get")
                || archivo.startsWith("public int get")
                || archivo.startsWith("public boolean get")
                || archivo.startsWith("public String get")
                || archivo.startsWith("public char get")
                || archivo.startsWith("public static get")) {
            contador7++;
            gs.setContadorSetyGet(contador7);
        }
        
    }

    //metodo en la que nos muestra los resultados
    public void resultado() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|   %s   |    %s   |   %s   |   %s   |   %s   |   %s   |   %s   |%n",
                "LINEAS GLOBALES", "COMENTARIOS",
                "LINEAS VACIAS", "CLASES", "METODOS"
                ,"CORCHETES", "LINEAS REALES");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("|          %s        |        %s        |         %s        |      %s     |      %s     |      %s       |         %s       |%n",
                gs.getContador(), gs.getContadorC(), gs.getContadorV(), gs.getContadorClases(),
                gs.getContadorM(), gs.getContadorCorchetes(), (gs.getContador()
                - gs.getContadorV() - gs.getContadorCorchetes() - gs.getContadorC()-gs.getContadorSetyGet()));
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    }
    
}