public class Pravougaonik extends GeometrijskiOblik{

	private double stranica1;
	private double stranica2;
	
	/**
	 * Konstruktor sa dva parametra
	 * @param stranica1
	 * @param stranica2
	 */
	
	public Pravougaonik(double stranica1, double stranica2)
	{
		setStranica1(stranica1);
		setStranica2(stranica2);
		povrsina = stranica1 * stranica2;
		obim = 2 * stranica1 + 2 * stranica2;
	}
	
	/**
	 * Copy konstruktor
	 * @param p
	 */
	
	public Pravougaonik(Pravougaonik p)
	{
		this.stranica1 = p.stranica1;
		this.stranica2 = p.stranica2;
		this.obim = p.obim;
		this.povrsina = p.povrsina;
	}
	
	/**
	 * Getter za prvu stranicu
	 * @return stranica1
	 */
	
	public double getStranica1()
	{
		return stranica1;
	}
	
	/**
	 * Getter za drugu stranicu
	 * @return stranica2
	 */
	
	public double getStranica2()
	{
		return stranica2;
	}
	
	
	/**
	 * Setter za prvu stranicu
	 * @param stranica
	 */
	
	public void setStranica1(double stranica)
	{
		if (stranica <=0 )
		{
			throw new IllegalArgumentException("Stranica ne može biti manja ili jednaka nuli!");
		}
		else
		{
			this.stranica1 = stranica;
		}
	}
	
	/**
	 * Setter za drugu stranicu
	 * @param stranica
	 */
	
	public void setStranica2(double stranica)
	{
		if (stranica <=0 )
		{
			throw new IllegalArgumentException("Stranica ne može biti manja ili jednaka nuli!");
		}
		else
		{
			this.stranica2 = stranica;
		}
	}
	
	/**
	 * Metoda provjerava da li su dva objekta jednaka
	 * @param p
	 * @return boolean
	 */
	
	public boolean equals(Pravougaonik p)
	{
		if (this.stranica1 == stranica1 && this.stranica2 == stranica2)
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Metoda vraća string sa svim podacima o objektu
	 */
	
	public String toString()
	{
		return "Pravougaonik\nPovršina: " + povrsina + "\nObim: " + obim;
	}
}
