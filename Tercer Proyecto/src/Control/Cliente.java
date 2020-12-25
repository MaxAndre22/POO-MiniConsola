/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Gerson
 */
import java.io.DataOutputStream;
import java.io.IOException;
import Control.Conexion;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cliente extends Conexion
{
    public Cliente() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion

    
    public void startClient() //Método para iniciar el cliente
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());

            //Se enviarán dos mensajes
            for (int i = 0; i < 2; i++)
            {
                //Se escribe en el servidor usando su flujo de datos
                String mensaje= br.readLine();
                salidaServidor.writeUTF(mensaje);
            }

            cs.close();//Fin de la conexión

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    

}
