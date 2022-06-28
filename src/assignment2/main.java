/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author User1
 */
public class main {

    public static void main(String[] args) {
        LeerArchivo op = new LeerArchivo();
        GetYSet gs = new GetYSet();
        op.LeerText("C:\\Users\\maico\\OneDrive\\Escritorio\\assignment2\\assignment2\\src\\assignment2\\LeerArchivo.java");
        op.LeerText("C:\\Users\\maico\\OneDrive\\Escritorio\\assignment2\\assignment2\\src\\assignment2\\main.java");
        op.LeerText("C:\\Users\\maico\\OneDrive\\Escritorio\\assignment2\\assignment2\\src\\assignment2\\GetYSet.java");
        op.resultado();

    }
}
