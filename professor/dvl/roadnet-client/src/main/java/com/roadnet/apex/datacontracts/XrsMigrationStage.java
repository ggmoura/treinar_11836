
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de XrsMigrationStage.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="XrsMigrationStage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Initialization"/&gt;
 *     &lt;enumeration value="RetrieveRegions"/&gt;
 *     &lt;enumeration value="RetrieveUsers"/&gt;
 *     &lt;enumeration value="RetrieveEquipment"/&gt;
 *     &lt;enumeration value="RetrieveWorkers"/&gt;
 *     &lt;enumeration value="RetrieveMobileDevices"/&gt;
 *     &lt;enumeration value="RetrieveLocations"/&gt;
 *     &lt;enumeration value="CreateComplete"/&gt;
 *     &lt;enumeration value="ReadingWorkbook"/&gt;
 *     &lt;enumeration value="MigrateRegions"/&gt;
 *     &lt;enumeration value="MigrateUsers"/&gt;
 *     &lt;enumeration value="MigrateEquipment"/&gt;
 *     &lt;enumeration value="MigrateWorkers"/&gt;
 *     &lt;enumeration value="MigrateMobileDevices"/&gt;
 *     &lt;enumeration value="MigrateLocations"/&gt;
 *     &lt;enumeration value="MigratePostProcess"/&gt;
 *     &lt;enumeration value="MigrationComplete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "XrsMigrationStage")
@XmlEnum
public enum XrsMigrationStage {

    @XmlEnumValue("Initialization")
    INITIALIZATION("Initialization"),
    @XmlEnumValue("RetrieveRegions")
    RETRIEVE_REGIONS("RetrieveRegions"),
    @XmlEnumValue("RetrieveUsers")
    RETRIEVE_USERS("RetrieveUsers"),
    @XmlEnumValue("RetrieveEquipment")
    RETRIEVE_EQUIPMENT("RetrieveEquipment"),
    @XmlEnumValue("RetrieveWorkers")
    RETRIEVE_WORKERS("RetrieveWorkers"),
    @XmlEnumValue("RetrieveMobileDevices")
    RETRIEVE_MOBILE_DEVICES("RetrieveMobileDevices"),
    @XmlEnumValue("RetrieveLocations")
    RETRIEVE_LOCATIONS("RetrieveLocations"),
    @XmlEnumValue("CreateComplete")
    CREATE_COMPLETE("CreateComplete"),
    @XmlEnumValue("ReadingWorkbook")
    READING_WORKBOOK("ReadingWorkbook"),
    @XmlEnumValue("MigrateRegions")
    MIGRATE_REGIONS("MigrateRegions"),
    @XmlEnumValue("MigrateUsers")
    MIGRATE_USERS("MigrateUsers"),
    @XmlEnumValue("MigrateEquipment")
    MIGRATE_EQUIPMENT("MigrateEquipment"),
    @XmlEnumValue("MigrateWorkers")
    MIGRATE_WORKERS("MigrateWorkers"),
    @XmlEnumValue("MigrateMobileDevices")
    MIGRATE_MOBILE_DEVICES("MigrateMobileDevices"),
    @XmlEnumValue("MigrateLocations")
    MIGRATE_LOCATIONS("MigrateLocations"),
    @XmlEnumValue("MigratePostProcess")
    MIGRATE_POST_PROCESS("MigratePostProcess"),
    @XmlEnumValue("MigrationComplete")
    MIGRATION_COMPLETE("MigrationComplete");
    private final String value;

    XrsMigrationStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XrsMigrationStage fromValue(String v) {
        for (XrsMigrationStage c: XrsMigrationStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
