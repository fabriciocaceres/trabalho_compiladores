package controleDeArquivos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class CreateFile<T> {
	
	private ObjectOutputStream out;
	
	public void openFile(String arq){
		try{
			out = new ObjectOutputStream(new FileOutputStream(arq));
		}catch(IOException ioException){
			JOptionPane.showMessageDialog(null, "Erro ao abrir");
		}
	}
	
	public void addRecords(T record){
		try{
			out.writeObject(record);

		}catch(IOException e)
		{ e.printStackTrace(); }
	}
	
	public void closeFile(){

			try{
				out.close();
			}catch(IOException e){
				e.printStackTrace();
			}
	}
}
