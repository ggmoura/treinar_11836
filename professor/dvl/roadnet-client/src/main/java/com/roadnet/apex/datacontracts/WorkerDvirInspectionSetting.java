
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WorkerDvirInspectionSetting.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkerDvirInspectionSetting"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UseRegionSetting"/&gt;
 *     &lt;enumeration value="NoInspection"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkerDvirInspectionSetting")
@XmlEnum
public enum WorkerDvirInspectionSetting {

    @XmlEnumValue("UseRegionSetting")
    USE_REGION_SETTING("UseRegionSetting"),
    @XmlEnumValue("NoInspection")
    NO_INSPECTION("NoInspection");
    private final String value;

    WorkerDvirInspectionSetting(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkerDvirInspectionSetting fromValue(String v) {
        for (WorkerDvirInspectionSetting c: WorkerDvirInspectionSetting.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
