import java.util.*;


public class Database
{
	private ArrayList<Enoikiasi> prosenoik =new ArrayList<Enoikiasi>();
	private ArrayList<Enoikiasi> noikiasmena=new ArrayList<Enoikiasi>();
	//Scanner in=new Scanner(System.in);
	//String answer;


	public void lookup(String theName,String katigoria )
	{
		for (Enoikiasi i  : prosenoik){
			if(i.getTitlos().equals(theName)&& i.getKatigoria()==katigoria)
				{System.out.println(i);}
		}
		
	
	}	

	public Enoikiasi getItem(String theName,String katigoria)
	{
		for (Enoikiasi i  : prosenoik){
			if(i.getTitlos().contains(theName)&& i.getKatigoria()==katigoria)
				{return i;}
		}
	}
