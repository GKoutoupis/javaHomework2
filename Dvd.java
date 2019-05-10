public class Dvd extends Enoikiasi
{
	private String skinothetis;
	private String senariografos;
	private String ithopoioi;
	private Integer diarkeia;

	public Dvd(String platforma,String etairia,
				String etosparagvghs, String titlos,
				String xronosenoikiasis, Integer temaxia,
				String onomaPelati, Long thlefPelati,
				Integer imeresEnoikiasis, Integer hmeromhniaEnoikiasis,
				double kostosEnoikiasis,double extraDayKostos, String katigoria,
				String skinothetis, String senariografos,
				String ithopoioi, Integer diarkeia)
	{
	
		super(platforma, etairia,
				etosparagvghs, titlos,
				xronosenoikiasis,  temaxia,
				 onomaPelati,  thlefPelati,
				imeresEnoikiasis,  hmeromhniaEnoikiasis,
				 kostosEnoikiasis, extraDayKostos, katigoria);
		
		this.skinothetis=skinothetis;
		this.senariografos=senariografos;
		this.ithopoioi=ithopoioi;
		this.diarkeia=diarkeia;
	}
	public String getSkinothetis()
	{
		return skinothetis;
	}

	public String getSenariografos()
	{
		return senariografos;
	}

	public String getIthopoioi()
	{
		return ithopoioi;
	}

	public Integer getDiarkeia()
	{
		return diarkeia;
	}
	public String toString()
    {
        return super.toString() + "\n Skinotheths: " + getSkinothetis() + "\n Senariografos: " + getSenariografos() + "\n Ithopoioi: " + getIthopoioi() + "\n Diarkeia: " + getDiarkeia();
	} 
	
	
}