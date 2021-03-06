import java.util.*;
import java.io.*;
public class MainApp
{
   public static void main(String[] args) 
   {

      // Lista Pros Enoikiasi
      Enoikiasi dvd1 = new Dvd("dvd", "finos film", "1995", "DVD", 1, 5, "onomaPelati", 6900000000L/* thlefPelati */,
            150/* hmeres enoikiasis */, 45/* hmeromhnia enoikiasis */, 3.7/* kostos enoikiasis */,
            4.5/* extra day kostos */, "komodia",0.0, "skinotheths", "senariografos", "ithopoioi", 120/* diarkeia */);
      Enoikiasi dvd2 = new Dvd("blue-ray", "finos film", "1995", "BR", 1, 5, "onomaPelati", 6971234567L, 150, 45, 3.7, 4.5,
            "komodia",0.0, "aaaa", "aaa", "aaa", 120);
     Enoikiasi dvd3 = new Dvd("dvd", "lucasarts", "1977", "Star Wars", 7, 5, "onomaPelati", 6998979695L, 7, 1411, 3.7, 1,
            "sci-fi",0.0, "Lucas", "Lucas", "Carrie Fisher,Mark Hamill,Harrison Ford", 121);
      Enoikiasi dvd4 = new Dvd("blue-ray", "New Line Cinema", "2003","Return of the King", 1, 5,
           "onomaPelati", 698988878685L, 7, 208, 3.7, 4.5, "adventure,sci-fi",0.0, "Peter Jackson", "J.R.R Tolkien",
          "Elijah Wood,Viggo Mortensen,Ian McKellen", 201);
      Enoikiasi game1 = new Game("nintendo", "nintendo", "1996", "Pokemon Blue", 7, 20, "onomaPelati", 6979787675L, 7,
            1011, 2.5, 3.0, "Rpg",0.0);
      Enoikiasi game2 = new Game("nintendo", "nintendo", "1983", "Super Mario Bros", 7, 20, "onomaPelati", 6969686766L,
            7, 305, 2.5, 3.0, "Arcade",0.0);
      Enoikiasi game3 = new Game("Playstation", "Ubisoft", "2000", "Prince of Persia Sands of Time", 7, 2001,
            "onomaPelati", 6959585756L, 7, 282, 2.5, 3.0, "Adventure,Action",0.0);
      Enoikiasi game4 = new Game("Playstation", "Bethesda", "2011", "Skyrim", 7, 202, "onomaPelati", 6949484746L, 60, 216,
            2.5, 3.0, "RPG,Adventure",0.0);
      Enoikiasi game5 = new Game("Xbox", "Microsoft", "2001", "Halo", 7, 4, "onomaPelati", 6939383736L, 7, 34, 2.5, 3.0,
            "Shooting,Adventure",0.0);
      Enoikiasi game6 = new Game("Xbox", "Microsoft", "2018", "Sea of Thieves", 7, 18, "onomaPelati", 6929282726L, 7, 45,
            2.5, 3.0, "MMO",0.0);

      Scanner in = new Scanner(System.in);
      Database data = new Database();
      
      //arxikopoihsh ths listas data.prosenoik
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
      String answer2="-1";
      String name;
      String onoma;
      Long thlefono;
      Integer hmeromhnia;
      Integer hmeres;
      double kostosenoik;
      double extrakostos;
      Integer pos;
      Integer tmp1=10;
      String platforma = null;
      Double telikoKostos;
      Integer xronia;
      Integer diathesimatemaxia;

      data.ShowAll();

      while (!done) {
         ShowChoices();

         answer = in.nextLine();
         if (answer.equals("0")) 
         {
            platforma=SelectDVDorCD(in,platforma);

            System.out.println("Onoma tainias?");
            name = in.nextLine();
            if (data.booleanfinder(name, platforma)) {

               pos = data.positionfinder(name, platforma);
               System.out.println(data.prosenoik.get(pos));
               System.out.println("Tha thelate na noikasete auth thn tainia? y/n");
               answer = in.nextLine();
               if (answer.equals("y")) {

                  diathesimatemaxia=data.prosenoik.get(pos).getTemaxia();
                  if (diathesimatemaxia > 0) {
                     System.out.println("Doste onomateponimo (string)");
                     onoma = in.nextLine();
                     System.out.println("Doste thlefono (integer)");
                     thlefono = in.nextLong();
                     System.out.println("Doste hmeromhnia enoikiasis (integer)"); 
                     hmeromhnia = in.nextInt();
                     System.out.println("Doste hmeres enoikiasis (integer)");
                     hmeres = in.nextInt();
                     System.out.println("Doste kostosenoik (double)");
                     kostosenoik = in.nextDouble();
                     System.out.println("Doste extra kostos gia kathisterisi epistrofis (double)");
                     extrakostos = in.nextDouble();

                     SetXronoEnoik(platforma,pos,data);
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
                     data.ShowAll();                  
                  } else {
                     System.out.println("Den einai diathesimo");
                  }
               }
            } else 
            {
               System.out.println("\nDen uparxei auth h tainia gia auth thn platforma");
            }
         }
         else if (answer.equals("1")) 
         {  
            platforma=SelectPaixnidomixani(in,platforma);
            
            System.out.println("Onoma paixnidiou?");
            name = in.nextLine();
            if (data.booleanfinder(name, platforma)) {
               pos = data.positionfinder(name, platforma);
               System.out.println(data.prosenoik.get(pos));
               System.out.println("Tha thelate na noikasete auth thn tainia? y/n");
               answer = in.nextLine();
               if (answer.equals("y")) {
                  diathesimatemaxia=data.prosenoik.get(pos).getTemaxia();
                  if (diathesimatemaxia > 0) {
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
           pos= ChooseNoikiasmenoInfo(in, data,tmp1);
           name=data.noikiasmena.get(pos).getTitlos();
           platforma=data.noikiasmena.get(pos).getPlatforma();
            Xenoikiasi(name, platforma,data);
         } 
         else if (answer.equals("3")) 
         {
            done = true;
         }
         else if (answer.equals("4"))//dokimi gia thn synarthsh gia ektypvsh
         {
            CreateFileProsEnoik(data);
         }
      }
   }//telos main

//deixnei tis epiloges ths diepafhs
public static  void ShowChoices()
{
   System.out.println("\n0. Episkopisi diathesimvn tainivn");
   System.out.println("1.Episkopisi diathesimvn paixnidivn");
   System.out.println("2.Episkopisi enoikiasevn");
   System.out.println("3. Exit"); 
}

//epilego an einai playstation nintendo h xbox
public static String SelectPaixnidomixani(Scanner in,String platforma)
{  
   String answer2="-1";
   System.out.println("\n1. for Playstation");
   System.out.println("2. for Xbox");
   System.out.println("3. for Nintendo");
   answer2=in.nextLine();
   if (answer2.equals("1")) 
   {
      platforma = "playstation";
   } 
   else if (answer2.equals("2")) 
   {
      platforma = "xbox";
   } 
   else if (answer2.equals("3")) 
   {
      platforma = "nintendo";
   }
   return platforma;
}
//dialego an tha einai CD h dvd
public static String SelectDVDorCD(Scanner in, String platforma)
{  
   String answer2="-1";
   System.out.println("\n1. for dvd");
   System.out.println("2. for blue-ray");
   answer2 = in.nextLine();
   if (answer2.equals("1")) {
               platforma = "dvd";
            } 
   else if (answer2.equals("2")) 
            {
               platforma = "blue-ray";
            }
   return platforma;
}            
public static void SetXronoEnoik(String platforma,Integer pos, Database data)
{
                     if (platforma.equals("blue-ray")||(platforma.equals("dvd"))&&data.prosenoik.get(pos).getEtosparagvghs()=="2019")
                     {
                        data.prosenoik.get(pos).setXronosEnoikiasis(1);
                     } 
                     else 
                     { 
                        data.prosenoik.get(pos).setXronosEnoikiasis(7);
                     }
}
public static Integer ChooseNoikiasmenoInfo(Scanner in,Database data, Integer tmp1)
            { 
               System.out.println("Poion arithmo enoikiasis thelete???");
               System.out.println("Dialexte apo 1 ews  "+data.noikiasmena.size());
               tmp1=in.nextInt();
               tmp1--;
               System.out.println(data.noikiasmena.get(tmp1).toString2());
               return tmp1;
            }

public static void Xenoikiasi(String name, String platforma, Database data)
{  Scanner response = new Scanner(System.in);

   Integer pos;
   System.out.println("Thelete na xenoikiasete? (y/n)");
   if (response.nextLine().equals("y")) {
      System.out.println("mpainei mesa");
      pos=data.positionfinder(name,platforma);
      data.xenoikiastike(pos);

   }
}
/*public static void CreateFileProsEnoik(Database data)//write data from list to file
{
   System.out.println(" >>>>>>> Write data from ARRAYLIST to FILE...");
   FileWriter writer=null;

   try
   {
      writer=new FileWriter(new File("products.txt"));
      writer.write("ITEM_LIST" +"\n");
      for(Enoikiasi item: data.prosenoik)
      {
         if (item instanceof Dvd) 
         {
            writer.write(
               "\t" +"ITEM"+"\n"+
               "\t"+"{"+"\n"+
               "\t" +"\t"+"ITEM_TYPE "+ "DVD"+"\n"+
               "\t"+"\t"+ "SUB_TYPE"+ ((Dvd) item).getPlatforma()+"\n"+
               "\t"+"\t"+"TITLE"+ ((Dvd) item).getTitlos()+"\n"+
               "\t"+"\t"+"YEAR" + ((Dvd) item).getEtosparagvghs()+"\n"+
               "\t"+"\t"+"CAST" + ((Dvd) item).getIthopoioi()+"\n"+
                "\t"+"\t"+ "DIRECTOR" + ((Dvd) item).getSkinothetis()+"\n"+
               "\t"+"\t"+"CATEGORY" +((Dvd) item).getKatigoria()+"\n"+
               "\t"+"\t"+ "COPIES" + ((Dvd) item).getTemaxia()+"\n"+
               "\t"+"}"+"\n"  );    
         }
         else if (item instanceof Game) 
         {
              writer.write(
               "\t" +"ITEM"+"\n"+
               "\t"+"{"+"\n"+
               "\t" +"\t"+"ITEM_TYPE "+ "game"+"\n"+
               "\t"+"\t"+"TITLE"+ ((Game) item).getTitlos()+"\n"+
               "\t"+"\t"+"COMPANY" + ((Game) item).getEtairia()+"\n"+
               "\t"+"\t"+"PLATFORM" + ((Game) item).getPlatforma()+"\n"+
               "\t"+"\t"+ "COPIES" + ((Game) item).getTemaxia()+"\n"+
               "\t"+"}"+"\n"  );  
         }//game
      
      }//for      
      writer.close();
      System.out.println(">>>>>>>>>>>>End writing files");
   }//try
   catch(IOException e)
   {
      System.err.println("Error"+e.getMessage());
   }
}*/
public static void CreateFileEnoikiaseis(Database data)//write data from list to file
{
   System.out.println(" >>>>>>> Write data from ARRAYLIST to FILE...");
   FileWriter writer=null;

   try
   {
      writer= new FileWriter(new File("products.txt"));
      writer.write("RENTAL_LIST" +"\n");
      for(Enoikiasi item: data.noikiasmena)
      {
         if (item instanceof Dvd) 
         {
            writer.write(
               "\t" +"RENTAL"+"\n"+
               "\t"+"{"+"\n"+
               "\t" +"\t"+"ITEM_TYPE "+ "movie"+"\n"+
               "\t"+"\t"+ "SUB_TYPE"+ ((Dvd) item).getPlatforma()+"\n"+
               "\t"+"\t"+"TITLE"+ ((Dvd) item).getTitlos()+"\n"+
               "\t"+"\t"+"NAME"+ ((Dvd) item).getOnomaPelati()+"\n"+
               "\t"+"\t"+"DATE"+ ((Dvd) item).getHmeromhniaEnoikiasis()+"\n"+
               "\t"+"\t"+"YEAR" + ((Dvd) item).getEtosparagvghs()+"\n"+
               "\t"+"\t"+"CAST" + ((Dvd) item).getIthopoioi()+"\n"+
               "\t"+"\t"+ "DIRECTOR" + ((Dvd) item).getSkinothetis()+"\n"+
               "\t"+"\t"+"CATEGORY" +((Dvd) item).getKatigoria()+"\n"+
               "\t"+"}"+"\n"  );    
         }
         else if (item instanceof Game) 
         {
              writer.write(
               "\t" +"RENTAL"+"\n"+
               "\t"+"{"+"\n"+
               "\t" +"\t"+"ITEM_TYPE "+ "game"+"\n"+
               "\t"+"\t"+"TITLE"+ ((Game) item).getTitlos()+"\n"+
               "\t"+"\t"+"COMPANY" + ((Game) item).getEtairia()+"\n"+
               "\t"+"\t"+"PLATFORM" + ((Game) item).getPlatforma()+"\n"+
               "\t"+"\t"+"NAME"+ ((Game) item).getOnomaPelati()+"\n"+
               "\t"+"\t"+"DATE"+((Game) item).getHmeromhniaEnoikiasis()+"\n"+
               "\t"+"\t"+"COMPANY" + ((Game) item).getEtairia()+"\n"+
               "\t"+"}"+"\n"  );  
         }
        
      }//FOR      
       writer.close();
   }//try
   catch(IOException e)
   {
      System.err.println("Error");
   }
}
}//telos Mainapp
