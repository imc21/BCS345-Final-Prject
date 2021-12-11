package com.mycompany.gui2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
/*
* The students class will get the data of the students using jsonParser 
* to read the files. The Try catch method is used for filenotfound exception.
* @author Amoon, Caleb, Matt, Brett
* @version 12.4
* @since 2021
*/

       
public class Students
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ParseException 
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("students.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray studentList = (JSONArray) obj;
            System.out.println(studentList);
             
            //Iterate over student array
            studentList.forEach( emp -> parseStudentObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parseStudentObject(JSONObject jsonObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
