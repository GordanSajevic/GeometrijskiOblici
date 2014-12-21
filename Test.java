public class Test {

	public static void main(String[] args) {
		//Vagon
		KompleksnoTijelo vagon = new KompleksnoTijelo();
		vagon.dodajOblik(new Krug(10));
		vagon.dodajOblik(new Krug(10));
		vagon.dodajOblik(new Pravougaonik(100, 60));
		System.out.println("Vagon: \n" + vagon.toString());
		//Putnički vagon
		KompleksnoTijelo putnicki = new KompleksnoTijelo();
		putnicki.dodajOblik(new Krug(10));
		putnicki.dodajOblik(new Krug(10));
		putnicki.dodajOblik(new Pravougaonik(100, 60));
		putnicki.dodajOblik(new Kvadrat(15));
		putnicki.setPovrsina(putnicki.getPovrsina() - 15*15);
		putnicki.dodajOblik(new Kvadrat(15));
		putnicki.setPovrsina(putnicki.getPovrsina() - 15*15);
		System.out.println("Putnički vagon: \n" + putnicki.toString());
		//Lokomotiva
		KompleksnoTijelo lokomotiva = new KompleksnoTijelo();
		lokomotiva.dodajOblik(new Kvadrat(50));
		lokomotiva.dodajOblik(new Kvadrat(15));
		lokomotiva.dodajOblik(new Pravougaonik(120, 40));
		lokomotiva.dodajOblik(new Krug(10));
		lokomotiva.dodajOblik(new Krug(10));
		System.out.println("Lokomotiva: \n" + lokomotiva.toString());
		//Voz
		KompleksnoTijelo voz = new KompleksnoTijelo();
		voz.dodajOblik(lokomotiva);
		voz.dodajOblik(putnicki);
		voz.dodajOblik(vagon);

		System.out.println(voz.toString());
	}

}
