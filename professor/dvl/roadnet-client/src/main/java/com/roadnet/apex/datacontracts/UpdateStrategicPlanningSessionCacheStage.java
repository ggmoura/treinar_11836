
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UpdateStrategicPlanningSessionCacheStage.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateStrategicPlanningSessionCacheStage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Initializing"/&gt;
 *     &lt;enumeration value="SavingCache"/&gt;
 *     &lt;enumeration value="ReloadingCache"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UpdateStrategicPlanningSessionCacheStage")
@XmlEnum
public enum UpdateStrategicPlanningSessionCacheStage {

    @XmlEnumValue("Initializing")
    INITIALIZING("Initializing"),
    @XmlEnumValue("SavingCache")
    SAVING_CACHE("SavingCache"),
    @XmlEnumValue("ReloadingCache")
    RELOADING_CACHE("ReloadingCache");
    private final String value;

    UpdateStrategicPlanningSessionCacheStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateStrategicPlanningSessionCacheStage fromValue(String v) {
        for (UpdateStrategicPlanningSessionCacheStage c: UpdateStrategicPlanningSessionCacheStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
