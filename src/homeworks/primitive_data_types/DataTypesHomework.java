package homeworks.primitive_data_types;

public class DataTypesHomework {
    public static void main(String[] args) {
        System.out.println("Group (Integer)");
        byte a = -75;
        byte b = 43;
        System.out.println(a + " and " + b);
        short c = 0;
        short d = 31785;
        System.out.println(c + " and " + d);
        int e = -478921;
        int f = 3102589;
        System.out.println(e + " and " + f);
        long g = -11256784123L;
        long h = 257487512L;
        System.out.println(g + " and " + h);
        System.out.println();
        System.out.println("The size of type byte is 1 byte");
        System.out.println("Minimum value the type byte is: " + Byte.MIN_VALUE);
        System.out.println("Maximum value the type byte is: " + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("The size of type short is 2 byte");
        System.out.println("Minimum value the type short is: " + Short.MIN_VALUE);
        System.out.println("Maximum value the type short is: " + Short.MAX_VALUE);
        System.out.println();
        System.out.println("The size of type int is 4 byte");
        System.out.println("Minimum value the type int is: " + Integer.MIN_VALUE);
        System.out.println("Maximum value the type int is: " + Integer.MAX_VALUE);
        System.out.println();
        System.out.println("The size of type long is 8 byte");
        System.out.println("Minimum value the type long is: " + Long.MIN_VALUE);
        System.out.println("Maximum value the type long is: " + Long.MAX_VALUE);
        System.out.println();
        System.out.println("Group (Floating point number)");
        float j = 253.4f;
        float k = -487.1f;
        System.out.println(j + " and " + k);
        double l = -123456.789d;
        double m = 987654.321d;
        System.out.println(l + " and " + m);
        System.out.println();
        System.out.println("The size of type float is 4 byte");
        System.out.println("Minimum value the type float is: " + Float.MIN_VALUE);
        System.out.println("Maximum value the type float is: " + Float.MAX_VALUE);
        System.out.println();
        System.out.println("The size of type double is 8 byte");
        System.out.println("Minimum value the type double is: " + Double.MIN_VALUE);
        System.out.println("Maximum value the type double is: " + Double.MAX_VALUE);
        System.out.println();

        /*
        Հետևյալ արժեքներից ո՞րը կարելի է վերագրել float տիպի փոփոխականին, իսկ ո՞րը double-ին։
        12․345 և 3456,091 թվերին կարելի է վերագրել float տիպը, իսկ
        34,567839023 և 8923,1234857 թվերին double տիպը։
        Վերագրումը կատարվում է float տիպում մինչև 3-4 տասնորդական թվերի ճշգրտությամբ,
        իսկ double տիպում՝ մինչև 14 թվերի ճշգրտությամբ
         */
        float f1 = 12.345f;
        float f2 = 3456.091f;
        double d1 = 34.567839023d;
        double d2 = 8923.1234857d;
        System.out.println(f1 + " " + f2 + " " + d1 + " " + d2);
        System.out.println();

        System.out.println("Group (Character)");
        char n = 'A';
        char o = 'f';
        System.out.println(n + " and " + o);
        char s = 77;
        char w = 109;
        System.out.println(s + " and " + w);
        char t = 57;
        System.out.println(t);
        System.out.println();
        System.out.println("Group (Boolean)");
        boolean p = true;
        boolean q = false;
        System.out.println(p + " and " + q);
        System.out.println();

        /* int year = 201L;
        System.out.println(year); - չի աշխատի, կտպի անհամատեղելի տիպ long-ից հնարավոր չի ավտոմատ գնալ int
        (incompatible types: possible lossy conversion from long to int)
         */

        System.out.println();

        System.out.println("Java Type Casting");
        // Widening cast
        int aa = 7;
        long bb = aa;
        System.out.print("The result of widening casting (int -> long) is: " + aa + " " + bb);
        System.out.println();
        int myInt = 7;
        double myDouble = myInt;
        System.out.println("The result of widening casting (int -> double) is: " + myInt + " " + myDouble);
        // Narrowing casting
        double dd = 9.78d;
        int ii = (int) dd;
        System.out.println("The result of narrowing casting (double -> int) is: " + dd + " " + ii);
        System.out.println();
        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println("The result of narrowing casting (int -> byte) is: " + ff + " " + gg);
        System.out.println();

        /* long max = 3123456789; long-իn վերագրված արժեքի վերջում պետք է գրվի L տառը, հակառակ դեպքում չի աշխատի;
        double d = 1000_.00; _-ը չի կարելի գրել և վերջում ցանկալի է գրել d տառը;
        char i =’i’; char j=’j’; char ij = i +j; պետք է char ij-ին վերագրել 'i' + 'j' արժեքը հակառակ դեպքում int կլինի
        int 7a = 8; փոփոխականները չեն կարող սկսվել թվով
        long h = h  + 8; h-ին նախօրոք արժեք վերագրված չի;
        int n, m = 11; m = n; պետք է n-ին վերագրենք m-ը, այլ ոչ թե հակառակը
        */
//        միանգամից ներմուծել եմ ճիշտ տարբերակները ՃՃՃ
        long max = 3123456789L;
        System.out.println(max);
        double dt = 1000.00d;
        System.out.println(dt);
        char z = 'z';
        char r = 'r';
        char zr = 'z' + 'r';
        System.out.println(zr);
        int a7 = 8;
        System.out.println(a7);
        long h8 = 8;
        System.out.println(h8);
        int n3, m1 = 11;
        n3 = m1;
        System.out.println(n3);
    }
}
