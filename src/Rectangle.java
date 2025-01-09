
public class Rectangle {
    private  double lato1;
    private  double lato2;

    public Rectangle(double lato1, double lato2){
        this.lato1= lato1;
        this.lato2 = lato2;
    }

    public  double calcolaArea(){
        return lato1 * lato2;
    }

    public  double calcolaPerimetro(){
        return 2 * (lato1 + lato2);
    }


    public  void stampaRettangolo(){
        System.out.println("L'area è di: "+ calcolaArea() + " cm3");
        System.out.println("Il perimetro è di: "+ calcolaPerimetro() + " cm");

    }

}
