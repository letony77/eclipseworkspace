package heritagecapsulationpoly;

	public class capital {
		protected String nomville;
		protected String nompays;

 		public capital (String nomville , String nompays)
 		{
 			super();
 			this.nomville = nomville;
 			this.nompays = nompays;
 		}
 		public String objet() {
 			return this.nomville + " est la capital de " + this.nompays;
 		}
	
	}	