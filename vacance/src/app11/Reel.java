package app11;

import app11.Iaffichage;
import app11.IOperation;
		public class Reel implements IOperation,Iaffichage{
			private double x;
				public Reel(double x){
					this.x=x;
}
				public Object moins(Object obj) {
					Reel reel = (Reel) obj;
					return new Reel(this.x - reel.x);
}
				public Object plus(Object obj) {
					Reel reel = (Reel) obj;
					return new Reel(this.x - reel.x);
}
				public double plus(double ... x) {
					double som = this.x;
					for(Double d : x)
						som += d;
					return som;
}
				public double moins(double ... x) {
					double s = this.x;
					for(Double d : x)
						s -= d;
					return s;
}
				public String affiche() {
					return (x+"");
}
}