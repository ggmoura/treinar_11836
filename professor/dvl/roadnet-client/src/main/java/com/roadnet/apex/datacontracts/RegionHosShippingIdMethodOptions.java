
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.HosShippingIdMethodOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.HosShippingIdMethodOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ManifestRouteShipperCommodity"/&gt;
 *     &lt;enumeration value="LoadId"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.HosShippingIdMethodOptions")
@XmlEnum
public enum RegionHosShippingIdMethodOptions {

    @XmlEnumValue("ManifestRouteShipperCommodity")
    MANIFEST_ROUTE_SHIPPER_COMMODITY("ManifestRouteShipperCommodity"),
    @XmlEnumValue("LoadId")
    LOAD_ID("LoadId");
    private final String value;

    RegionHosShippingIdMethodOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionHosShippingIdMethodOptions fromValue(String v) {
        for (RegionHosShippingIdMethodOptions c: RegionHosShippingIdMethodOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
