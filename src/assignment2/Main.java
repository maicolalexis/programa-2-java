
/***********************************************************
************************************************************
************************************************************
*****                                                  *****
*****  Name: Nombre programa 2                         *****
*****  Description: contar líneas de código reales     ***** 
***** (lineas de codigo escritas por el programador)   *****
*****  sin contar espacios y lineas comentadas         *****
*****  Date:  14/ 06/2022                              *****
*****  @author Michael Alexis Villa Gaviria            *****   
*****  @version 1.0                                    *****
*****                                                  *****
************************************************************
************************************************************
***********************************************************/

package assignment2;

/**
 *
 * @author Michael Alexis Villa Gaviria
 */
public class Main {

    public static void main(String[] args) {
        GetYSet gs = new GetYSet();
        Operacion op = new Operacion();
        //op.LeerText("C:\\xampp\\htdocs\\assignment2\\src\\assignment2\\Operacion.java");
        //op.LeerText("C:\\xampp\\htdocs\\assignment2\\src\\assignment2\\Main.java");
       
        op.LeerText("C:\\xampp\\htdocs\\assignment2\\src\\assignment2\\GetYSet.java");
        op .mostrar();
    }
}