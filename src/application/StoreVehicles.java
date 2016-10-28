package application;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StoreVehicles  
{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Referred to old assignments and chapter 11 in book for help with this
		ArrayList<Vehicle> carList = new ArrayList<>();
		
		carList.add(new Vehicle("Chevy", "Silverado", 2010, 20000));
		carList.add(new Vehicle("Ford", "F150", 2011, 30000));
		carList.add(new Vehicle("Toyota", "Tundra", 2012, 40000));
		carList.add(new Vehicle("Dodge", "Ram", 2013, 50000));
		carList.add(new Vehicle("Honda", "Ridgeline", 2014, 60000));
		carList.add(new Vehicle("Nissan", "Titan", 2015, 70000));

		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Cars.dat", true));) {

			for(int i = 0; i < carList.size(); i++)
			{
				output.writeObject(carList);
			}
			// This code worked without the close method, but the book says to use it to avoid resource leaks
			output.close();
		}


	}

}
