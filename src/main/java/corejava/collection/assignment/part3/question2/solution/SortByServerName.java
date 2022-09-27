package corejava.collection.assignment.part3.question2.solution;

import corejava.collection.assignment.part3.question2.model.Software;

import java.util.Comparator;

public class SortByServerName implements Comparator<Software> {
    @Override
    public int compare(Software software1, Software software2) {
        return software1.getServerName().compareTo(software2.getServerName());
    }
}
