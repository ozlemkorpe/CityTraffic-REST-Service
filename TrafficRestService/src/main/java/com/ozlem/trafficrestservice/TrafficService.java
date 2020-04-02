package com.ozlem.trafficrestservice;

import com.opencsv.CSVReader;
import com.ozlem.trafficrestservice.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

@Service
public class TrafficService implements ITrafficService {

    private final ArrayList<Traffic> Traffics;

    public TrafficService() {

    	Traffics = new ArrayList();
    }

    @Override
    public ArrayList<Traffic> findAll() {

        FileInputStream fis = null;

        try {

            String fileName = "src/main/resources/trafficdata.csv";

            fis = new FileInputStream(new File(fileName));
            CSVReader reader = new CSVReader(new InputStreamReader(fis));
            String[] nextLine;
            reader.readNext();
            
            while ((nextLine = reader.readNext()) != null) {

            	Traffic newTraffic = new Traffic(String.valueOf(nextLine[0]), Integer.valueOf(nextLine[1]), Integer.valueOf(nextLine[2]),
            			Integer.valueOf(nextLine[3]),Integer.valueOf(nextLine[4]),Integer.valueOf(nextLine[5])
            			,Integer.valueOf(nextLine[6]), Integer.valueOf(nextLine[7]), Integer.valueOf(nextLine[8])
            			, Integer.valueOf(nextLine[9]), Integer.valueOf(nextLine[10]));
            	Traffics.add(newTraffic);
            }
          

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TrafficService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrafficService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(TrafficService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return Traffics;
    }
}