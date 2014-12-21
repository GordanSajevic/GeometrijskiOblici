public class Kvadrat extends GeometrijskiOblik{
	
	private double stranica;
	
	/**
	 * Konstruktor sa jednim parametrom
	 * @param stranica
	 */
	
	public Kvadrat(double stranica)
	{
		setStranica(stranica);
		this.povrsina = stranica * stranica;
		this.obim = 4 * stranica;
	}
	
	/**
	 * Copy konstruktor
	 * @param k
	 */
	
	public Kvadrat(Kvadrat k)
	{
		this.stranica = k.stranica;
		this.obim = k.obim;
		this.povrsina = k.povrsina;
	}
	
	
	/**
	 * Getter za stranicu
	 * @return stranica
	 */
	
	public double getStranica()
	{
		return stranica;
	}
	
	/**
	 * Setter za stranicu
	 * @param stranica
	 */
	
	public void setStranica(double stranica)
	{
		if (stranica <= 0)
		{
			throw new IllegalArgumentException("Stranica ne može biti manja ili jednaka nuli!");
		}
		else
		{
			this.stranica = stranica;
		}
	}
	
	/**
	 * Metoda provjerava da li su dva objekta jednaka
	 * @param k
	 * @return boolean
	 */
	
	public boolean equals(Kvadrat k)
	{
		if (this.stranica == k.stranica)
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Metoda vraća string sa svim podacima o objektu
	 */
	
	@Override
	public String toString()
	{
		return "Kvadrat\nPovršina: " + povrsina + "\nObim: " + obim;
	}
	
	
}
