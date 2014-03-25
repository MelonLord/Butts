public class Obj{ // MAKE AS ABSTRACT CLASS, EVERYTHING EXTENDS THIS
	protected String name;
	protected String examine;
	// Possibly have a list of extra names, not nessasary right now
	protected boolean addtoinv;
	protected boolean interactwith;
	
	public Obj(){
		name = "generic green cube";
		examine = "Wow, you couldn't imagine a cube more green or generic than this very cube in front of you. It may be the singularity for everything that is both generic and green.";
		addtoinv = false;
		interactwith = true;
	}
	
	public String getName()
		return name;
		
	public String getEx()
		return examine;
		
	public boolean getInv()
		return addtoinv;
		
	public boolean getInter()
		return interactwith;
		
	public void setName(String nm)
		name = nm;
		
	public void setEx(String ex)
		examine = ex;
		
	public void setAdd(boolean yes)
		addtoinv = yes;
		
	public void setInter(boolean yes)
		interactwith = yes;	