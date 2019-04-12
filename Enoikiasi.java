public class Enoikiasi extends Object
{
	private String katigoria;//blue-ray/dvd/xbox/playstation/nintendo
	private String etairia;
	private String etosparagvghs;
	private String titlos;
	private String xronosenoikiasis;
	private Integer temaxia;//posa temaxia exv diathesima pros enoikiasi
	//private Integer a/a;
	private String onomaPelati="";
	private Integer thlefPelati=-1;
	private Integer imeresEnoikiasis=-1;
	private Integer hmeromhniaEnoikiasis=-1;
	private double kostosEnoikiasis=-1.0;
	private double extraDayKostos=-1,0;

	public Enoikiasi (String katigoria,String etairia,
				String etosparagvghs, String titlos,
				String xronosenoikiasis, Integer temaxia,
				String onomaPelati, Integer thlefPelati,
				Integer imeresEnoikiasis, Integer hmeromhniaEnoikiasis,
				double kostosEnoikiasis,double extraDayKostos)
	{
		this.katigoria=katigoria;
		this.etairia=etairia;
		this.etosparagvghs=etosparagvghs;
		this.titlos=titlos;
		this.xronosenoikiasis=xronosenoikiasis;
		this.temaxia=temaxia;
		this.onomaPelati=onomaPelati;
		this.thlefPelati=thlefPelati;
		this.imeresEnoikiasis=imeresEnoikiasis;
		this.hmeromhniaEnoikiasis=hmeromhniaEnoikiasis;
		this.kostosEnoikiasis=kostosEnoikiasis;

	}
	public String getKatigoria()
	{
		return katigoria;
	}
	public String getEtairia()
	{
		return etairia;
	}
	public String getEtosparagvghs()
	{
		return etosparagvghs;
	}
	public String getTitlos()
	{
		return titlos;
	}
	public String getXronosenoikiasis()
	{
		return xronosenoikiasis;
	}
	public Integer getTemaxia()
	{
		return temaxia;
	}
	public void setTemaxia(Integer temaxia)
	{
		this.temaxia=temaxia;
	}
	
}