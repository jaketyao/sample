package demo.util;

import java.util.ArrayList;

public class Plus {
	
	int a,b,c,d,e,f;
	double g,h,i,j,k,l;
	ArrayList<Double> al;
	
	public Plus(int a, int b, int c, int d, int e, int f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public void plusStack(){
		g +=a;
		h +=b;
		i +=c;
		j +=d;
		k +=k;
		l +=l;
	}
	
	public void average(int size){
		al.add(g/size);
		al.add(h/size);
		al.add(i/size);
		al.add(j/size);
		al.add(k/size);
		al.add(l/size);
	}
	
	public ArrayList<Double> getAverage(){
		return al;
	}
	

}
