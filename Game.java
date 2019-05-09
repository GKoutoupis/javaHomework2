public class Game extends Enoikiasi
{
	public Game(String platforma,String etairia,
				String etosparagvghs, String titlos,
				String xronosenoikiasis, Integer temaxia,
				String onomaPelati, Integer thlefPelati,
				Integer imeresEnoikiasis, Integer hmeromhniaEnoikiasis,
				double kostosEnoikiasis, double extraDayKostos, String katigoria)
	{


		super(platforma, etairia,
				etosparagvghs, titlos,
				xronosenoikiasis,  temaxia,
				 onomaPelati,  thlefPelati,
				imeresEnoikiasis,  hmeromhniaEnoikiasis,
				 kostosEnoikiasis, extraDayKostos, katigoria);

	}
	public String toString()
    {
		return "\n Onoma Paixnidiou: " + getTitlos() + "\n Platforma: " + getPlatforma() + "\n Katigories: " + getKatigoria()+ "\n Etos Paragvghs: " + getEtosparagvghs() + "\n Etairia Paragvghs: " + getEtairia() + "\n Xronos Enoikiasis: " + getXronosenoikiasis() + "\n Diathesima Temaxia: " + getTemaxia();   
	} 
}