package corejava.collection.assignment.part3.question2.main;
import corejava.collection.assignment.part3.question2.model.Software;
import corejava.collection.assignment.part3.question2.solution.ListUtil;
import corejava.collection.assignment.part3.question2.solution.SortByServerName;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] serversInformation = {
                "Server1, Database, MySQL, 5.5",
                "Server2, Database, MySQL, 5.1",
                "Server3, OS, Ubuntu, 12.04",
                "Server1, OS, Ubuntu, 12.04",
                "Server2, OS, Ubuntu, 18.04",
                "Server3, Language, Python, 2.6.3",
                "Server4, Language, Python, 3.9.14",
                "Server4, Language, Python, 3.10.4"
        };
        List<Software> softwareList = ListUtil.getListOfServer(serversInformation);
        ListUtil.printResult(softwareList);

        System.out.println("Distinct Server name : ");
        System.out.println();
        Set<String> softwareSet = ListUtil.getDistinctServerName(softwareList);
        for (String serverName : softwareSet) {
            System.out.println(serverName);
        }

        System.out.println("Filter Record By Server Name : ");
        System.out.println();
        List<Software> filterList = ListUtil.getFilterRecordsByServerName(softwareList, "Server1");
        ListUtil.printResult(filterList);

        System.out.println("Sorted List By Sever Name : ");
        System.out.println();
        Comparator<Software> comparator = new SortByServerName();
        Collections.sort(softwareList, comparator);
        ListUtil.printResult(softwareList);

//        System.out.println("Sorted List By Version Number : ");
//        comparator = new SortByVersionNumber();
//        Collections.sort(softwareList,comparator);
//        ListUtil.printResult(softwareList);

    }
}
