package newtestproject.newtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

	public Practice1() {
		
	}

	public static void main(String[] args) throws IOException {
	FileWriter fw =new FileWriter("");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("write");
	System.out.println("Writting");
	FileReader fr =new FileReader("");
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(fr);
	int i;
	if((i=br.read())!=-1)
	{
		System.out.println((char)i);
	}
	br.close();
	fr.close();
	
		
	}

}
