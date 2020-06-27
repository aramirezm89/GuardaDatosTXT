/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.*;
import Negocio.Alumno;

public class EscribeArchivo {

    public static void add(Alumno a) throws IOException {

        File archivo;
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            archivo = new File("C:\\Users\\Antonio\\Desktop\\AIEP\\SEGUNDO AÑO\\taller_de_aplicaciones_para_internet_en_Java\\Ejemplo2GetSet\\web\\promedios.txt");
            fw = new FileWriter(archivo, true);
            pw = new PrintWriter(fw);
            pw.println(a.getNombre() + "," + a.getApellidos() + "," + a.getPromedio());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
