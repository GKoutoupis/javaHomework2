public class Enoikiasiapp{
	public static void main(String[] args) {
		
      Dvd dvd1=new Dvd("dvd","finos film","1995","asa","7",5
         ,"aaa","aaa","aaa",150);
       Dvd dvd2=new Dvd("blue-ray","finos film","1996","asa","7",5
         ,"aaa","aaa","aaa",100);

		Scanner in=new Scanner(System.in);
		Database data=new Database();
      prosenoik.add(dvd1);
      prosenoik.add(dvd2);
		boolean done=false;
		String answer;
		String name;



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
   	 				if (exeitemaxia(name) & yparxei(name,"dvd"))
                  {  
                     System.out.println("Doste onomateponimo,thlefono,hmeromhnia enoikiasis,hmeres enoikiasis,kostos enoikiasis,kostos gia extra mera enoikiasis");
                     onoma=in.nextLine();
                     thlefono=in.nextInt();
                     hmeromhnia=in.nextLine();
                     hmeres=in.nextInt();
                     kostosenoik=in.nextDouble();
                     extrakostos=in.nextDouble();
                  
                     Enoikiasi obj=new Enoikiasi(prosenoik.get(name),onoma,thlefono,hmeres,hmeromhnia
                                                   ,kostosenoik,extrakostos);
                     noikiasmena.add(obj);
                     prosenoik.noikiastike(name,"dvd");
                  }
                  else System.out.println("den yparxei ayto poy zhtate!");
                  done=true;

   	 			}   
   }
}
}
}

