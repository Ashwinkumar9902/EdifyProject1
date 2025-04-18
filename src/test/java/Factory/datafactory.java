package Factory;

import org.testng.annotations.Factory;

public class datafactory {
	
	@Factory
	public Object[] createInstances() {
		return new Object[] {
				    new Lead("admin@yopmail.com","123456","sagar","sagar@gmail.com","9938274862"),
				    
			        new Lead("admin@yopmail.com","123456","akash","akash@gmail.com","9987263478"),
			        new Lead("admin@yopmail.com","123456","sandip","sandip@gmail.com","9973264872"),   
		};
		
		
		
	}
		
	

}
