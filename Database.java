import java.util.*;


public class Database
{
	Integer tmp;
	Integer temaxia;
	private ArrayList<Enoikiasi> prosenoik =new ArrayList<Enoikiasi>();
	private ArrayList<Enoikiasi> noikiasmena=new ArrayList<Enoikiasi>();
	Scanner in=new Scanner(System.in);
	String answer;

	/*public void lookup(String theName,String katigoria )
	{
		for (Enoikiasi i  : prosenoik){
			if(i.getTitlos().equals(theName)& i.getKatigoria()==katigoria)
				{System.out.println(i);}
		}
		
	
	}	

	public Enoikiasi getItem(String theName,String katigoria)
	{
		for (Enoikiasi i  : prosenoik){
			if(i.getTitlos().contains(theName)& i.getKatigoria()==katigoria)
				{return i;}
		}
		return null;
	}*/
	public void noikiastike(String theName,String katigoria)//otan noikiastei kati apo ton katalogo meivnei ta diatheima temaxia kata ena
	{
		tmp=prosenoik.indexOf(theName);
		temaxia=prosenoik.get(tmp).getTemaxia();
		prosenoik.get(tmp).setTemaxia(temaxia-1);
	}
	public boolean yparxei(String theName,String katigoria)
	{
		if (prosenoik.get(theName).getKatigoria().equals(katigoria))
		{
			return true;
		}
		return false;
	}
	public boolean exeitemaxia(theName)
	{
		if(prosenoik.get(theName).getTemaxia()>0)
		{
			return true;
		}
		return false;
	}
	public Integer objfinder(String theName, String katigoria)
	{
		if yparxei(theName, katigoria)
		{ 
			tmp=index
		}
	}
