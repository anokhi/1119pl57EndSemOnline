
public class caltotmarks {

	private int SE;
	private int AI;
	public int getSE() {
		return SE;
	}
	public void setSE(int sE) {
		SE = sE;
	}
	public int getAI() {
		return AI;
	}
	public void setAI(int aI) {
		AI = aI;
	}
	
	
	public int addition(int SE, int AI) {
	 
	    if (SE > 100) {
	      throw new IllegalArgumentException("SE should be less than 101");
	    }
	    if (AI > 100) {
		      throw new IllegalArgumentException("AI should be less than 101");
		    }
	    return SE+AI;
	  }		
}
