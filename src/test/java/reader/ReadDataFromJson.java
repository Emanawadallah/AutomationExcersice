package reader;

import com.google.gson.Gson;
import data.DataModel;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadDataFromJson {

    //create data model
    public DataModel readJsonFile() throws FileNotFoundException {
        FileReader fileReader=new FileReader("data/testData.json");
       return new Gson().fromJson(fileReader, DataModel.class);
    }

    //read data model
    public static DataModel dataModel() throws FileNotFoundException {
        ReadDataFromJson readDataFromJson=new ReadDataFromJson();
        return new ReadDataFromJson().readJsonFile();
    }
}
