package app.android.old;


import java.util.ArrayList;
import java.io.IOException;

public class EscritasDados {
	
	public static void guardarPosicoes(ArrayList<GeoLocation> Posicoes) throws IOException{
    	
		Ficheiro FILE=new Ficheiro();
		FILE.abreEscrita();		
		try{
			FILE.escreveObjectoArray(Posicoes);
			System.out.println("SYSTEM: lista de posicoes guardada no ficheiro.");
			
		}catch (Exception e){
			System.out.println("ERROR(guardarPosicoesFicheiro):"+e.getMessage());
		}
		FILE.fecharEscrita();
    }
	
	public static ArrayList<GeoLocation> lerPosicoes(ArrayList<GeoLocation> Posicoes) throws IOException{
		
		Ficheiro FILE=new Ficheiro();
		FILE.abreLeitura();
		try{
			Posicoes=FILE.lerObjectoArray();
		}catch (Exception e){
			System.out.println(e);
		}
		FILE.fecharLeitura();
		
		return Posicoes;
	}
}
