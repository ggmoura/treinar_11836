
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseTravelLegTypeDimension.TravelLegType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseTravelLegTypeDimension.TravelLegType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="StemOut"/&gt;
 *     &lt;enumeration value="StemIn"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="NonRoute"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseTravelLegTypeDimension.TravelLegType")
@XmlEnum
public enum DataWarehouseTravelLegTypeDimensionTravelLegType {

    @XmlEnumValue("StemOut")
    STEM_OUT("StemOut"),
    @XmlEnumValue("StemIn")
    STEM_IN("StemIn"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("NonRoute")
    NON_ROUTE("NonRoute");
    private final String value;

    DataWarehouseTravelLegTypeDimensionTravelLegType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseTravelLegTypeDimensionTravelLegType fromValue(String v) {
        for (DataWarehouseTravelLegTypeDimensionTravelLegType c: DataWarehouseTravelLegTypeDimensionTravelLegType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
