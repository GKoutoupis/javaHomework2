public class Dvd extends Enoikiasi
{
	private String skinothetis;
	private String senariografos;
	private String ithopoioi;
	private Integer diarkeia;

	public Dvd(String katigoria,String etairia,
				String etosparagvghs, String titlos,
				String xronosenoikiasis, Integer temaxia,
				String onomaPelati, Integer thlefPelati,
				Integer imeresEnoikiasis, Integer hmeromhniaEnoikiasis,
				double kostosEnoikiasis,double extraDayKostos,
				String skinothetis, String senariografos,
				String ithopoioi, Integer diarkeia)
	{
	
		super(katigoria, etairia,
				etosparagvghs, titlos,
				xronosenoikiasis,  temaxia,
				 onomaPelati,  thlefPelati,
				imeresEnoikiasis,  hmeromhniaEnoikiasis,
				 kostosEnoikiasis, extraDayKostos);
		
		this.skinothetis=skinothetis;
		this.senariografos=senariografos;
		this.ithopoioi=ithopoioi;
		this.diarkeia=diarkeia;
	}

}