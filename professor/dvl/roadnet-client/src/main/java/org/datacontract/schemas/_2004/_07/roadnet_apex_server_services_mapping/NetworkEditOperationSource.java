
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkEditOperationSource.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkEditOperationSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Customer"/&gt;
 *     &lt;enumeration value="CommunityRequest"/&gt;
 *     &lt;enumeration value="CommunityApproved"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkEditOperationSource")
@XmlEnum
public enum NetworkEditOperationSource {

    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("CommunityRequest")
    COMMUNITY_REQUEST("CommunityRequest"),
    @XmlEnumValue("CommunityApproved")
    COMMUNITY_APPROVED("CommunityApproved");
    private final String value;

    NetworkEditOperationSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkEditOperationSource fromValue(String v) {
        for (NetworkEditOperationSource c: NetworkEditOperationSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
