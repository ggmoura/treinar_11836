
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataQuality.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataQuality"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSet"/&gt;
 *     &lt;enumeration value="Projected"/&gt;
 *     &lt;enumeration value="AssumedFromProjection"/&gt;
 *     &lt;enumeration value="DispatcherEntered"/&gt;
 *     &lt;enumeration value="AutoCaptured"/&gt;
 *     &lt;enumeration value="AutoCapturedGroup"/&gt;
 *     &lt;enumeration value="GeoComputed"/&gt;
 *     &lt;enumeration value="ComplianceSystem"/&gt;
 *     &lt;enumeration value="GeoComputedCluster"/&gt;
 *     &lt;enumeration value="TimeCaptured"/&gt;
 *     &lt;enumeration value="Computed"/&gt;
 *     &lt;enumeration value="OdometerComputed"/&gt;
 *     &lt;enumeration value="NavigationSystem"/&gt;
 *     &lt;enumeration value="IgnitionComputed"/&gt;
 *     &lt;enumeration value="IgnitionComputedCluster"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataQuality")
@XmlEnum
public enum DataQuality {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Projected")
    PROJECTED("Projected"),
    @XmlEnumValue("AssumedFromProjection")
    ASSUMED_FROM_PROJECTION("AssumedFromProjection"),
    @XmlEnumValue("DispatcherEntered")
    DISPATCHER_ENTERED("DispatcherEntered"),
    @XmlEnumValue("AutoCaptured")
    AUTO_CAPTURED("AutoCaptured"),
    @XmlEnumValue("AutoCapturedGroup")
    AUTO_CAPTURED_GROUP("AutoCapturedGroup"),
    @XmlEnumValue("GeoComputed")
    GEO_COMPUTED("GeoComputed"),
    @XmlEnumValue("ComplianceSystem")
    COMPLIANCE_SYSTEM("ComplianceSystem"),
    @XmlEnumValue("GeoComputedCluster")
    GEO_COMPUTED_CLUSTER("GeoComputedCluster"),
    @XmlEnumValue("TimeCaptured")
    TIME_CAPTURED("TimeCaptured"),
    @XmlEnumValue("Computed")
    COMPUTED("Computed"),
    @XmlEnumValue("OdometerComputed")
    ODOMETER_COMPUTED("OdometerComputed"),
    @XmlEnumValue("NavigationSystem")
    NAVIGATION_SYSTEM("NavigationSystem"),
    @XmlEnumValue("IgnitionComputed")
    IGNITION_COMPUTED("IgnitionComputed"),
    @XmlEnumValue("IgnitionComputedCluster")
    IGNITION_COMPUTED_CLUSTER("IgnitionComputedCluster");
    private final String value;

    DataQuality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataQuality fromValue(String v) {
        for (DataQuality c: DataQuality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
