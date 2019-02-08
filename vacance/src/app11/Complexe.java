package app11;
import app11.Iaffichage;
import app11.IOperation;

	public class Complexe implements IOperation,Iaffichage{
		private double im ;
		private double re;
		public Complexe ( double re , double im){
		this.re=re;
		this.im=im;
		}
		public Object plus(Object c){
		Complexe com = (Complexe) c;
		return new Complexe (this.re + com.re, this.im + com.im);
		}
		 public Object moins (Object c){
		 Complexe com = (Complexe) c;
		return new Complexe (this.re - com.re, this.im - com.im);
		}
		public String affiche() {
		
		if(this.im > 0) 
			
			return this.re +" + "+this.im+" i";
		else if(this.im < 0)
			return this.re +" "+this.im+" i";
		else 
			return this.re+"";
		}
		}