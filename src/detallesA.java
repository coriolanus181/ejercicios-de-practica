public class detallesA implements DetallesAnimal {
    private int opcionAnimal;
    public int dibujoAnimal(int opcion){
        switch(opcion){
            case 1 -> System.out.println(" / \\__\n" +
                    "(    @\\____\n" +
                    " /         O\n" +
                    "/   (_____/\n" +
                    "/_____/   U");
            case 2 -> {
                System.out.println(" /\\_/\\  ");
                System.out.println("( o.o ) ");
                System.out.println(" > ^ < ");
            }
            default -> System.out.println("elija una opcion valida");
        }

        return opcion;
    }

    @Override
    public void dibujoAnimal() {

    }

    public void tipoAnimal(){
        //animal.values();

    }
}