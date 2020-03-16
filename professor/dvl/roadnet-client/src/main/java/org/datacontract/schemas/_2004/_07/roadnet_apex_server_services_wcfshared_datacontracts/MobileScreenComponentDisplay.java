
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MobileScreenComponentDisplay.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileScreenComponentDisplay"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Hidden"/&gt;
 *     &lt;enumeration value="QuickAction"/&gt;
 *     &lt;enumeration value="TaskList"/&gt;
 *     &lt;enumeration value="Menu"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobileScreenComponentDisplay", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow")
@XmlEnum
public enum MobileScreenComponentDisplay {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Hidden")
    HIDDEN("Hidden"),
    @XmlEnumValue("QuickAction")
    QUICK_ACTION("QuickAction"),
    @XmlEnumValue("TaskList")
    TASK_LIST("TaskList"),
    @XmlEnumValue("Menu")
    MENU("Menu");
    private final String value;

    MobileScreenComponentDisplay(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobileScreenComponentDisplay fromValue(String v) {
        for (MobileScreenComponentDisplay c: MobileScreenComponentDisplay.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
