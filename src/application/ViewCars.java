package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ViewCars  {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("Cars.dat"));)
		{
			
			ArrayList<Vehicle> carList = (ArrayList<Vehicle>)input.readObject();
			
			for(int i = 0; i < carList.size(); i++){
				System.out.println(carList.get(i).VehicleToString());
			}
					
		}
		
	}
}
