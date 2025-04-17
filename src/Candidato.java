public class Candidato {
   private String nombre;
   private double publicidad  ;
   private String influencia;
   private int internet;
   private int radio;
   private int television;
   private int totali;
   private int totalr;
   private int totalt;
   private double gastos;
    public Candidato(String nombre) {
        this.nombre = nombre;
    }


     public void influencia(int medio){
         if (medio == 1) {
             this.influencia = "Internet";

         } else if (medio == 2) {
             this.influencia = "Radio";

         } else if (medio ==3){
             this.influencia = "Television";
         }

     }
    public void valorPublicidad(int medio) {
        if (medio == 1) {
            internet++;
            this.publicidad = internet*700000;
            this.totali= (int) publicidad;
        } else if (medio == 2) {
            radio++;
            this.publicidad = radio*200000;
            this.totalr= (int) publicidad;

        } else if (medio ==3){
            television++;
            this.publicidad = television*600000;
            this.totalt= (int) publicidad;
        }
        this.gastos=internet+television+radio;
        this.publicidad =totali+totalr+totalt;

    }
    public double getGastos(){
        return gastos;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getVaciarUrna(){
        return publicidad=0;
    }

    public double getPublicidad() {
        return publicidad;
    }

    public double costoPromedio(){
        return publicidad/=getGastos();
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nombre='" + nombre + '\'' +
                ", influencia=" + influencia +
                '}';
    }

    public void mostrarValorCampana() {
        System.out.println("candidato : "+getNombre()+"\tvalor campaña : "+getPublicidad()+"\t[internet"+"("+internet+")"+"radio"+"("+radio+")"+"television"+"("+television+")]");
    }

    public void mostrarPromedio(){
        System.out.println("candidato : "+getNombre()+"\tcosto promedio : "+costoPromedio());
       // System.out.println(costoPromedio());
    }
}