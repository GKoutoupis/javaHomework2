import java.io.*;
import java.util.*;

public class ReadITEMFile {
	
	private ArrayList <Enoikiasi> ITEM_LIST = new Arraylist<Enoikiasi>();
	
	public void loadFile(String data){
		
		BufferedReader reader= null;
		Enoikiasi product = null;
		
		try{
			
			reader = new BufferedReader(new FileReader(new File(data)));
			String line = reader.readLine();
			
			while (line!=null){
				StringTokenizer st = new StringTokenizer(line,"#");
				String token = st.nextToken();
				if (token.equals("Game")){
					
					product = new Game();     
					product.settitlos(st.nextToken());
					product.setetairia(st.nextToken());
					product.setkatigoria(st.nextToken());
					product.setplatforma(st.nextToken());
					product.settemaxia(Integer.parseInt(st.nextToken()));
				}
				else if (token.equals("DVD")){
					
					product = new DVD();
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
	
	public Enoikiasi get(int i){
		return StoreProducts.get(i);
	}


	public int size()	{
		return StoreProducts.size();
	}
}

public class ReadRENTALFile {
	
	private ArrayList <Enoikiasi> RENTAL_LIST = new Arraylist<Enoikiasi>();
	
	public void loadFile(String data){
		
		BufferedReader reader= null;
		Enoikiasi product = null;
		
		try{
			
			reader = new BufferedReader(new FileReader(new File(data)));
			String line = reader.readLine();
			
			while (line!=null){
				StringTokenizer st = new StringTokenizer(line,"#");
				String token = st.nextToken();
				if (token.equals("Game")){
					
					product = new Game();     
					product.setTitlos(st.nextToken());
					product.setPlatforma(st.nextToken());
					product.setOnomaPelati(st.nextToken());
					product.setHmeromhniaEnoikiasis(Integer.parseInt(st.nextToken()));
				}
				else if (token.equals("DVD")){
					
					product = new DVD();
					product.setPlatforma(st.nextToken());
					product.setTitlos(st.nextToken());
					product.setOnomaPelati(st.nextToken());
					product.setHmeromhniaEnoikiasis(Integer.parseInt(st.nextToken()));	
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
	
	public Enoikiasi get(int i){
		return StoreProducts.get(i);
	}


	public int size()	{
		return StoreProducts.size();
	}
}
