package domain;

public class Dove extends Bird {

    private String kind;

    public Dove(String name, float weight, String kind) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }

    public Dove() {
        this("Dove",3.5f,"Mail Dove");
    }

    public void sendMail(String mail){
        System.out.println("Your mail is arrived:\n" + mail);
    }

    @Override
    public void fly() {
        System.out.println("Dove is flying in clear sky...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Dove!";
    }

    @Override
    public void eat() {
        System.out.println("Dove is eating various seeds and nuts...");
    }
    
    
}
