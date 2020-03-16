
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MobileScreenConfigurationType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileScreenConfigurationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="AtDepot"/&gt;
 *     &lt;enumeration value="InTransit"/&gt;
 *     &lt;enumeration value="AtStop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobileScreenConfigurationType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow")
@XmlEnum
public enum MobileScreenConfigurationType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("AtDepot")
    AT_DEPOT("AtDepot"),
    @XmlEnumValue("InTransit")
    IN_TRANSIT("InTransit"),
    @XmlEnumValue("AtStop")
    AT_STOP("AtStop");
    private final String value;

    MobileScreenConfigurationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobileScreenConfigurationType fromValue(String v) {
        for (MobileScreenConfigurationType c: MobileScreenConfigurationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
