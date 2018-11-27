
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class MonApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaFenetre f = new MaFenetre();
		f.afficher();
		f.afficher("Hello la promo Simplon! ");
		}
		}
class MaFenetre {
			JFrame mainFrame = null;
		public MaFenetre() {
			mainFrame = new JFrame();
			mainFrame.setTitle("Mon Application");
			mainFrame.addWindowListener(new WindowAdapter() {
				
				class MonAutreClasse {
					public void afficher(String message) {
						System.out.println(message);
						}
						}
				public void windowClosing(WindowEvent ev) {
					System.exit(0);
				}
				});
			mainFrame.setSize(320, 240);
			}
		public void afficher () {
			mainFrame.setVisible(true);
			JLabel label = new JLabel ("Bienvenue dans ma premiere application");
			
			mainFrame.add(label);
		}
		public void afficher (String message) {
			System.out.println(message);
		}
}