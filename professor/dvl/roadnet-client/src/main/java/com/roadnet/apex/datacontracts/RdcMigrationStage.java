
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RdcMigrationStage.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RdcMigrationStage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Initialization"/&gt;
 *     &lt;enumeration value="ReadingWorkbook"/&gt;
 *     &lt;enumeration value="MigratingRegions"/&gt;
 *     &lt;enumeration value="MigratingUsers"/&gt;
 *     &lt;enumeration value="MigratingWorkers"/&gt;
 *     &lt;enumeration value="MigratingEquipments"/&gt;
 *     &lt;enumeration value="MigratingMobileDevices"/&gt;
 *     &lt;enumeration value="MigrationComplete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RdcMigrationStage")
@XmlEnum
public enum RdcMigrationStage {

    @XmlEnumValue("Initialization")
    INITIALIZATION("Initialization"),
    @XmlEnumValue("ReadingWorkbook")
    READING_WORKBOOK("ReadingWorkbook"),
    @XmlEnumValue("MigratingRegions")
    MIGRATING_REGIONS("MigratingRegions"),
    @XmlEnumValue("MigratingUsers")
    MIGRATING_USERS("MigratingUsers"),
    @XmlEnumValue("MigratingWorkers")
    MIGRATING_WORKERS("MigratingWorkers"),
    @XmlEnumValue("MigratingEquipments")
    MIGRATING_EQUIPMENTS("MigratingEquipments"),
    @XmlEnumValue("MigratingMobileDevices")
    MIGRATING_MOBILE_DEVICES("MigratingMobileDevices"),
    @XmlEnumValue("MigrationComplete")
    MIGRATION_COMPLETE("MigrationComplete");
    private final String value;

    RdcMigrationStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RdcMigrationStage fromValue(String v) {
        for (RdcMigrationStage c: RdcMigrationStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
