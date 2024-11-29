package es.santander.ascender.proyecto11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileProcesor implements IFileProcesor {

    @Override
    public String leerFile(String filePath) throws Exception {
        String salida = "";
        try (InputStream entrada = new FileInputStream(filePath) ;
        InputStreamReader irs = new InputStreamReader(entrada);
        BufferedReader bf = new BufferedReader(irs)) {
            String linea;
            while((linea = bf.readLine()) != null){                
                salida += linea;
            }
            System.out.println(salida);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return salida;
        
    }

    @Override
    public String eliminarVocales(String input) {
                
        String regex ="[aeiouAEIOUáéíóúÁÉÍÓÚüÜ]";
        String output = input.replaceAll(regex, "");
        return output;
    }

    @Override
    public void escribirAFile(String filePath, String content) throws Exception {
        FileWriter fw = new FileWriter(filePath);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write(content);
        bf.close();
    }

}
