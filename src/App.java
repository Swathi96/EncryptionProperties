import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

	  try {
			Properties properties = new Properties();
			Scanner sc=new Scanner(System.in);
			properties.setProperty("dbname", sc.next());
			properties.setProperty("username", sc.next());
			properties.setProperty("password", sc.next());

			File file = new File("C:/Users/Swathi/workspace/PropertyChange/src/Config3.properties");
			FileOutputStream fileOut = new FileOutputStream(file);
			properties.store(fileOut, null);
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
