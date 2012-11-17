package app.android.old;
import java.io.IOException;
import java.util.ArrayList;

public class Run {
	
	public static void main(String[] args) {
		
		ArrayList<GeoLocation> lista = new ArrayList<GeoLocation>();
		
		Ficheiro file;
		
		try {
			file = new Ficheiro();
			file.abreLeitura();
			lista = file.lerObjectoArray();
			
		}catch (IOException e){
			e.printStackTrace();
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		System.out.println("> Lista:");
		for(int i=0; i<lista.size(); i++){
			GeoLocation lido = lista.get(i);
			System.out.println("-"+lido.printGeoLocation());
			
			//......
		}
		
		
		
	}
}
