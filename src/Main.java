public class Main {
    public static void main(String[] args) {

        Futbolista fut=new Futbolista(8,"Medio",9,"Andres","Iniesta",37);

        SeleccionFutbol ent=new Entrenador("ST",8,"Jurgen","Klopp",45);


        fut.setEdade(25);
        System.out.println(fut);
        System.out.println(ent);
        }
}
