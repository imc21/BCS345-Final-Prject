package com.mycompany.gui2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class Coaches 
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ParseException 
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("coaches.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray coachList = (JSONArray) obj;
            System.out.println(coachList);
             
            //Iterate over employee array
            coachList.forEach( emp -> parseCoachesObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parseCoachesObject(JSONObject jsonObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
