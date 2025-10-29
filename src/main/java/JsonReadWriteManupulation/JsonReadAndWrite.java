package JsonReadWriteManupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonReadAndWrite {
    public static void main(String[] args) throws IOException, ParseException {
        String fileLocation = "src/main/resources/Student.json"; //Define File path
//        String name="Student-2";
        String age = "25";      //Age inatialized


        int studentAutoIncrement = 1; //Student number counter
        String prefixName = "Student-"; //Student prefix name
        int generateLastNumber = 0; //Generate last number variable declaration
        String generateStudentName = ""; //generate auto name variable declaration
        JSONArray lastStudentName; //JSON Array declaration


        JSONParser parser = new JSONParser(); //Parse json object
        // Check json Array is null!
        try {
            lastStudentName = (JSONArray) parser.parse(new FileReader(fileLocation));
        } catch (Exception e) {
            lastStudentName = new JSONArray();
        }
        // End Null checking

            //Check Number is not Empty
        if (!lastStudentName.isEmpty()) {
            JSONObject lastStudentObject = (JSONObject) lastStudentName.get(lastStudentName.size() - 1); //last Index get
            String lastStudent = lastStudentObject.get("studentName").toString(); //Student object get
            generateLastNumber = Integer.parseInt(lastStudent.replace(prefixName, "")); //Get last Number

        }

        //Generate student increment Number
        for (int i = 1; i <= studentAutoIncrement; i++) {
            generateStudentName = prefixName + (generateLastNumber + i); //Increment Auto number
            JSONObject lastStudentObject = new JSONObject(); //Declare json object
            //put json Object

            lastStudentObject.put("studentName", generateStudentName);
            lastStudentObject.put("Age", age);
            //Close json Object


            lastStudentName.add(lastStudentObject); //Add json object

        }


        FileWriter writer = new FileWriter(fileLocation); //File Write with the location
        writer.write(lastStudentName.toJSONString()); //Array Write
        writer.flush(); //Save
        writer.close(); //close

//        System.out.println(name);
    }
}
