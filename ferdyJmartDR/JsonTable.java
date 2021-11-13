package ferdyJmartDR;

/**
 * Write a description of class Jmart here.
 *
 * @Mochamad Ferdy Fauzan
 * @13-11-2021
 */

import java.util.Vector;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Collections;

public class JsonTable<T> extends Vector<T>{
	public final String filepath;
	private final static Gson gson = new Gson();
	
	public JsonTable(Class<T> clazz, String filepath) throws IOException{
		this.filepath = filepath;
		try {
            Class<T[]> arrayType = (Class<T[]>) Array.newInstance(clazz, 0).getClass();
            T[] res = readJson(arrayType, filepath);
            if(res != null) {
                Collections.addAll(this, res);
            }
        } catch (FileNotFoundException e) {
            File file = new File(filepath);
            File f = file.getParentFile();
            if(f != null) {
                file.mkdir();
            }
            file.createNewFile();
        }
	}
	
	public static <T> T readJson(Class<T> clazz, String filepath) throws FileNotFoundException {
        Reader reader = new FileReader(filepath);
        return gson.fromJson(reader, clazz);
    }

    public void writeJson() throws IOException {
        writeJson(this, this.filepath);
    }

    public static void writeJson(Object object, String filepath) throws IOException {
        FileWriter writer = new FileWriter(filepath);
        writer.write(gson.toJson(object));
        writer.close();
    }
}
