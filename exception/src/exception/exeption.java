package exception;

	public class exeption {
		
		
		
		public exeption(String message) {
			// TODO Auto-generated constructor stub
		}

		public static void main (String [] args) {
			
			int j = 25 , i = 0;
			try {
				System.out.println(" => " + (1/0));
				}
			catch (ClassCastException e) 
			{
			e.printStackTrace();
			}
			finally {
				System.out.print("action faite systématiquement ");
			}
		
		}
		
		}
		
	
	
