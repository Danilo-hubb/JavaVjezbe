package zadatak1;

public class EProizvod {

	    protected String opis;
	    protected String sifra;
	    protected double uvoznaCijena;
	    
		public EProizvod(String opis, String sifra, double uvoznaCijena) {
			super();
			this.opis = opis;
			this.sifra = sifra;
			this.uvoznaCijena = uvoznaCijena;
		}
	
	    public double maloprodajnaCijena() {
	    	return uvoznaCijena * 1.05;
	    	
   }
	    
	   
	    @Override
		public String toString() {
			return "EProizvod [opis=" + opis + ", sifra=" + sifra + ", uvoznaCijena=" + uvoznaCijena + "]";
		}
	    
	    public String getSifra() {
	    	return sifra;
	    }
	    
}
