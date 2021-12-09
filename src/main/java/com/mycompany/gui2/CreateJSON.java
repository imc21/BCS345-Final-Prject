package com.mycompany.gui2;


import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class CreateJSON
{
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        //First Coach
        JSONObject coachDetails = new JSONObject();
        coachDetails.put("coach1Name", "");
         
        JSONObject coachObject = new JSONObject(); 
        coachObject.put("ccontact1info", coachDetails);
         
        //Second Coach
        JSONObject coachDetails2 = new JSONObject();
        coachDetails2.put("coach2Name", "");
         
        JSONObject coachObject2 = new JSONObject(); 
        coachObject2.put("ccontact2info", coachDetails2);
         
        //Add coaches to list
        JSONArray coachList = new JSONArray();
        coachList.add(coachObject);
        coachList.add(coachObject2);
         
        //Write JSON file
        try (FileWriter file = new FileWriter("coaches.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(coachList.toJSONString()); 
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}