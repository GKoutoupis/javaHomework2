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
      Integer hmeromhnia;
      Integer hmeres;
      double  kostosenoik;
      double extrakostos;
      Integer pos;
      List<String> messages = Arrays.asList("onomateponimo","thlefono"
         ,"hmeromhnia enoikiasis","hmeres enoikiasis","kostos enoikiasis","kostos gia extra mera enoikiasis");
      Integer tmp1;

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

                  }
                  else System.out.println("den yparxei ayto poy zhtate!");
                  done=true;

   	 			}   
   }
}
}
}

