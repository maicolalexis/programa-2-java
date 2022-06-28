/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author SENA
 */

//metodo que cuenta los set que contiene cada archivo
public class GetYSet {
    int contadorM, contador, contadorClases, contadorC, contadorV, contadorCorchetes, contadorSetyGet = 0;
    
    public GetYSet() {
    }

    public int getContadorSetyGet() {
        return contadorSetyGet;
    }

    public void setContadorSetyGet(int contadorSetyGet) {
        this.contadorSetyGet = contadorSetyGet;
    }
    
    public int getContadorM() {
        return contadorM;
    }

    public void setContadorM(int contadorM) {
        this.contadorM = contadorM++;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContadorClases() {
        return contadorClases;
    }

    public void setContadorClases(int contadorClases) {
        this.contadorClases = contadorClases;
    }

    public int getContadorC() {
        return contadorC;
    }

    public void setContadorC(int contadorC) {
        this.contadorC = contadorC;
    }

    public int getContadorV() {
        return contadorV;
    }

    public void setContadorV(int contadorV) {
        this.contadorV = contadorV;
    }

    public int getContadorCorchetes() {
        return contadorCorchetes;
    }

    public void setContadorCorchetes(int contadorCorchetes) {
        this.contadorCorchetes = contadorCorchetes;
    }
    
}
