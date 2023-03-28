/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import Vistas.Login;

/**
 *
 * @author sistemas
 */
public class Empresa {


    public static void main(String[] args) {
        Login login=Login.getLogin(); // con la variable login se hace un llamado de la clase Login y se usa el metodo getLogin
        login.setVisible(true); //se llama el metodo setVisible para ver la interfaz grafica de la clase Login
        login.setSize(500,500);
        login.setLocationRelativeTo(null);
    }
    
}
