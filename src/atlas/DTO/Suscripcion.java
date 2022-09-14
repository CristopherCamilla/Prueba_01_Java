package atlas.DTO;


// @author Cristopher

public class Suscripcion {
    
    //fecha de inicio de la suscripción, valor de la suscripción, equipos al que se está suscrito y abono total por concepto de pagos, además de un correlativo de la venta
    
    private String FechaIni;
    private int Valor;
    private String EquipoSub;
    private int AbonoTotal;
    private static int Correlativo;

    
    public Suscripcion() {
        this.FechaIni = "";
        this.Valor = 0;
        this.EquipoSub = "";
        this.AbonoTotal = 0;
        this.Correlativo = 1000;
               
    }
  
    public Suscripcion(String FechaIni, int Valor, String EquipoSub, int AbonoTotal, int Correlativo) {
        this.FechaIni = FechaIni;
        this.Valor = Valor;
        this.EquipoSub = EquipoSub;
        this.AbonoTotal = AbonoTotal;
        this.Correlativo = Correlativo;
    }

    public String getFechaIni() {
        return FechaIni;
    }

    public void setFechaIni(String FechaIni) {
        if (this.FechaIni.contains("????/??/??")) {
            
        
        this.FechaIni = FechaIni;
    }
}
    
    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public String getEquipoSub() {
        return EquipoSub;
    }

    public void setEquipoSub(String EquipoSub) {
        this.EquipoSub = EquipoSub;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public void setAbonoTotal(int AbonoTotal) {
        this.AbonoTotal = AbonoTotal;
    }

    public int getCorrelativo() {
        return Correlativo;
    }

    public void setCorrelativo(int Correlativo) {
        
        Correlativo = Correlativo +10;
        this.Correlativo = Correlativo;
    }
    
    
    
    
    
    
    
    
    
}
