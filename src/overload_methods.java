public class overload_methods {
    //overload methods = methods that share same name,
    // but different parameters
    //      signature = name + parameters
    static double add(double a, double b){
        return a+b;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }

    static String bakePizza(String breadtype){
        return breadtype+" pizza";
    }

    static String bakePizza(String breadType, String cheeseType){
        return breadType+" "+cheeseType+" pizza";
    }
    public static void main(String[] args) {
        //overload methods
        /*System.out.println(add(1,2));
        System.out.println(add(1,34,4));*/
        String pizza = bakePizza("flat bread");
        System.out.println(pizza);
        String cheesyPizza = bakePizza("thin crust", "double burst cheese");
        System.out.println(cheesyPizza);
    }
}
