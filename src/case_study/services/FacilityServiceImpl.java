package case_study.services;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FacilityServiceImpl {
    Map<String, Integer>  facilityMap;

    public FacilityServiceImpl() {
        facilityMap = new LinkedHashMap<>();
    }

    public void displayFacility() {
        Set<Map.Entry<String, Integer>> facilitiesList = facilityMap.entrySet();
        for(Map.Entry<String, Integer> entry: facilitiesList) {
            System.out.println("Key: " + entry.getKey() + " | Value: "+ entry.getValue());
        }
    }

    public void adđFacility(int choice) {
        boolean addNewVilla = choice == 1;
        boolean AddnewHouse = choice == 2;
        if (addNewVilla) {
            if (!facilityMap.containsKey("Villa")) {
                facilityMap.put("Villa", 1);
            } else
                facilityMap.put("Villa", facilityMap.get("Villa") + 1);
        } else if (AddnewHouse) {
                if (!facilityMap.containsKey("House")) {
                    facilityMap.put("House", 1);
                } else
                    facilityMap.put("House", facilityMap.get("House") + 1);
        } else {
            String house = "Room";
            if (!facilityMap.containsKey(house)) {
                facilityMap.put(house, 1);
            } else
                facilityMap.put(house, facilityMap.get(house) + 1);
        }
    }

    public void facilityMaintenance() {
        Set<Map.Entry<String, Integer>> facMaintenList = facilityMap.entrySet();
        for (Map.Entry<String, Integer> fac : facMaintenList) {
            if (fac.getValue() == 2) {
                System.out.println("Key: " + fac.getKey() + " | Value: "+ fac.getValue());
            }
        }
    }




}
