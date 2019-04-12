public class Enoikiasiapp{
	public static void main(String[] args) {
		

		Scanner in=new Scanner(System.in);
		Database data=new Database();
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
   	 				data.getItem(name,"dvd");

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