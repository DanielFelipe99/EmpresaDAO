/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DAOLogin;

/**
 *
 * @author Daniel
 * 
 */
public class ControladorLogin implements DAOLogin{
    
    private static ControladorLogin controladorLogin; //se usa como un complemento para el singleton, variable de tipo estatico para dar solo una instancia de la clase ControladorLogin 
    private String usuario; //usuario que se ingresa
    private String contrasenia; // contraseña que el usuario ingresa  
    
    
   
    private ControladorLogin() { //metodo para inicializar componentes que solo se usa en esta clase
        
    }
    
    /**
     * el metodo singleton se usa para que solo haya una instancia de la clase ControladorLogin
     * con el condicional crea una nueva instancia si en un principio es null
     * @return devuelve cada nueva instancia
     */
    public static ControladorLogin getControladorLogin(){
        if(controladorLogin==null)
            controladorLogin=new ControladorLogin();
        
        return controladorLogin;
    }
    
    /**
     * el metodo VerificarUsuarios puede confirmar si los datos ingresados son validos
     * ademas el metodo es abstracto ya que pasa por la interface DAOLogin
     * @param usuario usuario que se ingresa
     * @param contrasenia contraseña que se ingresa
     * @return devuelve la variable booleana "estado", si los datos son correctos true sino false
     */
    @Override //metodo sobrescrito
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
        boolean estado=false;
        
        if((usuario.equals("daniel"))&&(contrasenia.equals("12345")))
            estado=true;
        
        return estado;
    }

    @Override //metodo sobrescrito
    
    public String getUsuario() { //metodo que muestra el usuario
        return this.usuario; //trae el usuario ingresado
    }

    @Override //metodo sobrescrito
    /**
     * CambiarContraseña permite al usuario cambiar la contraseña xd
     * la variable contrasenia guarda la nueva contraseña ingresada
     * @return estado con valor true
     */
    public boolean CambiarContrasenia(String contrasenia) {
        boolean estado=true;        
        this.contrasenia=contrasenia;
        return estado;
        
    }
    
}
