public class variable_arguments {
    public static void main(String[] args) {
        //varargs = allow a method to accept a varying number of numbers
        // makes methods more flexible, no need for overload methods
        //  ... -> (ellipsis)
        System.out.println(add(1,2,3,5,6,3,4,5));
    }
    static int add(int... numbers) {
        int sum =0;
        for (int number : numbers){
            sum+=number;
        }
        return sum;
    }
}
