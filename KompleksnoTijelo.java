public class KompleksnoTijelo extends GeometrijskiOblik{

	private GeometrijskiOblik[] niz;
	private int brojac;
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public KompleksnoTijelo()
	{
		
		this.niz = new GeometrijskiOblik [1]; 
	}
	
	/**
	 * Setter za površinu
	 * @param povrsina
	 */
	
	public void setPovrsina(double povrsina)
	{
		if (povrsina <= 0)
		{
			throw new IllegalArgumentException("Površina ne može biti manja ili jednaka nuli!");
		}
		else
		{
			this.povrsina = povrsina;
		}
	}
	
	/**
	 * Setter za obim
	 * @param obim
	 */
	
	public void setObim(double obim)
	{
		if (obim <= 0)
		{
			throw new IllegalArgumentException("Obim ne može biti manja ili jednaka nuli!");
		}
		else
		{
			this.obim = obim;
		}
	}
	
	/**
	 * Metoda dodaje objekte tipa GeometrijskiOblik u niz i po potrebi 
	 * poziva funkciju koja povećava broj članova niza 
	 * @param oblik
	 */
	
	
	public void dodajOblik(GeometrijskiOblik oblik)
	{
		niz[brojac] = oblik;
		brojac++;
		povecajNiz();
		obim = postaviObim();
		povrsina = postaviPovrsinu();
	}

	/**
	 * Funkcija povećava broj članova niza za jedan
	 */
	
	private void povecajNiz() {
		GeometrijskiOblik[] veciNiz = new GeometrijskiOblik[brojac+1];
		for (int i=0; i<brojac; i++)
		{
			veciNiz[i] = niz[i];
		}
		niz = veciNiz;
	}
	
	/**
	 * Getter za površinu
	 * return povrsina
	 */
	
	public double postaviPovrsinu()
	{
		for (int i=0; i<brojac; i++)
		{
			povrsina += niz[i].getPovrsina();
		}
		return povrsina;
	}

	/**
	 * Getter za obim
	 * return obim
	 */
	
	public double postaviObim()
	{
		for (int i=0; i<brojac; i++)
		{
			obim += niz[i].getObim();
		}
		return obim;
	}
	
	/**
	 * Metoda vraća string sa svim podacima o objektu
	 */
	
	@Override
	public String toString()
	{
		return "Kompleksno Tijelo\nPovršina:  " + povrsina + "\nObim: " + obim; 
	}
	
}
