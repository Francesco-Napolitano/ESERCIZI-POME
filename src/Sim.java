public class Sim {
    private String telefono;
    private double credito;
    private double[][] ultimeChiamate ;

    public Sim (String numeroTel){
        this.telefono = numeroTel;
        this.credito = 0.0;
        this.ultimeChiamate = new double[5][2];
    }

    public void stampaSim (){
        System.out.println("Il tuo numero di telefono è: " + telefono );
        System.out.println("Il tuo credito è: " + credito );
//        System.out.println("Le tue ultime 5 chiamate sono: " + ultimeChiamate );
    }
}


