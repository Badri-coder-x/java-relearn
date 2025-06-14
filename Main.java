public class Main {

    //primitive Datatypes
    static byte byteVal;
    static short shortVal;
    static int intVal;
    static long longVal;
    static float floatVal;
    static double doubleVal;
    static char charVal;
    static boolean booleanVal;

    //Reference Datatypes
    static String stringVal;
    static int[] arrayVal;
    static Main MainObj;

    public static void main(String[] args){

        System.out.println("Value of uninitialized byte: "+byteVal);
        System.out.println("Value of uninitialized short: "+shortVal);
        System.out.println("Value of uninitialized int: "+intVal);
        System.out.println("Value of uninitialized long: "+longVal);
        System.out.println("Value of uninitialized float: "+floatVal);
        System.out.println("Value of uninitialized double: "+doubleVal);
        System.out.println("Value of uninitialized char: "+charVal);
        System.out.println("Value of uninitialized boolean: "+booleanVal);

        System.out.println("Value of uninitialized string: "+stringVal);
        System.out.println("Value of uninitialized array: "+arrayVal);
        System.out.println("Value of uninitialized Main object: "+MainObj);
    }
}
