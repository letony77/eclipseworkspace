public class Animal {
        // propriété de la classe
        private static int totalAnimal = 0;
        // propriétés de l'objet
        protected String nom;
        private int nombreDePatte;
        // constructeur
        public Animal(String nom, int nombreDePatte) {
                super(); // appel du constructeur parent
                this.nom = nom;
                this.nombreDePatte = nombreDePatte;
                totalAnimal++;
        }
        // une methode de l'objet
        private String formulerMonNom() {
                return "Je m'appelle " + this.nom; // appel de la propriété nom
        }
        // une methode de l'objet
        public void parler() {
                System.out.println(this.formulerMonNom()); // appel d'une méthode de l'objet
                System.out.println("Je suis un animal et j'ai " + this.nombreDePatte + " pattes");
        }
        // une methode de la classe
        public static void afficherNombreDAnimaux() {
                System.out.println("**************************");
                System.out.println("Il y a " + totalAnimal + " animaux");
}} 