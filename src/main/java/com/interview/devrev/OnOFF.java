package com.interview.devrev;

import java.util.ArrayList;
import java.util.Arrays;

public class OnOFF {

  /*  1234.56 ON
    1235.57 ON
    1242.1 OFF
    1249.3 OFF
    1267.1 ON
    1270.5 OFF*/

    public static void main(String[] args) {

        ArrayList<String> logContent = new ArrayList<>();

        logContent.add("1234.56 ON");
        logContent.add("1235.57 ON");
        logContent.add("1242.1 OFF");
        logContent.add("1249.3 OFF");
        logContent.add("1267.1 ON");
        logContent.add("1270.5 OFF");

        double deviceOnTime = 0.0;

        for(int i=1; i<logContent.size(); i++){

            deviceOnTime += checkDeviceStatus(Double.parseDouble(logContent.get(i-1).split("\\s+")[0]),
                    Double.parseDouble(logContent.get(i).split("\\s+")[0]),
                    logContent.get(i-1).split("\\s+")[1]);

        }

        System.out.println("Total Device Uptime is: "+deviceOnTime);
    }

    public static double checkDeviceStatus(double prevTime, double currentTime, String prevStatus){

        double time = 0.0;

        if(prevStatus.equalsIgnoreCase("ON"))
            time = currentTime - prevTime;

        return time;

    }

}
