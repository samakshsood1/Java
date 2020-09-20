package switchCaseStatements;

public class SwitchCase {

	public static void main(String[] args) {
//syntax
		//switch(variable/expression)
		//case value 1:
		//statements
		//break; // break statement is used so that if value 1 is true then next cases arent checked and executed
	
		//case value 2:
		//statements
		//break;
		
		
		//default 
		//statements // if nothing is executed then default will be executed
		
		int dayOfWeek = 4;
		
		switch(dayOfWeek) {
		case 1:
			System.out.println("Im on a holiday");
            break;		
		case 2:	
			System.out.println("im in the office");
			break;//but what if we want that it displays same statement for several days
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("I'm at work!");
					break;
			default:
				System.out.println(" Just chilling");// if we dont use break all statements will be executed.
		}
	}

}
