import java.util.*;


public class Database
{
	
	public ArrayList <Enoikiasi> prosenoik =new ArrayList <Enoikiasi>();
	public ArrayList <Enoikiasi> noikiasmena=new ArrayList <Enoikiasi>();

	Scanner in=new Scanner(System.in);
	String answer;
	Integer tmp;
	Integer temaxia;

	public void noikiastike(Integer pos)//otan noikiastei kati apo ton katalog o meivnei ta diatheima temaxia kata ena
	{	tmp=prosenoik.get(pos).getTemaxia();
		prosenoik.get(pos).setTemaxia(tmp-1);
	}
	public Integer positionfinder(String theName, String platforma)
	{
		for (Enoikiasi e: prosenoik)
		{
			if (e.getTitlos().equals(theName)) {
				if (e.getPlatforma().equals(platforma)) {
					return prosenoik.indexOf(e);
				}
			}
		
		}
		return -1;
	}
	public boolean booleanfinder(String theName, String platforma)
	{
		for (Enoikiasi e: prosenoik)
		{
			if (e.getTitlos().equals(theName)) {
				if (e.getPlatforma().equals(platforma)) {
					return true;
				}
			}
		
		}
	return false;
	}

}
