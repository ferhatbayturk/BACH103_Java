package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    /*
    TreeSet tekrarsiz elemanlari "alfabetik" veya "kucukten buyuge" dizer.

    TreeSet coooook yavas calisir.

    Note: tekrarsiz elemanlari natural order da depolamak icin TreeSet kullanmak mantiklidir ama
           TreeSet ler coook yavas calistigi icin biz,
          elemanlari once HashSet depolariz sonra HashSet'i TreeSet e cevirerek
          TreeSet in yavas olma problemini asmis oluruz.

       * TreeSet :
        * 1) TreeSet tekrarli eleman kabul etmez, cunku Set'dir.
        * 2) Elemanlari natural Order'a(String ise alfabetik, sayi ise kucukten buyuge)gore dizer.
        * 3) TreeSet, setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmali...
        * 4) TreeSet "null" object'ini eleman olarak kullanilamaz.
     */
    public static void main(String[] args) {

        //Example 1: Sekiz tane unique String elemani alfabetik sirada depolayiniz.
        Long start1 = LocalTime.now().toNanoOfDay();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        Long end1 = LocalTime.now().toNanoOfDay();
        System.out.println(end1 - start1);//5001000

        //2.Way
        HashSet<String> myEmails = new HashSet<>();

        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");
        TreeSet myEmailsSorted = new TreeSet(myEmails);// HashSet'i TreeSet'e çevirmek için bu kodu yazdık.
        System.out.println(myEmailsSorted);
        Long end2 = LocalTime.now().toNanoOfDay();

        System.out.println(end2 - end1);

    }
}
