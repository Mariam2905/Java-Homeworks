package org.example.practics.examens;

import java.sql.SQLOutput;
public class Test1 {
    public static void main(String[] args) {
        System.out.println("Test1");
    }
//    public static void main(String[] args) {
//        Test1 s = new Test1();
//        s.start();
//    }
//
//    void start() {
//        int a = 3;
//        int b = 4;
//        System.out.print(" " + 7 + 2 + " ");
//        System.out.print(a + b);
//        System.out.print(" " + a + b + " ");
//        System.out.print(foo() + a + b + " ");
//        System.out.println(a + b + foo());
//    }
//
//    String foo() {
//        return "foo";
//    }

//    public static void main(String[] args) {
//        int a = 3 / 2;
////        int b = 3 < 2;
//        int c = 3 * 4;
//        int d = 3 << 2;
//        System.out.println(a + " " + 1 + " " + " " + c + " " + d);
//    }

//    public static void main(String[] args) {
//        foo(true, true);
//        foo(true, false);
//        foo(false, true);
//        foo(false, false);
//    }
//    public static void foo(boolean a, boolean b) {
//        if (a) {
//            System.out.println("A");
//        } else if (a && b) {
//            System.out.println("A && B");
//
//        } else {
//            if (!b) {
//                System.out.println("notB");
//            } else {
//                System.out.println("ELSE");
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Float f = new Float("12");
//        switch (f){
//            case 12:
//                System.out.println("Twelve");
//            case 0:
//                System.out.println("Zero");
//            default:
//                System.out.println("Default");
//        }
//    }

//    static boolean b;
//    public static void main(String[] args) {
//        short hand = 42;
//        if (hand < 50 && !b) hand++;
//        if (hand > 50) ;
//        else if (hand > 40) {
//            hand += 7;
//            hand++;
//        } else --hand;
//        System.out.println(hand);
//    }

//    static boolean b1, b2;
//    public static void main(String[] args) {
//        int x = 0;
//        if (!b1) {
//            if (!b2) {
//                b1 = true;
//                x++;
//                if (5 > 6) {
//                    x++;
//                }
//                if (!b1) {
//                    x = x + 10;
//                } else if (b2 = true) {
//                    x = x + 100;
//                } else if (b1 | b2) {
//                    x = x + 1000;
//                }
//                System.out.println(x);
//            }
//        }
//    }

//    public static void main(String[] args) {
//        int I = 0;
//        label:
//        if (I < 2) {
//            System.out.println("I is " + I);
//            I++;
//            continue label;
//        }
//    }

//    public static void main(String[] args) {
//        int i = 0;
//        while (1) {
//            if (i == 4) {
//                break;
//            }
//            ++i;
//        }
//        System.out.println("i = " + i);
//    }

//    class Two {
//        byte x;
//    }
//
//    class PassO {
//        public static void main(String[] args) {
//            PassO p = new PassO();
//            p.start();
//        }
//        void start() {
//            Two t = new Two();
//            System.out.println(t.x + " ");
//            Two t2 = fix(t);
//            System.out.println(t.x + " " + t2.x);
//        }
//        Two fix(Two tt) {
//            tt.x = 42;
//            return tt;
//        }
//    }

//    public static void main(String[] args) {
//        class Foo {
//            public int i = 3;
//        }
//        Object o = (Object) new Foo();
//        Foo foo = (Foo) o;
//        System.out.println("i = " + foo.i);
//    }

//    public static void main(String[] args) {
//        int x = 0;
//        int y = 0;
//        for (int z = 0; z < 5; z++) {
//            if ((++x > 2) || (++y > 2)) {
//                x++;
//            }
//        }
//        System.out.println(x + " " + y);
//    }

//    static int s;
//    public static void main(String[] args) {
//        Test1 p = new Test1();
//        p.start();
//        System.out.println(s);
//    }
//    void start() {
//        int x = 7;
//        twice(x);
//        System.out.println(x + " ");
//    }
//    void twice(int x) {
//        x = x * 2;
//        s = x;
//    }

//    public static void main(String[] args) {
//        Test1 p = new Test1();
//        p.start();
//    }
//    void start() {
//        boolean b1 = false;
//        boolean b2 = fix(b1);
//        System.out.println(b1 + " " + b2);
//    }
//    boolean fix(boolean b1) {
//        b1 = true;
//        return b1;
//    }

//    public void test(int x) {
//        int odd = 1;
//        if (odd) {
//            System.out.println("odd");
//        } else {
//            System.out.println("even");
//        }
//    }

//    public static void main(String[] args) {
//        int i = 1, j = 0;
//        switch (i) {
//            case 2:
//                j += 6;
//            case 4:
//                j += 1;
//            default:
//                j += 2;
//            case 0:
//                j += 4;
//        }
//        System.out.println("j = " + j);
//    }

//    public static void main(String[] args) {
//        int x = 20;
//        String sup = (x < 15) ? "small" : (x < 22) ? "tiny" : "huge";
//        System.out.println(sup);
//    }

//    public static void main(String[] args) {
//        int w = (int) 888.8;
//        byte x = (byte) 1000L;
//        long y = (byte) 100;
//        byte z = (byte) 100L;
//        System.out.println(w + " " + x + " " + y + " " + z);
//
//        int a = 16*4;
//        int b = 16>>2;
//        int c = 16/2^2;
//        int d = 16>>>2;
//        System.out.println(a + " " + b + " " + c + " " + d);
//    }

//    static int j;
//    static void methodA(int i) {
//        boolean b;
//        do {
//            b = i < 10 | methodB(4);
//            b = i < 10 || methodB(8);
//        } while (!b);
//    }
//    static boolean methodB(int i) {
//        j += i;
//        return true;
//    }
//    public static void main(String[] args) {
//        methodA(0);
//        System.out.println("j = " + j);
//    }

//    public static void main(String[] args) {
//        int x = 100;
//        int a = x++;
//        int b = ++x;
//        int c = x++;
//        int d = (a < b) ? b : c;
//        System.out.println(d);
//    }

//    static int i;
//    int j;
//    public static void main(String[] args) {
//        Test1 x1 = new Test1();
//        Test1 x2 = new Test1();
//        x1.i = 3;
//        x1.j = 4;
//        x2.i = 5;
//        x2.j = 6;
//        System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j);
//    }
//
//        }
//    }
}
