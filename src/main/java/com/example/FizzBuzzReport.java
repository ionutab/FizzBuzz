package com.example;

import java.util.HashMap;

import org.apache.commons.lang3.math.NumberUtils;

public class FizzBuzzReport {

    public static final String SEPARATOR = " : ";
    public static final String INTEGER   = "integer";

    private HashMap<String, Integer> reportData = new HashMap<>();

    public void countOccurrence(String key) {

        if (NumberUtils.isCreatable(key)) {
            key = INTEGER;
        }

        Integer occurrences = reportData.get(key);

        if (occurrences == null) {
            reportData.put(key, 1);
        } else {
            reportData.put(key, ++occurrences);
        }
    }

    public String getReportDataInReadableFormat() {
        StringBuilder sb = new StringBuilder();
        for (String key : reportData.keySet()) {
            sb.append(key);
            sb.append(SEPARATOR);
            sb.append(reportData.get(key));
            sb.append(" ");
        }
        return sb.toString();
    }

    public int getNrOccurrences(String key) {
        Integer occurrences = reportData.get(key);
        return occurrences != null ? occurrences : 0;
    }

}
