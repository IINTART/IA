package newpackage;

import java.io.BufferedReader;
import java.io.FileReader;


public class archivos {
    
    String texto;
    
    public String leerTxt(String dirrecion){
        try{
            BufferedReader br = new BufferedReader(new FileReader(dirrecion));
            String temp = "";
            String bfRead;
            while((bfRead = br.readLine()) != null){
                temp = temp + "\n";
                temp = temp + bfRead;
            }
            texto = temp;
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        
        
        return texto;
    }
    
    public int conversion(String cadena){
        
        int cont =0;
        char [] letras = new char[texto.length()];

        
        for(int i = 0; i < letras.length; i++){
            letras[i] = cadena.charAt(i);
            if(String.valueOf(letras[i]).equals("t")){
                System.out.print(i + "\n");
                int c = i;
                
            }
            //System.out.print(letras2[i] + "\n");
            
            /*
                if(String.valueOf(letras[i]).equals("t") && String.valueOf(letras[i]).equals("h")){
                cont++;
                
                }*/
        }
        return cont;
    }
    
}
