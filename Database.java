import java.util.*;


public class Database
{
	
	public ArrayList <Enoikiasi> prosenoik =new ArrayList <Enoikiasi>();
	public ArrayList <Enoikiasi> noikiasmena=new ArrayList <Enoikiasi>();

	Scanner in=new Scanner(System.in);
	String answer;
	Integer tmp;
	Integer temaxia;

	public void noikiastike(Integer pos)//otan noikiastei kati apo ton katalogo meivnei ta diatheima temaxia kata ena
	{	tmp=prosenoik.get(pos).getTemaxia();
		prosenoik.get(pos).setTemaxia(tmp-1);
	}
	public Integer positionfinder(String theName, String katigoria)
	{
		for (Enoikiasi e: prosenoik)
		{
			if (e.getTitlos().equals(theName)) {
				if (e.getKatigoria().equals(katigoria)) {
					return prosenoik.indexOf(e);
				}
			}
		
		}
		return -1;
	}
	public boolean booleanfinder(String theName, String katigoria)
	{
		for (Enoikiasi e: prosenoik)
		{
			if (e.getTitlos().equals(theName)) {
				if (e.getKatigoria().equals(katigoria)) {
					return true;
				}
			}
		
		}
	return false;
	}

}
