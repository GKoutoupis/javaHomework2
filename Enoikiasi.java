public class Enoikiasi
{
	private String platforma;//blue-ray/dvd/xbox/playstation/nintendo
	private String etairia;
	private String etosparagvghs;
	private String titlos;
	private String xronosenoikiasis;
	private Integer temaxia;//posa temaxia exv diathesima pros enoikiasi
	private Integer diarkeia;
	private String onomaPelati="";
	private Integer thlefPelati=-1;
	private Integer imeresEnoikiasis=-1;
	private Integer hmeromhniaEnoikiasis=-1;
	private double kostosEnoikiasis=-1.0;
	private double extraDayKostos=-1.0;
	private String katigoria;

	public Enoikiasi (String platforma,String etairia,
				String etosparagvghs, String titlos,
				String xronosenoikiasis, Integer temaxia,
				String onomaPelati, Integer thlefPelati,
				Integer imeresEnoikiasis, Integer hmeromhniaEnoikiasis,
				double kostosEnoikiasis, double extraDayKostos, String katigoria)
	{
		this.platforma=platforma;
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
		this.extraDayKostos=extraDayKostos;
		this.katigoria=katigoria;

	}
	public void setTemaxia(Integer temaxia)
	{
		this.temaxia=temaxia;
	}
	public void setOnomaPelati(String onomaPelati)
	{
		this.onomaPelati=onomaPelati;
	}
	public void setThlefPelati(Integer thlefPelati)
	{
		this.thlefPelati=thlefPelati;
	}
	public void setImeresEnoikiasis( Integer imeresEnoikiasis)
	{
		this.imeresEnoikiasis=imeresEnoikiasis;
	}
	public void setHmeromhniaEnoikiasis(Integer hmeromhniaEnoikiasis)
	{
		this.hmeromhniaEnoikiasis=hmeromhniaEnoikiasis;
	}
	public void setKostosEnoikiasis(double kostosEnoikiasis)
	{
		this.kostosEnoikiasis=kostosEnoikiasis;
	}
	public void setExtraDayKostos(double extraDayKostos)
	{
		this.extraDayKostos=extraDayKostos;
	}
	public String getPlatforma()
	{
		return platforma;
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
	
}