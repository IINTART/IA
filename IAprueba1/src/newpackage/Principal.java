
package newpackage;

public class Principal {


    public static void main(String[] args) {
        archivos a = new archivos();
        
        String s1 = a.leerTxt("C:\\Users\\mike\\Documents\\ia\\prueba.txt");
        
        System.out.println(a.conversion(s1));
        
    }
    
}
