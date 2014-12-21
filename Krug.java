public class Krug extends GeometrijskiOblik{

	private double pi = Math.PI; 
	private double radius;
	
	/**
	 * Konstruktor sa jednim parametrom
	 * @param radius
	 */
	
	public Krug(double radius)
	{
		setRadius(radius);
		this.povrsina = radius * pi*pi;
		this.obim = 2 * radius * pi; 
	}
	
	/**
	 * Copy konstruktor
	 * @param k
	 */
	
	public Krug(Krug k)
	{
		this.radius = k.radius;
		this.obim = k.obim;
		this.povrsina = k.povrsina;
	}

	/**
	 * Getter za radijus
	 * @return radius
	 */
	
	public double getRadius()
	{
		return radius;
	}
	

	/**
	 * Setter za radijus
	 * @param radius
	 */
	
	public void setRadius(double radius)
	{
		if (radius <= 0)
		{
			throw new IllegalArgumentException("Radijus ne može biti manji ili jednak nuli!");
		}
		else
		{
			this.radius = radius;
		}
			
	}
	
	/**
	 * Metoda provjerava da li su dva objekta jednaka
	 * @param k
	 * @return boolean
	 */
	
	public boolean equals(Krug k)
	{
		if (this.radius == k.radius)
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
		return "Krug: \nObim: " + obim + "\nPovršina: " + povrsina; 
 	}
}
