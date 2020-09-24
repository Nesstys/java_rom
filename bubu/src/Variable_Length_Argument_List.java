public class Variable_Length_Argument_List {
    public static void main(String[] args){

        System.out.printf("44 * 53 * 8 * 1 * 0 * 5 = %d\n",
                variableProduct(44, 53, 8, 0, 9, 5));

        System.out.printf("3 * 3 = %d\n",
                variableProduct(3, 3));

        System.out.printf("1 * 0 = %d\n",
                variableProduct(1));
    }
    // returns the product of the arguments
    public static int variableProduct(int... args){
        for(int i=1; i<args.length; i++){
            args[0] *= args[i];
        }
        return args[0];
    }
}
