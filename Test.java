package lista;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); //Tworzymy listę String
        list.add("lis"); //dodajemy obiekty do listy
        list.add("koń");
        list.add("słoń");
        list.add("żyrafa");
        list.add("zebra");
        //System.out.println(list);
        System.out.println("-----------------------------------------------------------------------");
       /* Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
        System.out.println("-----------------------------------------------------------------------");
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
 //-----------------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nr 1 lub 2 lub 3: ");
       int blok = scanner.nextInt();
        if (blok == 1) {
            list.remove("zebra");
            for (int i=0; i<list.size(); i++) {
                System.out.println(list.get(i));
            }}
        if (blok == 2) {
            list.remove("zebra");
            list.add("lew");
            list.remove("lis");
            for (int i=0; i<list.size(); i++) {
                System.out.println(list.get(i));
            }}
        if (blok == 3) {
            list.remove("zebra");
            list.add("lew");
            list.remove("lis");
            list.add("pies");
            list.remove("koń");
            for (int i=0; i<list.size(); i++) {
                System.out.println(list.get(i));
            }}
            else {
            System.out.println("Taki blok nie istnieje");
        }
        /*Collections.sort(list);
        System.out.println(list);*/






    }
}
