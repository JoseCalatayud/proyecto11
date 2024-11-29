package es.santander.ascender.proyecto11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileProcesor implements IFileProcesor {

    @Override
    public String leerFile(String filePath) throws Exception {
        File file = new File(filePath);
        String texto = "";
        try (FileReader fr = new FileReader(file)) {
            BufferedReader br = new BufferedReader(fr);
            // Lectura del fichero
            texto = br.readLine();
            return texto;
        } catch (Exception e) {
            e.getCause();
            return e.getLocalizedMessage();
        }
    }

    @Override
    public String eliminarVocales(String input) {
        // TODO Auto-generated method stub
        String [] vocales = {"a","e","i","o","u"};
        for (String string : vocales) {
            input.re
        }
    }

    @Override
    public void escribirAFile(String filePath, String content) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'escribirAFile'");
    }

}
