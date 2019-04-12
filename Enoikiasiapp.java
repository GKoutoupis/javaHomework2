public class Enoikiasiapp{
	public static void main(String[] args) {
		
      Dvd dvd1=new Dvd("dvd","finos film","1995","asa","7",5
         ,"aaa","aaa","aaa",150);
       Dvd dvd2=new Dvd("blue-ray","finos film","1996","asa","7",5
         ,"aaa","aaa","aaa",100);
		Scanner in=new Scanner(System.in);
		//Database data=new Database();
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
   	 			System.out.println("\n1. for dvd")
   	 			System.out.println("2. for blue-ray")
   	 			answer=in.nextLine();
   	 			if (answer.equals("1")) {
   	 				System.out.println("Onoma tainias?")
   	 				name=in.nextLine();
   	 				data.lookup(name,"dvd");
   	 				if (data.getItem(name,"dvd").getTemaxia()>0)
                  {
                     System.out.println("Doste onomateponimo,thlefono,hmeromhnia enoikiasis,hmeres enoikiasis,kostos enoikiasis,kostos gia extra mera enoikiasis");
                     onoma=in.nextLine();
                     thlefono=in.nextInt();
                     hmeromhnia=in.nextLine();
                     hmeres=in.nextInt();
                     kostosenoik=in.nextDouble();
                     extrakostos=in.nextDouble();
                     //πρεπει να δημιουργησουμε αντικειμενο ενοικιαση και να προσθεσουμε στο ARRAY noikiasmena
                     //μπορω να περασω στον constructor του enoikiasi ολο το αντικειμενο που εχει δημιουργηθει η πρεπε
                     //να τα δινω ενα ενα τα στοιχεια με μεθοδους get???
                     Enoikiasi obj=new Enoikiasi(data.getItem(name,"dvd"),onoma,thlefono,hmeres,hmeromhnia
                                                   ,kostosenoik,extrakostos);
                     noikiasmena.add(obj);
                     data.
                  }

   	 			}
   	 			else if(answer.equals("2"))
   	 			{
   	 				System.out.println("Onoma tainias?")
   	 				name=in.nextLine();
   	 				data.lookup(name,"blue-ray");

   	 				data.getItem(name,"blue-ray").;
   	 			}

   	 		}
   	 		else if(answer.equals("1"))
   	 		{
   	 			System.out.println("type konsola \n1. XBOX\n2.PLAYSTATION\n3.NINTENDO");
   	 			answer=in.nextLine();
   	 			if (answer.equals("1")) {
   	 				kathgoria="XBOX"	;
   	 			}
   	 			else if (answer.equals("2")) {
   	 				kathgoria="PLAYSTATION";
   	 			}
   	 			else if(answer.equals("3")){
   	 				kathgoria="NINTENDO";
   	 			}
   	 			System.out.println("type onoma paixnidiou")
   	 			name=in.nextLine();
   	 			data.lookup(name,kathgoria);
   	 		}
		}
	}

}