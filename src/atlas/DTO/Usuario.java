
package atlas.DTO;

 // @author Cristopher

public class Usuario {
    
    //ID, nombre completo,rut, digito verificador, fecha de nacimiento, teléfono, email, nombre de usuario y contraseña
    
    private int Id;
    private String NombreCompleto;
    private int rut;
    private String Dv;
    private String FechNac;
    private String Telefono;
    private String Email;
    private String Usuario;
    private String Clave;

    
    public Usuario() {
        this.Id = 0;
        this.NombreCompleto = "";
        this.rut = 0;
        this.Dv = "";
        this.FechNac = "";
        this.Telefono = "";
        this.Email = "";
        this.Usuario = "";
        this.Clave = "";
    
    }

    
    public Usuario(int Id, String Nombre, int rut, String Dv, String FechNac, String Telefono, String Email, String Usuario, String Clave) {
        this.Id = Id;
        this.NombreCompleto = Nombre;
        this.rut = rut;
        this.Dv = Dv;
        this.FechNac = FechNac;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Usuario = Usuario;
        this.Clave = Clave;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String Nombre) {
        this.NombreCompleto = Nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public String getFechNac() {
        return FechNac;
    }

    public void setFechNac(String FechNac) {
        this.FechNac = FechNac;
    }

    public String getTelefono() {
        
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        
        if(Telefono.length()>=8 && Telefono.substring(1, 2)=="56") {                 
        this.Telefono = Telefono;
    }
    }

    
    
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
       if(Email.contains(".") && Email.contains("@")){
        this.Email = Email;
    }
    }
          
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        
        if(Usuario.length() >= 4){
        this.Usuario = Usuario;
    }
    }
        
    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    
    public boolean validarRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
    


    
    
}
