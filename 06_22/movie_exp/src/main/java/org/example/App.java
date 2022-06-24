package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();

        ArrayList<Movie> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();
            System.out.println(type);

            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Sai đường dẫn file");
        }
        for(Movie p : list){
           System.out.println(p.getId() + " - " + p.getTitle() +
                  " - " + p.getDescription()+ " - " + p.getCategory() + " - " + p.getDirector() +
                   " - " + p.getRelease_year());
        }

    }
}
