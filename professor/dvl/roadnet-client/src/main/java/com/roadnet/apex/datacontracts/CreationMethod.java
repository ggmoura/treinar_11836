
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CreationMethod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CreationMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DatabaseBackup"/&gt;
 *     &lt;enumeration value="NewDatabase"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreationMethod")
@XmlEnum
public enum CreationMethod {

    @XmlEnumValue("DatabaseBackup")
    DATABASE_BACKUP("DatabaseBackup"),
    @XmlEnumValue("NewDatabase")
    NEW_DATABASE("NewDatabase");
    private final String value;

    CreationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreationMethod fromValue(String v) {
        for (CreationMethod c: CreationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
