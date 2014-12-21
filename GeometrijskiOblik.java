public class GeometrijskiOblik {

	protected double povrsina;
	protected double obim;
	
	/**
	 * Getter za površinu
	 * @return povrsina
	 */
	
	public double getPovrsina()
	{
		return povrsina;
	}
	
	/**
	 * Getter za obim
	 * @return obim
	 */
	
	public double getObim()
	{
		return obim;
	}
	
	/**
	 * Metoda vraća string sa svim podacima o objektu
	 */
	
	public String toString()
	{
		return "Povrsina: " + povrsina + "\nObim: " + obim;
	}
}
