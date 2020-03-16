
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CoordinateFormat.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CoordinateFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DecimalDegree"/&gt;
 *     &lt;enumeration value="DecimalDegreeMultiplyTenThousands"/&gt;
 *     &lt;enumeration value="DecimalDegreeMultiplyMillion"/&gt;
 *     &lt;enumeration value="DegMinSec"/&gt;
 *     &lt;enumeration value="DegMinSecHsec"/&gt;
 *     &lt;enumeration value="DegMinTenThousandsOfMin"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CoordinateFormat")
@XmlEnum
public enum CoordinateFormat {

    @XmlEnumValue("DecimalDegree")
    DECIMAL_DEGREE("DecimalDegree"),
    @XmlEnumValue("DecimalDegreeMultiplyTenThousands")
    DECIMAL_DEGREE_MULTIPLY_TEN_THOUSANDS("DecimalDegreeMultiplyTenThousands"),
    @XmlEnumValue("DecimalDegreeMultiplyMillion")
    DECIMAL_DEGREE_MULTIPLY_MILLION("DecimalDegreeMultiplyMillion"),
    @XmlEnumValue("DegMinSec")
    DEG_MIN_SEC("DegMinSec"),
    @XmlEnumValue("DegMinSecHsec")
    DEG_MIN_SEC_HSEC("DegMinSecHsec"),
    @XmlEnumValue("DegMinTenThousandsOfMin")
    DEG_MIN_TEN_THOUSANDS_OF_MIN("DegMinTenThousandsOfMin");
    private final String value;

    CoordinateFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoordinateFormat fromValue(String v) {
        for (CoordinateFormat c: CoordinateFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
