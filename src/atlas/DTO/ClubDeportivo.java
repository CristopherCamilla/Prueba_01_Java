
package atlas.DTO;

// @author Cristopher

public class ClubDeportivo {
    
    //rol único otorgado por la asociación de Handball, Nombre del Club, nombre del fundador, año de fundación, País de origen, Lema, colores y valor de su suscripción.

    private String Rol;
    private String NombreClub;
    private String NombreFundador;
    private String AnioFunda;
    private String Pais;
    private String Lema;
    private String Color;
    private int ValorSusc;


    public ClubDeportivo() {
        this.Rol = "";
        this.NombreClub = "";
        this.NombreFundador = "";
        this.AnioFunda = "";
        this.Pais = "";
        this.Lema = "";
        this.Color = "";
        this.ValorSusc = 0
                ;
    }

    public ClubDeportivo(String Rol, String NombreClub, String NombreFundador, String AnioFunda, String Pais, String Lema, String Color, int ValorSusc) {
        this.Rol = Rol;
        this.NombreClub = NombreClub;
        this.NombreFundador = NombreFundador;
        this.AnioFunda = AnioFunda;
        this.Pais = Pais;
        this.Lema = Lema;
        this.Color = Color;
        this.ValorSusc = ValorSusc;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreClub(String NombreClub) {
        this.NombreClub = NombreClub;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public String getAnioFunda() {
        return AnioFunda;
    }

    public void setAnioFunda(String AnioFunda) {
        this.AnioFunda = AnioFunda;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getValorSusc() {
        return ValorSusc;
    }

    public void setValorSusc(int ValorSusc) {
        this.ValorSusc = ValorSusc;
    }
    
    
    
    
    
    
}
