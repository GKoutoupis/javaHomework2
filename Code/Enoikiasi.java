public class Enoikiasi
{
	private String platforma;//blue-ray/dvd/xbox/playstation/nintendo
	private String etairia;
	private String etosparagvghs;
	private String titlos;
	private Integer xronosenoikiasis;
	private Integer temaxia;//posa temaxia exv diathesima pros enoikiasi
	private Integer diarkeia;
	private String onomaPelati="";
	private Long thlefPelati=-1L;
	private Integer imeresEnoikiasis=-1;
	private Integer hmeromhniaEnoikiasis=-1;
	private double kostosEnoikiasis=-1.0;
	private double extraDayKostos=-1.0;
	private String katigoria;
	private Double telikoKostos;

	public Enoikiasi (String platforma,String etairia,
				String etosparagvghs, String titlos,
				Integer xronosenoikiasis, Integer temaxia,
				String onomaPelati, Long thlefPelati,
				Integer imeresEnoikiasis, Integer hmeromhniaEnoikiasis,
				double kostosEnoikiasis, double extraDayKostos, String katigoria, Double telikoKostos)
	{
		this.platforma=platforma;
		this.etairia=etairia;
		this.etosparagvghs=etosparagvghs;
		this.titlos=titlos;
		this.xronosenoikiasis=xronosenoikiasis;//ana vdomada h ana hmera
		this.temaxia=temaxia;
		this.onomaPelati=onomaPelati;
		this.thlefPelati=thlefPelati;
		this.imeresEnoikiasis=imeresEnoikiasis;// poses meres tha to noikiasoume
		this.hmeromhniaEnoikiasis=hmeromhniaEnoikiasis;// pote to noikiasame
		this.kostosEnoikiasis=kostosEnoikiasis;
		this.extraDayKostos=extraDayKostos;
		this.katigoria=katigoria;
		this.telikoKostos=telikoKostos;

	}
	public void setTemaxia(Integer temaxia)
	{
		this.temaxia=temaxia;
	}
	public void setOnomaPelati(String onomaPelati)
	{
		this.onomaPelati=onomaPelati;
	}
	public void setThlefPelati(Long thlefPelati)
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
	public void setTelikoKostos (double telikoKostos)
	{
		this.telikoKostos=telikoKostos;
	}
	public void setXronosEnoikiasis (Integer xronosenoikiasis)
	{
		this.xronosenoikiasis=xronosenoikiasis;
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
	public Integer getXronosenoikiasis()
	{
		return xronosenoikiasis;
	}
	public Integer getTemaxia()
	{
		return temaxia;
	}

	public String getOnomaPelati()
	{
		return onomaPelati;
	}

	public Long getThlefPelati()
	{
		return thlefPelati;
	}

	public Integer getImeresEnoikiasis()
	{
		return imeresEnoikiasis;
	}

	public Integer getHmeromhniaEnoikiasis()
	{
		return hmeromhniaEnoikiasis;
	}

	public Double getKostosEnoikiasis()
	{
		return kostosEnoikiasis;
	}

	public Double getExtraDayKostos()
	{
		return extraDayKostos;
	}
	public Double getTelikoKostos()
	{
		return telikoKostos;
	}
	public String getEtosParagvghs()
	{
		return etosparagvghs;
	}

	public String toString()
    {
        return "---------------------------------------- \n Onoma : " + getTitlos() + "\n Platforma: " + getPlatforma() + "\n Katigories: " + getKatigoria()+ "\n Etos Paragvghs: " + getEtosparagvghs() + "\n Etairia Paragvghs: " + getEtairia() + "\n Xronos Enoikiasis: " + getXronosenoikiasis() + "\n Diathesima Temaxia: " + getTemaxia();
	} 
	public String toString2()
	{
		return this.toString() + "\n Onoma Pelath: " + getOnomaPelati() + "\n Thlefwno Pelath:  " + getThlefPelati() + "\n Imeres Enoikiasis: " + getImeresEnoikiasis() + "\n Hmerominia Enoikiasis: " + getHmeromhniaEnoikiasis() + "\n Kostos Enoikiasis: " + getKostosEnoikiasis() + "\n Extra Day Kostos: " + getExtraDayKostos() + "\n Teliko Kostos: " + getTelikoKostos();
	}
} 