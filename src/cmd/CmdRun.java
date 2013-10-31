package cmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cmd="cmd.exe ping ";
		String ipprefix="192.168.10.";
		int begin=101;
		int end=200;
		Process p=null;

		for(int i=begin;i<end;i++){
		     try {
				p= Runtime.getRuntime().exec(cmd+i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     String line = null;
		     BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		     try {
				while((line = reader.readLine()) != null)
				 {
				     //Handling line , may logs it.
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    p.destroy();
		}
	}

}
