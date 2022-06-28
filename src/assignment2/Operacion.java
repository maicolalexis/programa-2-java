/** ************************************************************
 ***                                                         ***
 ***   CLASE OPERACIONES                                     ***
 ***   Esta clase contiene todas las operaciones de todo     ***
 ***   lo que se va a desarrollar de el programa             ***
 ***                                                         ***
 ************************************************************** */
package assignment2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author User1
 */
public class Operacion {

    Contador cs = new Contador();
    int contador1, contador2, contador3, contador4, contador5, contador6, contador7, contador8 = 0;
    String texto = "";

    public void LeerText(String direccion) {

        try {
            //BufferedReader es una clase de Java para leer el texto de una secuencia de entrada (como un archivo)
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            //bread toma el valor de bf.readLine que es método que  lee todos los caracteres
            while ((texto = bf.readLine()) != null) {
                String trim = texto.trim();
                //llamamos los metodos y les pasamos el String por parametro
                contarGlobal(trim);
                contarCorchetes(trim);
                contarComentarios(trim);
                contarClases(trim);
                contarVacio(trim);
                contarMetodos(trim);
                contarMetodosSet(trim);
                contarMetodosget(trim);
                contarPyL(trim);
            }

        } catch (Exception e) {
            System.err.println("no se encontro archivos");
        }
    }

    //metodo global cuenta todas las lineas de los archivos
    public void contarGlobal(String archivo) {
        contador1++;
        cs.setContador(contador1);

    }

    //metodo de cortechetes cuenta todos los corchetes de los archivos
    public void contarCorchetes(String archivo) {
        if (archivo.startsWith("}")) {//starsWith indica si una cadena de texto comienza con los caracteres de una cadena de texto concreta
            contador2++;
            cs.setContadorCorchetes(contador2);
        }
    }
//metodo de comentarios cuenta todos los comentarios de los archivos

    public void contarComentarios(String archivo) {

        if (archivo.startsWith("/") || archivo.startsWith("*")) {
            contador3++;
            cs.setContadorC(contador3);

        }

    }
//metodo de clases cuenta todas los clases que contienen los archivos

    public void contarClases(String archivo) {

        if (archivo.startsWith("public class")) {
            contador4++;
            cs.setContadorClases(contador4);
        }

    }
//metodo de lienas vacias cuenta todas las lineas vacias de los archivos

    public void contarVacio(String archivo) {

        if ("".equals(archivo)) {
            contador5++;
            cs.setContadorV(contador5);
        }

    }
//metodo para contar metodos cuenta todos los metodos de los archivos

    public void contarMetodos(String archivo) {

        if (archivo.startsWith("public void")
                || archivo.startsWith("public int")
                || archivo.startsWith("public boolean")
                || archivo.startsWith("public String")
                || archivo.startsWith("public char")
                || archivo.startsWith("public static")) {
            contador6++;
            cs.setContadorM(contador6);
        }

    }

    //metodo que cuenta los set que contiene cada archivo
    public void contarMetodosSet(String archivo) {

        if (archivo.startsWith("public void set")
                || archivo.startsWith("public int set")
                || archivo.startsWith("public boolean set")
                || archivo.startsWith("public String set")
                || archivo.startsWith("public char set")
                || archivo.startsWith("public static set")) {
            contador7++;
            cs.setContadorSetyGet(contador7);
        }

    }

    //metodo que cuenta los get que contiene cada archivo
    public void contarMetodosget(String archivo) {

        if (archivo.startsWith("public void get")
                || archivo.startsWith("public int get")
                || archivo.startsWith("public boolean get")
                || archivo.startsWith("public String get")
                || archivo.startsWith("public char get")
                || archivo.startsWith("public static get")
                || archivo.startsWith("this")
                || archivo.startsWith("return")) {
            contador7++;
            cs.setContadorSetyGet(contador7);
        }

    }

    //metodo que cuenta los package y imports
    public void contarPyL(String archivo) {
        if (archivo.startsWith("package") || archivo.startsWith("import")) {
            contador8++;
            cs.setContadorpyl(contador8);
        }
    }

    //metodo en la que nos muestra los resultados
    public void mostrar() {
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.printf("|   %s   |    %s   |   %s   |   %s   |   %s   |   %s   |%n",
                "LINEAS GLOBALES", "COMENTARIOS",
                "LINEAS VACIAS", "CLASES", "METODOS",
                "LINEAS REALES");
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        System.out.printf("|          %s        |        %s        |         %s        |      %s     |      %s     |         %s       |%n",
                cs.getContador(), cs.getContadorC(), cs.getContadorV(), cs.getContadorClases(),
                cs.getContadorM(), (cs.getContador() - cs.getContadorClases() - cs.getContadorC() - cs.getContadorV() - cs.getContadorCorchetes() - cs.getContadorSetyGet() - cs.getContadorpyl()));
        System.out.println("-------------------------------------------------------------------------------------------------------------");
    }
}
