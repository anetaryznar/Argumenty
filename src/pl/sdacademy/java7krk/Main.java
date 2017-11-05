package pl.sdacademy.java7krk;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* Zadanie1(Argumentyprogramu)a)Napisz   program,   który   wypisuje   argumenty,
           z   którymi   został   uruchomiony.Uruchom   go   podając   kilka   wyrazów   jako   argumenty.
           b)Napisz   program,   który   wypisuje   pierwszy   argument,
             z   którym   zostałuruchomiony.
             i)Dodaj   do   programu   obsługę   wyjątkuArrayIndexOutOfBoundsException.ii)
             Uruchom   program   bez   argumentów   i   sprawdź,   że   obsługa   wyjątkuzadziałała*/


        //pvsm  - skrot do metody uruchomieniowej

//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }  lub
        try {
            System.out.println(Arrays.toString(args));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println();
        }
    }
}
