public class Dado {
    private int facce;
    private int val=0;
	
    public Dado() {
    	this.facce=6;
    }
    public  Dado (int facce) {
      this.facce=facce;	
	}	
	public int lancio() {
		val=(int)(Math.random()*facce)+1;
		return val;
	}
	public int ultimoLancio() {
		return val;
	}
	public int getFacce() {
		return facce;
	}
}
	