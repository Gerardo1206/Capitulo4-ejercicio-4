package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        TipoSangre a = TipoSangre.A;
        TipoRh b= TipoRh.NEGATIVO;
        Integer c=10;
        Integer d=12;
        BloodData sangre = new BloodData();
        BloodData sangre1 = new BloodData(a,b);
        Patient p1=new Patient();
        Patient p2=new Patient(c,d,sangre1);
        Patient p3=new Patient(5,6,new BloodData(TipoSangre.AB,TipoRh.POSITIVO));
        System.out.println(sangre1.toString());
        System.out.println(sangre.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());  
        System.out.println(p3.toString());
    }
    
}
