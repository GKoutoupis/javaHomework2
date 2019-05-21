import java.io.*;
import java.util.*;

public class ReadITEMFile {
	
	private ArrayList <ITEM> ITEM_LIST = new Arraylist<ITEM>();
	
	public void loadFile(String data){
		
		BufferedReader reader= null;
		ITEM product = null;
		
		try{
			
			reader = new BufferedReader(new FileReader(new File(data)));
			String line = reader.readLine();
			
			while (line!=null){
				StringTokenizer st = new StringTokenizer(line,"#");
				String token = st.nextToken();
				if (token.equals("Game")){
					
					product = new Game();     
					product.setITEM_TYPE(st.nextToken());
					product.settitlos(st.nextToken());
					product.setetairia(st.nextToken());
					product.setkatigoria(st.nextToken());
					product.setplatforma(st.nextToken());
					product.settemaxia(Integer.parseInt(st.nextToken()));
				}
				else if (token.equals("DVD")){
					
					product = new DVD();
					product.setITEM_TYPE(st.nextToken());
					product.setSUB_TYPE(st.nextToken());
					product.settitlos(st.nextToken());
					product.setetosparagvghs(Integer.parseInt(st.nextToken()));
					((DVD) product).setithopoioi(st.nextToken());
					((DVD) product).setskinothetis(st.nextToken());
					product.setkatigoria(st.nextToken());
					product.settemaxia(Integer.parseInt(st.nextToken()));
				}

				StoreProducts.add (product);
				line = reader.readLine();
				
			} 
			
			reader.close();
		} 
		
		catch (IOException e){
			System.err.println("Error Reading File...");
		}
		
	}
	
	public Item get(int i){
		return StoreProducts.get(i);
	}


	public int size()	{
		return StoreProducts.size();
	}
}

public class ReadRENTALFile {
	
	private ArrayList <RENTAL> ITEM_LIST = new Arraylist<RENTAL>();
	
	public void loadFile(String data){
		
		BufferedReader reader= null;
		RENTAL product = null;
		
		try{
			
			reader = new BufferedReader(new FileReader(new File(data)));
			String line = reader.readLine();
			
			while (line!=null){
				StringTokenizer st = new StringTokenizer(line,"#");
				String token = st.nextToken();
				if (token.equals("Game")){
					
					product = new Game();     
					product.setITEM_TYPE(st.nextToken());
					product.settitlos(st.nextToken());
					product.setplatforma(st.nextToken());
					product.setonomaPelati(st.nextToken());
					product.sethmeromhniaEnoikiasis(Integer.parseInt(st.nextToken()));
				}
				else if (token.equals("DVD")){
					
					product = new DVD();
					product.setITEM_TYPE(st.nextToken());
					product.setSUB_TYPE(st.nextToken());
					product.settitlos(st.nextToken());
					product.setonomaPelati(st.nextToken());
					product.sethmeromhniaEnoikiasis(Integer.parseInt(st.nextToken()));	
				}

				StoreProducts.add (product);
				line = reader.readLine();
				
			} 
			
			reader.close();
		} 
		
		catch (IOException e){
			System.err.println("Error Reading File...");
		}
		
	}
	
	public RENTAL get(int i){
		return StoreProducts.get(i);
	}


	public int size()	{
		return StoreProducts.size();
	}
}