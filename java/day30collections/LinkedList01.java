package day30collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {


        LinkedList<String> names = new LinkedList<>();

        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names); //[Chris, Alexandre, Mark, Tom, Jeremy, Hans]
        /*
            Retrieves, but does not remove, first element of this list.
            Returns: the first element of this list, or "null" if this list is empty
         */
        /*
    Bu listenin ilk öğesini alır, ancak kaldırmaz.
    Döndürür: bu listenin ilk öğesi veya bu liste boşsa "null"
 */
        String firstEl = names.peek();
        System.out.println(firstEl);//Chris

        System.out.println(names);// [Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        LinkedList<String> myList = new LinkedList<>();

        String first = myList.peek();
        System.out.println(first);//null


        String firstElement = names.poll();
        System.out.println(firstElement);//Chris
        System.out.println(names); //[Alexandre, Mark, Tom, Jeremy, Hans]

        /*Retrieves, but does not remove, (first element) of this list.
        NoSuchElementException – if this list is empty
                 */

        String f = names.element();
        System.out.println(f);//Alexandre
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]

        /*
        Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
         Returns: the first element of this list, or null if this list is empty

         */

        names.peekFirst();


        //  Example 1: "A" ile baslayan tum isimleri "******" ceviriniz.

        LinkedList<String> students = new LinkedList<>();

        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");


        System.out.println(students);

        for (String w : students) {

            if (w.startsWith("A")) {
                students.set(students.indexOf(w), "*****");
            }
        }
        System.out.println(students);

        //Interview Sorusu
        //  Example 2: List'deki 4 harften cok harf iceren isimleri siliniz
        //Eleman sayisini azaltacagimiz icin i ye ihtiyacimiz var ,o yuzden for-each loop degil for-loop kullaniyoruz.

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).length() > 4) {
                students.remove(students.get(i));
                i--;
            }
        }
        System.out.println(students);  //[Mark, Tom, Hans]

    }
}
