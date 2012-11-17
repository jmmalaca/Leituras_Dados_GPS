package app.android.old;
import java.io.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Ficheiro implements Serializable{
	
	/**
	 * class para ficheiros de dados
	 */
	
	private FileInputStream InStream;
	private FileOutputStream OutStream;
	private ObjectInputStream ObjIn; 
	private ObjectOutputStream ObjOut;
	private String nomeFicheiro="GeoLocation.dat";
	
	Ficheiro() throws IOException{
		File FILE = new File(nomeFicheiro);
		if (FILE.exists()) {
			System.out.print("\nFicheiro existe");
		}else{
			System.out.print("\nFicheiro nao existe");
			try{
				FILE.createNewFile();
			}
			catch (Exception e){
			  System.out.println(e);
			}
		}
		System.out.println("\nPath do ficheiro: "+FILE.getCanonicalPath());
	}
	
	//abrir o ficheiro para leitura
	public void abreLeitura() throws IOException {
		InStream = new FileInputStream(new File(nomeFicheiro));
		ObjIn = new ObjectInputStream(InStream);
	}
	
	//abrir o ficheiro para escrita
	public void abreEscrita() throws IOException{
		OutStream = new FileOutputStream(new File(nomeFicheiro));
		ObjOut = new ObjectOutputStream(OutStream);
	}
	
	//Devolve o objecto
	@SuppressWarnings("unchecked")
	public ArrayList<GeoLocation> lerObjectoArray() throws IOException, ClassNotFoundException{
		return ((ArrayList<GeoLocation>)ObjIn.readObject());
	}
	
	//Recebe o objecto a escrever
	public void escreveObjectoArray(ArrayList<GeoLocation> o) throws IOException{
		ObjOut.writeObject(o);
	}
	
	//fechar o ficheiro aberto em modo leitura
	public void fecharLeitura() throws IOException{
		ObjIn.close();
	}
	
	//fechar o ficheiro aberto em modo escrita
	public void fecharEscrita() throws IOException{
		ObjOut.close();
	}
}
