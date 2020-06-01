package test.main;

import test.mypac.Call;
import test.mypac.Phone;
import test.mypac.Photo;

public class MainClass05 {
	public static void main(String[] args) {
		Phone phon1=new Phone();
		phon1.getInfo("iphone", "black", 100000);
		phon1.callPhone(new Call());	
		phon1.Poto(new Photo());
		
	}
}
