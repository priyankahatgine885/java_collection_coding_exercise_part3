package corejava.collection.assignment.part3.question2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Software {
    private String serverName;

    private String softwareType;

    private String softwareTypeName;

    private String versionNumber;

    @Override
    public String toString() {
        return java.text.MessageFormat.format("ServerName: {0}\t SoftwareType: {1}\t SoftwareTypeName: {2}\t VersionName: {3}\t\n", serverName, softwareType, softwareTypeName, versionNumber);
    }

}
