package pl.sdacademy.java7krk;

public class Main2 {

    public static void main(String[] args) {

        try {
            System.out.println(args[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("brak argumentow programu");
            System.out.println(e);
        }

    }
}
