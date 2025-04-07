public class Empleado {
        protected String nombre;
        protected int edad;

        public Empleado(int edad, String nombre) {
            this.edad = edad;
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }


        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void mostrarInformacion(){
            System.out.println("Nombre : "+nombre+"Edad :"+edad);
        }
    }


