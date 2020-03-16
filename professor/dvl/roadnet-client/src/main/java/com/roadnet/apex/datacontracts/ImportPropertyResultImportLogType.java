
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImportPropertyResult.ImportLogType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportPropertyResult.ImportLogType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="ConversionFailure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImportPropertyResult.ImportLogType")
@XmlEnum
public enum ImportPropertyResultImportLogType {

    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("ConversionFailure")
    CONVERSION_FAILURE("ConversionFailure");
    private final String value;

    ImportPropertyResultImportLogType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportPropertyResultImportLogType fromValue(String v) {
        for (ImportPropertyResultImportLogType c: ImportPropertyResultImportLogType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
