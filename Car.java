package udemyPractice;


public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
				if (validModel.equals("Carrera") || validModel.contentEquals("holden")) {
					this.model = model;
				}else {
					
					this.model = "Unkonwn";
				}
		
		this.model = model;
	}
	
	public String getModel(){
		return this.model;
		
		
	}
}