package annotation;

public class testAnnotation {
	
		public static void main(String[] args) {
		MaSousClasse td = new MaSousClasse();
		td.maMethode();
		}
		}
		@Deprecated
		class MaSousClasse {
		/**
		* Afficher un message de test
		* @deprecated methode non compatible
		* reason for why it was deprecated
		*/
		@Deprecated
		public void maMethode() {
		System.out.println("test");
		}
		
}
