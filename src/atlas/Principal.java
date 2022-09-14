/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atlas;

import atlas.DTO.ClubDeportivo;
import atlas.DTO.Suscripcion;
import atlas.DTO.Usuario;
import java.time.LocalDateTime;

/**
 *
 * @author Cristopher
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        
        System.out.println("Crear 3 Usuario");
        
        //ID, nombre completo,rut, digito verificador, fecha de nacimiento, teléfono, email, nombre de usuario y contraseña
        
        Usuario user = new Usuario();
        user.setId(1000);
        user.setNombreCompleto("David Cogiolle");
        user.setRut(15918489);
        user.setDv("7");
        user.setFechNac("25/11/1984");
        user.setTelefono("5695555555");
        user.setEmail("david.cogiolle@gmail.com");
        user.setUsuario("dcog");
        user.setClave("Afds22231");
        
        System.out.println("Se creo el Usuario: "+ user.getNombreCompleto());
        
        Usuario user2 = new Usuario();
        user2.setId(1001);
        user2.setNombreCompleto("Gerr Adere");
        user2.setRut(16243420);
        user2.setDv("9");
        user2.setFechNac("25/07/1986");
        user2.setTelefono("5695555556");
        user2.setEmail("gerr.adere@live.cl");
        user2.setUsuario("ggft");
        user2.setClave("G1ovanniGg34");
        
        System.out.println("Se creo el Usuario: "+ user2.getNombreCompleto());     
      
        
        Usuario user3 = new Usuario();
        user2.setId(1002);
        user2.setNombreCompleto("Sergio Villanueva");
        user2.setRut(15918489);
        user2.setDv("7");
        user2.setFechNac("02/01/1987");
        user2.setTelefono("5695555556");
        user2.setEmail("sergio.villanueva@gmail.com");
        user2.setUsuario("scodiio");
        user2.setClave("5534Gato33");
        
        System.out.println("Se creo el Usuario: "+ user3.getNombreCompleto()); 
        
        
        
        
          //rol único otorgado por la asociación de Handball, Nombre del Club, nombre del fundador, año de fundación, País de origen, Lema, colores y valor de su suscripción.
            
          System.out.println("Crear 3 Clubes depostivos");
          
          ClubDeportivo club1 = new ClubDeportivo();
          club1.setNombreClub("Arsenal de Coquimbo");
          club1.crearCorrelativo();
          club1.setNombreFundador("Juan Mesa");
          club1.setAnioFunda("1990");
          club1.setPais("chile");
          club1.setLema("Cañones a los puertos");
          club1.setColor("Amarillo, Rojo");
          club1.setValorSusc(10050);
          
          System.out.println("Se creo el CLub Deportivo"+ club1.getNombreClub());
          
          ClubDeportivo club2 = new ClubDeportivo();
          club2.setNombreClub("Manquehue City ");
          club1.crearCorrelativo();
          club2.setNombreFundador("Juan Mesa");
          club2.setAnioFunda("1993");
          club2.setPais("chile");
          club2.setLema("Vivir y Fuerza");
          club2.setColor("Celeste, Blanco");
          club2.setValorSusc(15100);
          
          System.out.println("Se creo el CLub Deportivo"+ club2.getNombreClub());        
          
          ClubDeportivo club3 = new ClubDeportivo();
          club3.setNombreClub("Los Cóndores Unidos");
          club1.crearCorrelativo();
          club3.setNombreFundador("Juan Mesa");
          club3.setAnioFunda("1995");
          club3.setPais("chile");
          club3.setLema("Desde lo alto al sol");
          club3.setColor("Amarillo, Naranjo");
          club3.setValorSusc(13200);
          
          System.out.println("Se creo el CLub Deportivo"+ club3.getNombreClub()); 
          
          
          
            //fecha de inicio de la suscripción, valor de la suscripción, equipos al que se está suscrito y abono total por concepto de pagos, además de un correlativo de la venta
          System.out.println("Ingresar suscripcion: ");
          
          Suscripcion sus1 = new Suscripcion();
          sus1.setFechaIni("14/09/2022");
          sus1.setValor(10050);
          sus1.setEquipoSub("ARH11");
          
          
          
          System.out.println("");
          
          
          
        
          
          
        
        
        
        
        
        
        
    }
        
    
    
    
    
    
}
