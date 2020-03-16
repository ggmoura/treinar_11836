
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MapLocalSearchResult.ErrorCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MapLocalSearchResult.ErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="ValidationFailure"/&gt;
 *     &lt;enumeration value="SearchProviderCommunicationError"/&gt;
 *     &lt;enumeration value="SearchProviderQueryLimitError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MapLocalSearchResult.ErrorCode")
@XmlEnum
public enum MapLocalSearchResultErrorCode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ValidationFailure")
    VALIDATION_FAILURE("ValidationFailure"),
    @XmlEnumValue("SearchProviderCommunicationError")
    SEARCH_PROVIDER_COMMUNICATION_ERROR("SearchProviderCommunicationError"),
    @XmlEnumValue("SearchProviderQueryLimitError")
    SEARCH_PROVIDER_QUERY_LIMIT_ERROR("SearchProviderQueryLimitError");
    private final String value;

    MapLocalSearchResultErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MapLocalSearchResultErrorCode fromValue(String v) {
        for (MapLocalSearchResultErrorCode c: MapLocalSearchResultErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
