package pl.gda.wsb;

public class Animal {


    public Animal(String species, String name)
    {
        this.name = name;
        this.species = species;
        if (species=="kot")
            weight = 7.0;
        if (species=="pies")
            weight = 14.0;
    }
    public Double getWeight() {
        return weight;
    }
    public void takeForAWalk(){
        if(weight!=0) {
            weight-=2;
            System.out.println("my weight now is: "+weight);
        }
        else{
            System.out.println("zwierze nie zyje");
        }
    }
    void feed(){
        if(weight!=0) {
            weight+=5;
            System.out.println("my weight now is: "+weight);
        }
        else{
            System.out.println("zwierze nie zyje");
        }
    }


    String name;
    int legsNum;
    String type;
    final String species;



    private Double weight;
}
