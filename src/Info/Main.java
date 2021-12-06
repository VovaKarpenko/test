package Info;

public class Main {
    public static void main(String[] args) {
        Inf person = new Person(29,11,"Vova");
        Inf car = new Cars(100,"Blue",49);
        a(car);
        info(car);
a(person);
info(person);
    }
    public static int a (Inf noun){
        if (noun.weihgt()>30){
            System.out.println("aga");
        }
        if (noun.weihgt()<30){

            return  noun.sort();
        }

        return 0;
    }
    public static void info(Inf noun){
        noun.info();
    }
}
