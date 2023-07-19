package abstraction;

public class Table1 implements Furniture1 {

	@Override
	public void printMaterial(String material) {
		System.out.println("THE MATERIAL IS "+material);
		
	}

	@Override
	public String durability(String material) {
		if(material.equalsIgnoreCase("Wood")) {
			return "HIGH DURABLE";
		}
		else {
			return "AVERAGE DURABLE";
		}
	}
	

}
