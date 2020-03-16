
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransitMatrixBuildStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TransitMatrixBuildStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BuildNotRequired"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="BuildRequestQueued"/&gt;
 *     &lt;enumeration value="BuildRequestReceived"/&gt;
 *     &lt;enumeration value="BuildStarted"/&gt;
 *     &lt;enumeration value="BuildSuccess"/&gt;
 *     &lt;enumeration value="BuildCancelled"/&gt;
 *     &lt;enumeration value="BuildFailure"/&gt;
 *     &lt;enumeration value="BuildCurrentlyRunningOnAnotherServer"/&gt;
 *     &lt;enumeration value="BuildIOErrorGettingFileLock"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransitMatrixBuildStatus")
@XmlEnum
public enum TransitMatrixBuildStatus {

    @XmlEnumValue("BuildNotRequired")
    BUILD_NOT_REQUIRED("BuildNotRequired"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("BuildRequestQueued")
    BUILD_REQUEST_QUEUED("BuildRequestQueued"),
    @XmlEnumValue("BuildRequestReceived")
    BUILD_REQUEST_RECEIVED("BuildRequestReceived"),
    @XmlEnumValue("BuildStarted")
    BUILD_STARTED("BuildStarted"),
    @XmlEnumValue("BuildSuccess")
    BUILD_SUCCESS("BuildSuccess"),
    @XmlEnumValue("BuildCancelled")
    BUILD_CANCELLED("BuildCancelled"),
    @XmlEnumValue("BuildFailure")
    BUILD_FAILURE("BuildFailure"),
    @XmlEnumValue("BuildCurrentlyRunningOnAnotherServer")
    BUILD_CURRENTLY_RUNNING_ON_ANOTHER_SERVER("BuildCurrentlyRunningOnAnotherServer"),
    @XmlEnumValue("BuildIOErrorGettingFileLock")
    BUILD_IO_ERROR_GETTING_FILE_LOCK("BuildIOErrorGettingFileLock");
    private final String value;

    TransitMatrixBuildStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransitMatrixBuildStatus fromValue(String v) {
        for (TransitMatrixBuildStatus c: TransitMatrixBuildStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
