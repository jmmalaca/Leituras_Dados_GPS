package app.android.old;
import java.io.Serializable;

public class GeoLocation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double Longitude;
	private double Latitude;
	private String nome;
	private String data;
	
	GeoLocation(double a, double b, String c, String d){
		
		Longitude = a;
		Latitude = b;	
		nome = c;
		data = d;
	}
	
	public double getLong(){
		return Longitude;
	}
	
	public double getLati(){
		return Latitude;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getData(){
		return data;
	}
	
	public String printGeoLocation(){
		return " @data: "+data+", Local: "+nome+", Longi: "+Longitude+", Lati: "+Latitude;
	}
}
