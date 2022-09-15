
package atlas;

import atlas.DTO.ClubDeportivo;
import atlas.DTO.Suscripcion;
import atlas.DTO.Usuario;
import java.time.LocalDateTime;

/**
 * @author Cristopher
 */

public class Principal {

  
    public static void main(String[] args) {
 
        
        System.out.println("Crear 3 Usuario");
        
        //ID, nombre completo,rut, digito verificador, fecha de nacimiento, teléfono, email, nombre de usuario y contraseña
        
        Usuario user = new Usuario();
        user.crearCorrelativo2();
        user.setNombreCompleto("David Cogiolle");
        user.setRut(15918489,'7');
        user.setFechNac("25/11/1984");
        user.setTelefono("5695555555");
        user.setEmail("david.cogiolle@gmail.com");
        user.setUsuario("dcog");
        user.setClave("Afds22231");
        
        System.out.println("Se creo el Usuario: "+user.getId()+" "+ user.getNombreCompleto()+" mi rut es "+user.getRut()+"-"+user.getDv()+" "+user.getTelefono()+" "+user.getEmail());
        
        Usuario user2 = new Usuario();
        user2.crearCorrelativo2();
        user2.setNombreCompleto("Gerr Adere");
        user2.setRut(16243420,'9');
        user2.setFechNac("25/07/1986");
        user2.setTelefono("5695555556");
        user2.setEmail("gerr.adere@live.cl");
        user2.setUsuario("ggft");
        user2.setClave("G1ovanniGg34");
        
        System.out.println("Se creo el Usuario: "+user2.getId()+" "+ user2.getNombreCompleto()+" mi rut es "+user2.getRut()+"-"+user2.getDv()+" "+user2.getTelefono()+" "+user2.getEmail());     
      
        
        Usuario user3 = new Usuario();
        user3.crearCorrelativo2();
        user3.setNombreCompleto("Sergio Villanueva");
        user3.setRut(15918489,'7');
        user3.setFechNac("02/01/1987");
        user3.setTelefono("5695555556");
        user3.setEmail("sergio.villanueva@gmail.com");
        user3.setUsuario("scodiio");
        user3.setClave("5534Gato33");
        
        System.out.println("Se creo el Usuario: "+user3.getId()+" "+ user3.getNombreCompleto()+" mi rut es "+user3.getRut()+"-"+user3.getDv()+" "+user3.getTelefono()+" "+user3.getEmail()); 
        
        
        System.out.println("==========================================================");
        
          //rol único otorgado por la asociación de Handball, Nombre del Club, nombre del fundador, año de fundación, País de origen, Lema, colores y valor de su suscripción.
            
          System.out.println("Crear 3 Clubes depostivos ");
          
          ClubDeportivo club1 = new ClubDeportivo();
          club1.setNombreClub("Arsenal de Coquimbo");
          club1.crearCorrelativo();
          club1.setNombreFundador("Juan Mesa");
          club1.setAnioFunda("1990");
          club1.setPais("chile");
          club1.setLema("Cañones a los puertos");
          club1.setColor("Amarillo, Rojo");
          club1.setValorSusc(10050);
          
          System.out.println("Se creo el CLub Deportivo: "+ club1.getNombreClub()+" mi rol es "+club1.getRol());
          
          ClubDeportivo club2 = new ClubDeportivo();
          club2.setNombreClub("Manquehue City ");
          club2.crearCorrelativo();
          club2.setNombreFundador("Juan Mesa");
          club2.setAnioFunda("1993");
          club2.setPais("chile");
          club2.setLema("Vivir y Fuerza");
          club2.setColor("Celeste, Blanco");
          club2.setValorSusc(15100);
          
          System.out.println("Se creo el CLub Deportivo: "+ club2.getNombreClub()+" mi rol es "+club2.getRol());        
          
          ClubDeportivo club3 = new ClubDeportivo();
          club3.setNombreClub("Los Cóndores Unidos");
          club3.crearCorrelativo();
          club3.setNombreFundador("Juan Mesa");
          club3.setAnioFunda("1995");
          club3.setPais("chile");
          club3.setLema("Desde lo alto al sol");
          club3.setColor("Amarillo, Naranjo");
          club3.setValorSusc(13200);
          
          System.out.println("Se creo el CLub Deportivo: "+ club3.getNombreClub()+" mi rol es "+club3.getRol()); 
          System.out.println();          
          
    
          
          
          
        
          
          
        
        
        
        
        
        
        
    }
        
    
    
    
    
    
}
