
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GeocodeLocationsJobStage.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GeocodeLocationsJobStage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ProcessingLocations"/&gt;
 *     &lt;enumeration value="GeocodingAddresses"/&gt;
 *     &lt;enumeration value="ApplyGeocodeToLocations"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeocodeLocationsJobStage")
@XmlEnum
public enum GeocodeLocationsJobStage {

    @XmlEnumValue("ProcessingLocations")
    PROCESSING_LOCATIONS("ProcessingLocations"),
    @XmlEnumValue("GeocodingAddresses")
    GEOCODING_ADDRESSES("GeocodingAddresses"),
    @XmlEnumValue("ApplyGeocodeToLocations")
    APPLY_GEOCODE_TO_LOCATIONS("ApplyGeocodeToLocations");
    private final String value;

    GeocodeLocationsJobStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeocodeLocationsJobStage fromValue(String v) {
        for (GeocodeLocationsJobStage c: GeocodeLocationsJobStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
