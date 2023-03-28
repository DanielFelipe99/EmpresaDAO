/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 *
 * @author Daniel Arteaga
 */
public interface DAOLogin {
    /**
     * permite hacer una verificacion de los usuarios ingresados, pero habiendo el DAO por medio para que no se ingrese exactamente a los datos guardados
     * @param usuario nombre de usuario ingresado
     * @param contrasenia contraseña del usuario ingresada
     * @return como es un metodo booleano va a retornar variables true o false dependiendo de la validacion de los datos
     */
   
    public boolean VerificarUsuarios(String usuario, String contrasenia);
    
    
    public String getUsuario(); //da el usuario que se ingresa
    
    /**
     * este metodo booleano puede cambiar la contraseña
     * @param contrasenia se guarda una nueva contraseña
     * return devuelve una variable tipo booleana 
     */
    public boolean CambiarContrasenia(String contrasenia);
    
}
