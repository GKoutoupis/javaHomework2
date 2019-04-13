import java.util.*;


public class Enoikiasiapp{
	public static void main(String[] args) {
		
      Dvd dvd1=new Dvd("dvd","finos film","1995","asa","7",5 ,"aaa",69748,150,45,3.7,4.5,"aaaa","aaa","aaa",120);
      Dvd dvd2=new Dvd("blue-ray","finos film","1995","asa","7",5 ,"aaa",69748,150,45,3.7,4.5,"aaaa","aaa","aaa",120);
		Scanner in=new Scanner(System.in);
		Database data=new Database();
      data.prosenoik.add(dvd1);
      data.prosenoik.add(dvd2);
		boolean done=false;
		String answer;
		String name;
      String onoma;
      Integer  thlefono;
      String hmeromhnia;
      Integer hmeres;
      double  kostosenoik;
      double extrakostos;
      Integer pos;



		while (!done)
		{
			System.out.println("\n0. Episkopisi diathesimvn tainivn");
   	 		System.out.println("1.Episkopisi diathesimvn paixnidivn");
   	 		System.out.println("2.Episkopisi enoikiasevn");
   	 		System.out.println("3. Exit");
   	 		
   	 		answer=in.nextLine();
   	 		if (answer.equals("0")){
   	 			System.out.println("\n1. for dvd");
   	 			System.out.println("2. for blue-ray");
   	 			answer=in.nextLine();
   	 			if (answer.equals("1")) {
   	 				System.out.println("Onoma tainias?");
   	 				name=in.nextLine();
   	 				if (data.booleanfinder(name,"dvd"))
                  {  pos=data.positionfinder(name, "dvd");
                     System.out.println("Doste onomateponimo,thlefono,hmeromhnia enoikiasis,hmeres enoikiasis,kostos enoikiasis,kostos gia extra mera enoikiasis");
                     onoma=in.nextLine();
                     thlefono=in.nextInt();
                     hmeromhnia=in.nextLine();
                     hmeres=in.nextInt();
                     kostosenoik=in.nextDouble();
                     extrakostos=in.nextDouble();

                  
                    // Enoikiasi obj=new Enoikiasi(data.prosenoik.get(pos),onoma,thlefono,hmeres,hmeromhnia
                                                   //,kostosenoik,extrakostos);

                     data.noikiasmena.add(data.prosenoik.get(pos));//prosthetei to antikeimeno sto arraylist noikiasmena
                     data.noikiasmena.get(data.noikiasmena.size()).setOnomaPelati(onoma);//updatePelati(onoma,thlefono,hmeromhnia,hmeres,kostosenoik,extrakostos);
                     //update sta nea stoixeia pou exei balei o xrhsths
                     data.noikiastike(pos);//meivsh apothematos kata ena.
                     
                  }
                  else System.out.println("den yparxei ayto poy zhtate!");
                  done=true;

   	 			}   
   }
}
}
}

