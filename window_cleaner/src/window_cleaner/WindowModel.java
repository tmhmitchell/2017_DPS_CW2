/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window_cleaner;

import entities.CleaningRecord;
import entities.Street;
import entities.StreetsSet;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import window_cleaner.json.JsonDataReader;
import window_cleaner.json.JsonDataWriter;

/**
 *
 * @author sdgospod
 */
public class WindowModel {
    //must be set by hand for now;
    private final static String PATH = "/home/badan/2017_DPS_CW2/example_data_test.json";
    private JsonDataReader dataReader = null;
    private JsonDataWriter dataWriter = null;
    private StreetsSet streets = null;

    public WindowModel() throws IOException {
            dataReader = new JsonDataReader(PATH);
            dataWriter = new JsonDataWriter(PATH);
    }
    
    public void loadData() throws FileNotFoundException{
        dataReader.readSteets();
        streets = dataReader.getStreets();
    }

    Street getStreetByName(String name) {
        return streets.getStreets().get(name);
    } 
    
    void updateCleaningRecordHouseNumber(CleaningRecord record, int houseNumber) throws IOException {
        record.setHouseNumber(houseNumber);
        dataWriter.saveData(streets);
    }

    void updateCleaningRecordPrice(CleaningRecord record, double price) throws IOException {
        record.setPrice(price);
        dataWriter.saveData(streets);
    }

    void updateCleaningRecordLabel(CleaningRecord record, int label) throws IOException {
        if (label >= 0){
            record.setLabel(label);
            dataWriter.saveData(streets);
        }
    }
    
    void updateCleaningRecordDate(CleaningRecord record, Date date) throws IOException, ParseException {
        //System.out.println(date.toString());
        long dateTimestamp = date.getTime();
        record.setDate(dateTimestamp);
        dataWriter.saveData(streets);    
    }
}
