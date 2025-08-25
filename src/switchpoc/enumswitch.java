package switchpoc;
public class enumswitch {
	
	public static void main(String[] args) {
		enum direction{ NORTH, SOUTH, EAST, WEST };
		
		direction d = direction.NORTH;
		
		switch(d)
		{
		case NORTH :
			System.out.println("run NORTH");
			break;
		case EAST:
			System.out.println("run EAST");
			break;
		case SOUTH:
			System.out.println("run SOUTH");
			break;
		case WEST:
			System.out.println("run EAST");
		default:
			System.out.println("stay");
		}	
	}
	
}
