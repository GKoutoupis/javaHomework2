import java.util.*;

public class MainApp {
   public static void main(String[] args) {

      // Lista Pros Enoikiasi
      Dvd dvd1 = new Dvd("dvd", "finos film", "1995", "DVD", 1, 5, "onomaPelati", 6900000000L/* thlefPelati */,
            150/* hmeres enoikiasis */, 45/* hmeromhnia enoikiasis */, 3.7/* kostos enoikiasis */,
            4.5/* extra day kostos */, "komodia",0.0, "skinotheths", "senariografos", "ithopoioi", 120/* diarkeia */);
      Dvd dvd2 = new Dvd("blue-ray", "finos film", "1995", "BR", 1, 5, "onomaPelati", 6971234567L, 150, 45, 3.7, 4.5,
            "komodia",0.0, "aaaa", "aaa", "aaa", 120);
      Dvd dvd3 = new Dvd("dvd", "lucasarts", "1977", "Star Wars", 7, 5, "onomaPelati", 6998979695L, 7, 1411, 3.7, 1,
            "sci-fi",0.0, "Lucas", "Lucas", "Carrie Fisher,Mark Hamill,Harrison Ford", 121);
      Dvd dvd4 = new Dvd("blue-ray", "New Line Cinema", "2003","Return of the King", 1, 5,
           "onomaPelati", 698988878685L, 7, 208, 3.7, 4.5, "adventure,sci-fi",0.0, "Peter Jackson", "J.R.R Tolkien",
          "Elijah Wood,Viggo Mortensen,Ian McKellen", 201);
      Game game1 = new Game("nintendo", "nintendo", "1996", "Pokemon Blue", 7, 20, "onomaPelati", 6979787675L, 7,
            1011, 2.5, 3.0, "Rpg",0.0);
      Game game2 = new Game("nintendo", "nintendo", "1983", "Super Mario Bros", 7, 20, "onomaPelati", 6969686766L,
            7, 305, 2.5, 3.0, "Arcade",0.0);
      Game game3 = new Game("Playstation", "Ubisoft", "2000", "Prince of Persia Sands of Time", 7, 2001,
            "onomaPelati", 6959585756L, 7, 282, 2.5, 3.0, "Adventure,Action",0.0);
      Game game4 = new Game("Playstation", "Bethesda", "2011", "Skyrim", 7, 202, "onomaPelati", 6949484746L, 60, 216,
            2.5, 3.0, "RPG,Adventure",0.0);
      Game game5 = new Game("Xbox", "Microsoft", "2001", "Halo", 7, 4, "onomaPelati", 6939383736L, 7, 34, 2.5, 3.0,
            "Shooting,Adventure",0.0);
      Game game6 = new Game("Xbox", "Microsoft", "2018", "Sea of Thieves", 7, 18, "onomaPelati", 6929282726L, 7, 45,
            2.5, 3.0, "MMO",0.0);

      Scanner in = new Scanner(System.in);
      Database data = new Database();
      data.prosenoik.add(dvd1);
      data.prosenoik.add(dvd2);
      data.prosenoik.add(dvd3);
      data.prosenoik.add(dvd4);
      data.prosenoik.add(game1);
      data.prosenoik.add(game2);
      data.prosenoik.add(game3);
      data.prosenoik.add(game4);
      data.prosenoik.add(game5);
      data.prosenoik.add(game6);
     
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
      Double telikoKostos;
      Integer xronia;

      while (!done) {
         ShowChoices();

         answer = in.nextLine();
         if (answer.equals("0")) 
         {
            SelectDvdOrCD();
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
                  if (data.prosenoik.get(pos).getTemaxia() > 0) {
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
                     if (answer2.equals("2")||((answer2.equals("1"))&&data.prosenoik.get(pos).getEtosparagvghs()=="2019")){
                        data.prosenoik.get(pos).setXronosEnoikiasis(1);
                     } else { 
                        data.prosenoik.get(pos).setXronosEnoikiasis(7);
                     }
                     
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
                     data.noikiasmena.get(tmp1).setTelikoKostos(kostosenoik+(hmeres-data.prosenoik.get(pos).getXronosenoikiasis())*extrakostos);
                     // meivsh apothematos kata ena.
                     data.noikiastike(pos);
                  } else {
                     System.out.println("Den einai diathesimo");
                  }
               }
            } else {
               System.out.println("\nDen uparxei auth h tainia gia auth thn platforma");
            }
         }
         else if (answer.equals("1")) 
         {
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
                  if (data.prosenoik.get(pos).getTemaxia() > 0) {
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
                     data.prosenoik.get(pos).setXronosEnoikiasis(1);
                     

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
                     data.noikiasmena.get(tmp1).setTelikoKostos(kostosenoik+(hmeres-data.prosenoik.get(pos).getXronosenoikiasis())*extrakostos);
                     data.noikiastike(pos);// meivsh apothematos kata ena.

                  } else {
                     System.out.println("Den einai diathesimo");
                  }
               }
            } else {
               System.out.print("\nDen uparxei auto to paixnidi gia auth thn platforma");
            }
         } 
         else if (answer.equals("2")) 
         {
            for (int i = 0; i < data.noikiasmena.size(); i++) {
               System.out.print(data.noikiasmena.get(i).toString2() + "\n ---------------------------------");
            }
         } 
         else if (answer.equals("3")) 
         {
            done = true;
         }
      }
   }
public static  void ShowChoices()
{
   System.out.println("\n0. Episkopisi diathesimvn tainivn");
   System.out.println("1.Episkopisi diathesimvn paixnidivn");
   System.out.println("2.Episkopisi enoikiasevn");
   System.out.println("3. Exit"); 
}
public static void SelectDvdOrCD()
{
   System.out.println("\n1. for dvd");
   System.out.println("2. for blue-ray");
}
}
