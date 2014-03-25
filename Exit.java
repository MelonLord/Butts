public class Exit extends Obj{ // Basic Exit obj, links 2 scenes together, has moveto to go between scenes
	// NOTE NOTE HAVE EXIT EXTEND OBJECT, SINCE IT WILL BEHAVE LIKE AN OBJECT (ADD OBJ METHODS)
	protected Scene1// Scene object
	protected Scene2// Scene object
	protected currentScene // Main scene
	protected String name; // Extra fun??
	
	public Exit(){
		currentScene = null;
		Scene1 = null;
		Scene2 = null;
		name = "";
	}
	
	public Exit(sc1, sc2){
		Scene1 = sc1;
		Scene2 = sc2;
	}
	
	public void setCurrent(sc1)
		currentScene = sc1;
		
	public void setSc1(sc1)
		Scene1 = sc1;
	
	public void setSc2(sc1)
		Scene2 = sc1;
			
	public Scene getCurrent()
		return currentScene;
	
	public void useExit(){
		if (currentScene == Scene1)
			currentScene = Scene2;
		else
			currentScene = Scene1;
	}