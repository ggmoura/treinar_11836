
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AttachCustomerStage.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachCustomerStage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Initialization"/&gt;
 *     &lt;enumeration value="CopyingBackupFile"/&gt;
 *     &lt;enumeration value="CopyingMapEdits"/&gt;
 *     &lt;enumeration value="CompressingBackupFile"/&gt;
 *     &lt;enumeration value="Staging"/&gt;
 *     &lt;enumeration value="Restoring"/&gt;
 *     &lt;enumeration value="ScriptingTransfer"/&gt;
 *     &lt;enumeration value="CreatingTables"/&gt;
 *     &lt;enumeration value="CopyingData"/&gt;
 *     &lt;enumeration value="EnablingConstraints"/&gt;
 *     &lt;enumeration value="UpdatingDatabase"/&gt;
 *     &lt;enumeration value="DroppingSourceTempDatabase"/&gt;
 *     &lt;enumeration value="AttachingCustomer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttachCustomerStage")
@XmlEnum
public enum AttachCustomerStage {

    @XmlEnumValue("Initialization")
    INITIALIZATION("Initialization"),
    @XmlEnumValue("CopyingBackupFile")
    COPYING_BACKUP_FILE("CopyingBackupFile"),
    @XmlEnumValue("CopyingMapEdits")
    COPYING_MAP_EDITS("CopyingMapEdits"),
    @XmlEnumValue("CompressingBackupFile")
    COMPRESSING_BACKUP_FILE("CompressingBackupFile"),
    @XmlEnumValue("Staging")
    STAGING("Staging"),
    @XmlEnumValue("Restoring")
    RESTORING("Restoring"),
    @XmlEnumValue("ScriptingTransfer")
    SCRIPTING_TRANSFER("ScriptingTransfer"),
    @XmlEnumValue("CreatingTables")
    CREATING_TABLES("CreatingTables"),
    @XmlEnumValue("CopyingData")
    COPYING_DATA("CopyingData"),
    @XmlEnumValue("EnablingConstraints")
    ENABLING_CONSTRAINTS("EnablingConstraints"),
    @XmlEnumValue("UpdatingDatabase")
    UPDATING_DATABASE("UpdatingDatabase"),
    @XmlEnumValue("DroppingSourceTempDatabase")
    DROPPING_SOURCE_TEMP_DATABASE("DroppingSourceTempDatabase"),
    @XmlEnumValue("AttachingCustomer")
    ATTACHING_CUSTOMER("AttachingCustomer");
    private final String value;

    AttachCustomerStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachCustomerStage fromValue(String v) {
        for (AttachCustomerStage c: AttachCustomerStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
