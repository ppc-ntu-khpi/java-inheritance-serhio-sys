[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-f4981d0f882b2a3f0472912d15f9806d57e124e0fc890972558857b51b24a6f9.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=10180158)
# Практична робота "Реалізація успадкування"'

Я обрав модель **Голуба**

# Діаграмма 
<img src="https://github.com/ppc-ntu-khpi/Inheritance-Starter/blob/master/images/dove-diagram.png" width="100%"/>

# Скріншот працюючої програми й классу TestAnimal
<img src="https://github.com/ppc-ntu-khpi/Inheritance-Starter/blob/master/images/dovetest.png" width="100%"/>


# Код до класу Animal
```java
package domain;

public class Animal {

    protected String name;

    protected float weight;

    public Animal() {
        name="generic animal";
        weight=25;
    }

    public void eat() {
        System.out.println("Animal eating...");
    }

    @Override
    public String toString() {
        return "My animal:" + "\nName:\t" + name + "\nWeight:\t" + weight+" kg";
    }

 
}
```


# Код до класу Bird
```java
package domain;

public class Bird extends Animal {

    public void fly() {
        System.out.println("Bird is flying in clear sky!");
    }
}

```

# Код до класу Dove
```java
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
```