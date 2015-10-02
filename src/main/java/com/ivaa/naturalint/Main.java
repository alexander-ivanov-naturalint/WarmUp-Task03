package com.ivaa.naturalint;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by ivaa on 10/2/2015.
 */
public class Main {
    public static void main(String[] args)
    {
        String fileName = "file.txt";

        //create new Person
        Person person = new Person("James", "Hetfield", "papahet@damage.inc", 52);

        //serialize person
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);

        //write serialized data to file
        PrintWriter writer = null;
        try
        {
            writer = new PrintWriter(fileName);
            writer.print(json);
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (writer != null)
                writer.close();
            else
            {
                System.out.println("Could not write file.");
                System.exit(0);
            }
        }

        //read from file and deserialize person
        FileReader reader = null;
        try
        {
            reader = new FileReader(fileName);
            Person newPerson = new Gson().fromJson(reader, Person.class);

            System.out.println(newPerson.getFirstName());
            System.out.println(newPerson.getLastName());
            System.out.println(newPerson.getEmail());
            System.out.println(newPerson.getAge());
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }


    }
}
