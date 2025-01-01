
//Progam for design pattterns

public class BuilderDesignPattern {


    public static void main(String args[]){

      Thali thali = new Thali.CustomThali(true,true,true,true,true)
               .setChicken(true)
               .setGobi(true)
               .setKhir(true).build();

      System.out.println(thali);



    }
}
