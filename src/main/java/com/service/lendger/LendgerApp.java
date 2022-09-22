package com.service.lendger;

import com.service.lendger.ServiceLayer.RouterService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LendgerApp {

    /**
     * Assumptions :
     * 1. combinations of (user + bank name) is always unique
     */

    public static void main(String[] args) throws IOException {
        RouterService serviceClass = new RouterService();
        String filePath = args[0];
        File file = new File(filePath);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            serviceClass.processEachCommand(line);
        }
    }

}
