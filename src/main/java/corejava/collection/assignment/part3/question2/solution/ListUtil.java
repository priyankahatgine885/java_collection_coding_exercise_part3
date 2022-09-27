package corejava.collection.assignment.part3.question2.solution;
import corejava.collection.assignment.part3.question2.model.Software;

import java.util.*;

public class ListUtil {
    public static List<Software> getListOfServer(final String[] data) throws RuntimeException {
        List<Software> softwareList = new ArrayList<>();
        try {
            for (String str : data) {
                String[] arrData = str.split(", ");
                String serverName = (arrData[0]);
                String softwareType = arrData[1];
                String softwareTypeName = (arrData[2]);
                String versionNumber = (arrData[3]);
               Software software = new Software(serverName, softwareType,softwareTypeName, versionNumber);
                softwareList.add(software);
            }
        } catch (NumberFormatException numberFormatException) {
            throw new RuntimeException(numberFormatException);
        }
        return softwareList;
    }
    public static Set<String> getDistinctServerName(List<Software> softwareList){
        Set<String> stringSet = new HashSet<>();
        for (Software software:softwareList) {
            String serverName = software.getServerName();
            stringSet.add(serverName);
        }
        return stringSet;
    }
    public static void printResult(List<Software> softwareList) {
        if(softwareList != null ) {
            for (Software software: softwareList)
                System.out.println(software);
            System.out.println();
        }
    }

    public static List<Software> getFilterRecordsByServerName(List<Software> softwareList, String serverName){
        List<Software> softwares = new ArrayList<>();
        for (Software software:softwareList) {
            if(software.getServerName().equals(serverName)){
                softwares.add(software);
            }
        }
        return softwares;
    }
    public static Map<String, Set<Float>> getMap(List<Software> softwareList){
        Map<String, Set<Float>> stringSetMap = new HashMap<>();

        return null;
    }
}
