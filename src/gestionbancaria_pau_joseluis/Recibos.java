package gestionbancaria_pau_joseluis;

public class Recibos {
  
  //ATRIBUTOS
  private String cif;
  private String nombreEmpresa;
  private double importe;
  private String concepto;
  private String periodicidad; //"mensual", "trimestral", "anual"};


  //CONSTRUCTOR
  public Recibos (String cif, String nombreEmpresa, double importe, String concepto, String periodicidad) {
    this.cif = cif;
    this.nombreEmpresa = nombreEmpresa;
    this.importe = importe;
    this.concepto = concepto;
    this.periodicidad = periodicidad;
  }
  

  //GETTERS
   public String getImporteFormateado() {
    return String.format("%1$,.2f", importe);
  }

    public String getCif() {
        return cif;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public double getImporte() {
        return importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }
    

    //SETTERS
    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
    
    
   

   
   
   
}