
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseResourceEventType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseResourceEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NetworkSpeed"/&gt;
 *     &lt;enumeration value="StaticSpeed"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *     &lt;enumeration value="ExcessiveIdling"/&gt;
 *     &lt;enumeration value="HarshAcceleration"/&gt;
 *     &lt;enumeration value="HarshBraking"/&gt;
 *     &lt;enumeration value="HarshCornering"/&gt;
 *     &lt;enumeration value="DoorState"/&gt;
 *     &lt;enumeration value="Temperature"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseResourceEventType")
@XmlEnum
public enum DataWarehouseResourceEventType {

    @XmlEnumValue("NetworkSpeed")
    NETWORK_SPEED("NetworkSpeed"),
    @XmlEnumValue("StaticSpeed")
    STATIC_SPEED("StaticSpeed"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom"),
    @XmlEnumValue("ExcessiveIdling")
    EXCESSIVE_IDLING("ExcessiveIdling"),
    @XmlEnumValue("HarshAcceleration")
    HARSH_ACCELERATION("HarshAcceleration"),
    @XmlEnumValue("HarshBraking")
    HARSH_BRAKING("HarshBraking"),
    @XmlEnumValue("HarshCornering")
    HARSH_CORNERING("HarshCornering"),
    @XmlEnumValue("DoorState")
    DOOR_STATE("DoorState"),
    @XmlEnumValue("Temperature")
    TEMPERATURE("Temperature");
    private final String value;

    DataWarehouseResourceEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseResourceEventType fromValue(String v) {
        for (DataWarehouseResourceEventType c: DataWarehouseResourceEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
