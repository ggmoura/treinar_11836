
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VideoResolution.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoResolution"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CifAt5Fps"/&gt;
 *     &lt;enumeration value="D1At5Fps"/&gt;
 *     &lt;enumeration value="D1At15Fps"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VideoResolution")
@XmlEnum
public enum VideoResolution {

    @XmlEnumValue("CifAt5Fps")
    CIF_AT_5_FPS("CifAt5Fps"),
    @XmlEnumValue("D1At5Fps")
    D_1_AT_5_FPS("D1At5Fps"),
    @XmlEnumValue("D1At15Fps")
    D_1_AT_15_FPS("D1At15Fps");
    private final String value;

    VideoResolution(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoResolution fromValue(String v) {
        for (VideoResolution c: VideoResolution.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
