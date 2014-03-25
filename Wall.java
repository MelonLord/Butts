public class Wall{ // Basic wall, if it is a special event wall extend it/extra interactions
	// NOTE EDIT TO HAVE IT EXTEND OBJ ONCE OBJECT IS CREATED
	protected String starttext; // What will be disp if you face the wall
	protected String name; // Simpler name for use
	protected String examine; // What will be disp if you examine wall + the obj list
	protected // Object list to be added, all objs at current wall
	protected // Exit Object, can be null, what scene you will be linked to via that wall
	protected String verb;// Verb, what will all walls do if [verb]
	protected int direction; // 1-4, 1=north, 2=east, 3=south, 4=west ((Possibility of NE,SE,SW,NW,ect?)
	
	public Wall(){
		starttext = "";
		name = "";
		examine = "";
		verb = "";
		//object = null;
		//exitobj = null;
	}
	
	public Wall(wall loc/file, List<Obj>){// Start,nam,and ex can be from a txt file, verb is inputed by user
		// get starttext, name, and examine from the file location, parse into strings
	}
	
	public void setName(String nme)
		name = nme;
		
	public void setText(String st)
		starttext = st;
		
	public void setExam(String ex)
		examine = ex;
	
	public void doesThing(String veb)
		verb = veb;
		
	public String getName()
		return name;
		
	public String getText()
		return starttext;
		
	public String getExam()
		return examine;
	
	public String whatThing()
		return verb;
	
	public List<Obj> getRoom()
		return object;

	public void addExit(Exit a)
		exitobj = a;
		
	public void setDirection(int di)
		direction = di;

