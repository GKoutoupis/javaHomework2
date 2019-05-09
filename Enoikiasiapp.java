import java.util.*;


public class Enoikiasiapp{
	public static void main(String[] args) {
		
      Dvd dvd1=new Dvd("dvd","finos film","1995","bakalogatos","7",5 ,"babis",69748,150,45,3.7,4.5,"komodia","aaaa","aaa","aaa",120);
      Dvd dvd2=new Dvd("blue-ray","finos film","1995","asa","7",5 ,"aaa",69748,150,45,3.7,4.5,"komodia","aaaa","aaa","aaa",120);

		Scanner in=new Scanner(System.in);
		Database data=new Database();
      data.prosenoik.add(dvd1);
      data.prosenoik.add(dvd2);
		boolean done=false;
      Integer answer;
      String answerTemp;
		String name;
      String onoma;
      Integer  thlefono;
      Integer hmeromhnia;
      Integer hmeres;
      double  kostosenoik;
      double extrakostos;
      Integer pos;
      Integer tmp1;
      String platforma=null;

		while (!done)
		{
			System.out.println("\n0. Episkopisi diathesimvn tainivn");
   	 		System.out.println("1.Episkopisi diathesimvn paixnidivn");
   	 		System.out.println("2.Episkopisi enoikiasevn");
   	 		System.out.println("3. Exit");
   	 		
             answerTemp=in.nextLine();
             answer = Integer.parseInt(answerTemp);
   	 		switch (answer) {
             case 0:
   	 			System.out.println("\n1. for dvd");
   	 			System.out.println("2. for blue-ray");
   	 			answerTemp=in.nextLine();
               answer = Integer.parseInt(answerTemp);
                
              switch (answer) {
                 case 1: 
                  platforma="dvd";
                  break;
                 case 2: 
                  platforma ="blue-ray";
                  break;
               }  

   	 			System.out.println("Onoma tainias?");
   	 			name=in.nextLine();
   	 			if (data.booleanfinder(name,platforma)){
                   
                  pos=data.positionfinder(name, platforma);
                  System.out.println(data.prosenoik.get(pos));//toString
                  System.out.println("Tha thelate na noikasete auth thn tainia? y/n");
                  String answer2=in.nextLine();
                  if ( answer2.equals("y")) {
                     System.out.println("Doste onomateponimo (string)");
                     onoma=in.nextLine();
                     System.out.println("Doste thlefono (integer)");
                     thlefono=in.nextInt();
                     System.out.println("Doste hmeromhnia enoikiasis (string)");
                     hmeromhnia=in.nextInt();
                     System.out.println("Doste hmeres enoikiasis (integer)");
                     hmeres=in.nextInt();
                     System.out.println("Doste kostosenoik (double)");
                     kostosenoik=in.nextDouble();
                     System.out.println("Doste extra kostos (double)");
                     extrakostos=in.nextDouble();
                     

                     data.noikiasmena.add(data.prosenoik.get(pos));
                     System.out.println(data.noikiasmena.get(0));
                     tmp1=data.noikiasmena.size();
                     tmp1--;
                  
                     //update ta stoixeia tou pelati sto antikeimeno Enoikiasi mesa sth Arraylist noikiasmena
                     data.noikiasmena.get(tmp1).setThlefPelati(thlefono);
                     data.noikiasmena.get(tmp1).setImeresEnoikiasis(hmeres);
                     data.noikiasmena.get(tmp1).setHmeromhniaEnoikiasis(hmeromhnia);
                     data.noikiasmena.get(tmp1).setKostosEnoikiasis(kostosenoik);
                     data.noikiasmena.get(tmp1).setExtraDayKostos(extrakostos);
                     //meivsh apothematos kata ena.
                     data.noikiastike(pos);
                  }
                } else {
                   System.out.println("\nDen uparxei auth h tainia gia auth thn platforma");
                }
             break;             
             case 1:           
                  System.out.println("\n1. for Playstation");
                  System.out.println("2. for Xbox");
                  System.out.println("3. for Nintendo");
                  answerTemp=in.nextLine();
                  answer = Integer.parseInt(answerTemp);

                  switch (answer) {
                     case 1:
                     platforma="playstation";
                     break;
                     case 2:
                     platforma="xbox" ;
                     break;
                     case 3:
                     platforma="nintendo";
                     break;
                  }
                     
                     System.out.println("Onoma paixnidiou?");
                     name=in.nextLine();
                     if (data.booleanfinder(name,platforma))
                        {  pos=data.positionfinder(name, platforma);
                           System.out.println(data.prosenoik.get(pos));
                           System.out.println("Doste onomateponimo string");
                           onoma=in.nextLine();
                           System.out.println("Doste thlefono integer");
                           thlefono=in.nextInt();
                           System.out.println("Doste hmeromhnia enoikiasis string");
                           hmeromhnia=in.nextInt();
                           System.out.println("Doste hmeres enoikiasis Integer");
                           hmeres=in.nextInt();
                           System.out.println("Doste kostosenoik double");
                           kostosenoik=in.nextDouble();
                           System.out.println("Doste extra kostos double");
                           extrakostos=in.nextDouble();
                     

                           data.noikiasmena.add(data.prosenoik.get(pos));
                           System.out.println(data.noikiasmena.get(0));
                           tmp1=data.noikiasmena.size();
                           tmp1--;
                           data.noikiasmena.get(tmp1).setOnomaPelati(onoma);//updatePelati(onoma,thlefono,hmeromhnia,hmeres,kostosenoik,extrakostos);
                           data.noikiasmena.get(tmp1).setThlefPelati(thlefono);
                           data.noikiasmena.get(tmp1).setImeresEnoikiasis(hmeres);
                           data.noikiasmena.get(tmp1).setHmeromhniaEnoikiasis(hmeromhnia);
                           data.noikiasmena.get(tmp1).setKostosEnoikiasis(kostosenoik);
                           data.noikiasmena.get(tmp1).setExtraDayKostos(extrakostos);
                           data.noikiastike(pos);//meivsh apothematos kata ena.
                        } else {
                           System.out.print("\nDen uparxei auto to paixnidi gia auth thn platforma");
                        }
             case 2:
             for(int i = 0; i < data.noikiasmena.size(); i++) {   
               System.out.print(data.noikiasmena.get(i));
               }
             break;            
                        
             case 3:
               done=true;
             break;      

            }
      }
   }

}
