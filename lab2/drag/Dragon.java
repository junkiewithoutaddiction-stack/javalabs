package drag;

public class Dragon{
	private String name;
	private boolean spewFire;
	private boolean growls;
	private boolean haveEggs;
	private int height;
	private int numberOfEggs;
	public Dragon(String name, int height, int numberOfEggs){
		this.name = name;
		spewFire = true;
		growls = true;
		this.height = height;
		this.numberOfEggs = numberOfEggs;
		if (numberOfEggs > 0) {
			haveEggs = true;}
		else {
			haveEggs = false;}
	}
	public void getinfo(){
		System.out.println("Name: "+ name);
		System.out.println("SpewFire: "+ spewFire);
		System.out.println("Growls: "+ growls);
		System.out.println("HaveEggs: "+ haveEggs);
		System.out.println("Height: "+ height + " meters");
		System.out.println("NumberOfEggs: "+ numberOfEggs + " eggs");
	}
}

		

