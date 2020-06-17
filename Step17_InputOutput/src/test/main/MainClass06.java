package test.main;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		try {
			bw.write("하나");
			bw.newLine();
			bw.write("하나");
			bw.newLine();
			bw.write("하나");
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
