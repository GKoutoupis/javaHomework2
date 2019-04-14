public class Dvd extends Item 
{
	private String skinothetis;
	private String senariografos;
	private String ithopoioi;
	private String diarkeia;

	public Dvd(String katigoria,String etairia,
				String etosparagvghs, String titlos,
				String xronosenoikiasis,Integer temaxia,
				String skinothetis, String senariografos,
				String ithopoioi, String diarkeia)
	{
		super ( katigoria, etairia,
				 etosparagvghs,  titlos,xronosenoikiasis,temaxia);
		this.skinothetis=skinothetis;
		this.senariografos=senariografos;
		this.ithopoioi=ithopoioi;
		this.diarkeia=diarkeia;
	}
}