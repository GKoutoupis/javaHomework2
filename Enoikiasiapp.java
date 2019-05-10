import java.util.*;

public class Enoikiasiapp {
   public static void main(String[] args) {

      //Lista Pros Enoikiasi
      Dvd dvd1 = new Dvd("dvd", "finos film", "1995", "DVD", "1", 5, "onomaPelati",
            6900000000L/* thlefPelati */, 150/* hmeres enoikiasis */, 45/* hmeromhnia enoikiasis */,
            3.7/* kostos enoikiasis */, 4.5/*extra day kostos*/, "komodia", "skinotheths", "senariografos", "ithopoioi", 120/*diarkeia*/);
      Dvd dvd2 = new Dvd("blue-ray", "finos film", "1995", "BR", "7", 5, "onomaPelati", 6971234567L, 150, 45, 3.7, 4.5, "komodia",
            "aaaa", "aaa", "aaa", 120);
      Game game1 = new Game("game", "nintendo", "1996", "Pokemon Blue", "7", 2019, "onomaPelati", 6979787675L, 7, 1011, 2.5, 3.0, "Rpg");

      Scanner in = new Scanner(System.in);
      Database data = new Database();
      data.prosenoik.add(dvd1);
      data.prosenoik.add(dvd2);
      boolean done = false;
      String answer;
      String answer2;
      String name;
      String onoma;
      Long thlefono;
      Integer hmeromhnia;
      Integer hmeres;
      double kostosenoik;
      double extrakostos;
      Integer pos;
      Integer tmp1;
      String platforma = null;

      while (!done) {
         System.out.println("\n0. Episkopisi diathesimvn tainivn");
         System.out.println("1.Episkopisi diathesimvn paixnidivn");
         System.out.println("2.Episkopisi enoikiasevn");
         System.out.println("3. Exit");

         answer = in.nextLine();
         if (answer.equals("0")) {
            System.out.println("\n1. for dvd");
            System.out.println("2. for blue-ray");
            answer2 = in.nextLine();

            if (answer2.equals("1")) {
               platforma = "dvd";
            } else if (answer2.equals("2")) {
               platforma = "blue-ray";
            }

            System.out.println("Onoma tainias?");
            name = in.nextLine();
            if (data.booleanfinder(name, platforma)) {

               pos = data.positionfinder(name, platforma);
               System.out.println(data.prosenoik.get(pos));
               System.out.println("Tha thelate na noikasete auth thn tainia? y/n");
               answer = in.nextLine();
               if (answer.equals("y")) {
                  if (data.prosenoik.get(pos).getTemaxia > 0) {
                     System.out.println("Doste onomateponimo (string)");
                     onoma = in.nextLine();
                     System.out.println("Doste thlefono (integer)");
                     thlefono = in.nextLong();
                     System.out.println("Doste hmeromhnia enoikiasis (string)");
                     hmeromhnia = in.nextInt();
                     System.out.println("Doste hmeres enoikiasis (integer)");
                     hmeres = in.nextInt();
                     System.out.println("Doste kostosenoik (double)");
                     kostosenoik = in.nextDouble();
                     System.out.println("Doste extra kostos (double)");
                     extrakostos = in.nextDouble();

                     data.noikiasmena.add(data.prosenoik.get(pos));
                     System.out.println(data.noikiasmena.get(0));
                     tmp1 = data.noikiasmena.size();
                     tmp1--;

                     // update ta stoixeia tou pelati sto antikeimeno Enoikiasi mesa sth Arraylist
                     // noikiasmena
                     data.noikiasmena.get(tmp1).setThlefPelati(thlefono);
                     data.noikiasmena.get(tmp1).setImeresEnoikiasis(hmeres);
                     data.noikiasmena.get(tmp1).setHmeromhniaEnoikiasis(hmeromhnia);
                     data.noikiasmena.get(tmp1).setKostosEnoikiasis(kostosenoik);
                     data.noikiasmena.get(tmp1).setExtraDayKostos(extrakostos);
                     // meivsh apothematos kata ena.
                     data.noikiastike(pos);
                  } else {
                     System.out.println("Den einai diathesimo");
                  }
               }
            } else {
               System.out.println("\nDen uparxei auth h tainia gia auth thn platforma");
            }
         } else if (answer.equals("1")) {
            System.out.println("\n1. for Playstation");
            System.out.println("2. for Xbox");
            System.out.println("3. for Nintendo");
            answer2 = in.nextLine();

            if (answer2.equals("1")) {
               platforma = "playstation";
            } else if (answer2.equals("2")) {
               platforma = "xbox";
            } else if (answer2.equals("3")) {
               platforma = "nintendo";
            }

            System.out.println("Onoma paixnidiou?");
            name = in.nextLine();
            if (data.booleanfinder(name, platforma)) {
               pos = data.positionfinder(name, platforma);
               System.out.println(data.prosenoik.get(pos));
               System.out.println("Tha thelate na noikasete auth thn tainia? y/n");
               answer = in.nextLine();
               if (answer.equals("y")) {
                  if (data.prosenoik.get(pos).getTemaxia > 0) {
                     System.out.println("Doste onomateponimo string");
                     onoma = in.nextLine();
                     System.out.println("Doste thlefono integer");
                     thlefono = in.nextLong();
                     System.out.println("Doste hmeromhnia enoikiasis string");
                     hmeromhnia = in.nextInt();
                     System.out.println("Doste hmeres enoikiasis Integer");
                     hmeres = in.nextInt();
                     System.out.println("Doste kostosenoik double");
                     kostosenoik = in.nextDouble();
                     System.out.println("Doste extra kostos double");
                     extrakostos = in.nextDouble();

                     data.noikiasmena.add(data.prosenoik.get(pos));
                     System.out.println(data.noikiasmena.get(0));
                     tmp1 = data.noikiasmena.size();
                     tmp1--;
                     data.noikiasmena.get(tmp1).setOnomaPelati(onoma);// updatePelati(onoma,thlefono,hmeromhnia,hmeres,kostosenoik,extrakostos);
                     data.noikiasmena.get(tmp1).setThlefPelati(thlefono);
                     data.noikiasmena.get(tmp1).setImeresEnoikiasis(hmeres);
                     data.noikiasmena.get(tmp1).setHmeromhniaEnoikiasis(hmeromhnia);
                     data.noikiasmena.get(tmp1).setKostosEnoikiasis(kostosenoik);
                     data.noikiasmena.get(tmp1).setExtraDayKostos(extrakostos);
                     data.noikiastike(pos);// meivsh apothematos kata ena.

                  } else {
                     System.out.println("Den einai diathesimo");
                  }
               }
            } else {
               System.out.print("\nDen uparxei auto to paixnidi gia auth thn platforma");
            }
         } else if (answer.equals("2")) {
            for (int i = 0; i < data.noikiasmena.size(); i++) {
               System.out.print(data.noikiasmena.get(i).toString2() + "\n ---------------------------------");
            }
         } else if (answer.equals("3")) {
            done = true;

         }
      }
   }

}
