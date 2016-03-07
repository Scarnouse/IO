/**
 * 
 */
package introduccion;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author matinal
 *
 */
public class FiltradoArchivos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/home/matinal/workspace/IO/src/introduccion");
		if (f.isDirectory()){
			String[] lista = f.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith(".java");
				}
			});
			for (String string : lista) {
				System.out.println(string);
			}
		} else {
			System.out.println("No es un directorio");
		}
	}
	
	

}
