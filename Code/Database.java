import java.util.*;


public class Database
{
	
	public ArrayList <Enoikiasi> prosenoik =new ArrayList <Enoikiasi>();
	public ArrayList <Enoikiasi> noikiasmena=new ArrayList <Enoikiasi>();

	Scanner in=new Scanner(System.in);
	String answer;
	Integer tmp;
	Integer temaxia;

	public void noikiastike(Integer pos)//otan noikiastei kati apo ton katalogo meivnei ta diathesima temaxia kata ena
	{	tmp=prosenoik.get(pos).getTemaxia();
		prosenoik.get(pos).setTemaxia(tmp-1);
	}
	public void xenoikiastike(Integer pos)
	{
		tmp=prosenoik.get(pos).getTemaxia();
		System.out.println("tmp="+ tmp);
		prosenoik.get(pos).setTemaxia(tmp+1);
		// !!!edv einai to provlima an etrexe svsta tha eprepe na perasei deka temaxia sta pros enoikiasi alla den dinei tipota!
	}
	//vriskei se poia thesi sti lista vrisketai ena antikeimeno
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
	public void ShowAllProsEnoik()
	{	
		System.out.println("katalogos pros enoikiasi");
		for (Enoikiasi obj:prosenoik ) {
         System.out.println(obj);
      }
	}
	public void ShowAllNoikiasmena()
	{
		System.out.println("katalogos me ta noikiasmena");
		for (Enoikiasi obj:noikiasmena ) {
			System.out.println(obj.toString2());
			
		}
	}
	public void ShowAll(){
		ShowAllProsEnoik();
		ShowAllNoikiasmena();
	}

}
