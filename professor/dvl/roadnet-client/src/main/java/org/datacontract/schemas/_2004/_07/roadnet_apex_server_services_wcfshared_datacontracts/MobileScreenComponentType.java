
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MobileScreenComponentType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileScreenComponentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="About"/&gt;
 *     &lt;enumeration value="ShowFormResults"/&gt;
 *     &lt;enumeration value="UpdateEquipment"/&gt;
 *     &lt;enumeration value="AddBreak"/&gt;
 *     &lt;enumeration value="AddDelay"/&gt;
 *     &lt;enumeration value="AddLayover"/&gt;
 *     &lt;enumeration value="AddServiceableStop"/&gt;
 *     &lt;enumeration value="AddUnplannedStop"/&gt;
 *     &lt;enumeration value="UndeliverStop"/&gt;
 *     &lt;enumeration value="SendStopNote"/&gt;
 *     &lt;enumeration value="ViewLocationHistory"/&gt;
 *     &lt;enumeration value="ViewLocationComments"/&gt;
 *     &lt;enumeration value="ViewReceipt"/&gt;
 *     &lt;enumeration value="UpdateNonServiceableStop"/&gt;
 *     &lt;enumeration value="Signature"/&gt;
 *     &lt;enumeration value="VerifyOrders"/&gt;
 *     &lt;enumeration value="Geocode"/&gt;
 *     &lt;enumeration value="CustomForms"/&gt;
 *     &lt;enumeration value="TruckInventory"/&gt;
 *     &lt;enumeration value="ArriveAndWait"/&gt;
 *     &lt;enumeration value="AddEditForm"/&gt;
 *     &lt;enumeration value="RouteSharingServer"/&gt;
 *     &lt;enumeration value="RedeliverCurrentStop"/&gt;
 *     &lt;enumeration value="TransferStops"/&gt;
 *     &lt;enumeration value="CreateGroupStop"/&gt;
 *     &lt;enumeration value="EditGroupStop"/&gt;
 *     &lt;enumeration value="TrailerDropHook"/&gt;
 *     &lt;enumeration value="PreDeliveryScan"/&gt;
 *     &lt;enumeration value="CustomForm"/&gt;
 *     &lt;enumeration value="AcceptDeclineRoutes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobileScreenComponentType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow")
@XmlEnum
public enum MobileScreenComponentType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("About")
    ABOUT("About"),
    @XmlEnumValue("ShowFormResults")
    SHOW_FORM_RESULTS("ShowFormResults"),
    @XmlEnumValue("UpdateEquipment")
    UPDATE_EQUIPMENT("UpdateEquipment"),
    @XmlEnumValue("AddBreak")
    ADD_BREAK("AddBreak"),
    @XmlEnumValue("AddDelay")
    ADD_DELAY("AddDelay"),
    @XmlEnumValue("AddLayover")
    ADD_LAYOVER("AddLayover"),
    @XmlEnumValue("AddServiceableStop")
    ADD_SERVICEABLE_STOP("AddServiceableStop"),
    @XmlEnumValue("AddUnplannedStop")
    ADD_UNPLANNED_STOP("AddUnplannedStop"),
    @XmlEnumValue("UndeliverStop")
    UNDELIVER_STOP("UndeliverStop"),
    @XmlEnumValue("SendStopNote")
    SEND_STOP_NOTE("SendStopNote"),
    @XmlEnumValue("ViewLocationHistory")
    VIEW_LOCATION_HISTORY("ViewLocationHistory"),
    @XmlEnumValue("ViewLocationComments")
    VIEW_LOCATION_COMMENTS("ViewLocationComments"),
    @XmlEnumValue("ViewReceipt")
    VIEW_RECEIPT("ViewReceipt"),
    @XmlEnumValue("UpdateNonServiceableStop")
    UPDATE_NON_SERVICEABLE_STOP("UpdateNonServiceableStop"),
    @XmlEnumValue("Signature")
    SIGNATURE("Signature"),
    @XmlEnumValue("VerifyOrders")
    VERIFY_ORDERS("VerifyOrders"),
    @XmlEnumValue("Geocode")
    GEOCODE("Geocode"),
    @XmlEnumValue("CustomForms")
    CUSTOM_FORMS("CustomForms"),
    @XmlEnumValue("TruckInventory")
    TRUCK_INVENTORY("TruckInventory"),
    @XmlEnumValue("ArriveAndWait")
    ARRIVE_AND_WAIT("ArriveAndWait"),
    @XmlEnumValue("AddEditForm")
    ADD_EDIT_FORM("AddEditForm"),
    @XmlEnumValue("RouteSharingServer")
    ROUTE_SHARING_SERVER("RouteSharingServer"),
    @XmlEnumValue("RedeliverCurrentStop")
    REDELIVER_CURRENT_STOP("RedeliverCurrentStop"),
    @XmlEnumValue("TransferStops")
    TRANSFER_STOPS("TransferStops"),
    @XmlEnumValue("CreateGroupStop")
    CREATE_GROUP_STOP("CreateGroupStop"),
    @XmlEnumValue("EditGroupStop")
    EDIT_GROUP_STOP("EditGroupStop"),
    @XmlEnumValue("TrailerDropHook")
    TRAILER_DROP_HOOK("TrailerDropHook"),
    @XmlEnumValue("PreDeliveryScan")
    PRE_DELIVERY_SCAN("PreDeliveryScan"),
    @XmlEnumValue("CustomForm")
    CUSTOM_FORM("CustomForm"),
    @XmlEnumValue("AcceptDeclineRoutes")
    ACCEPT_DECLINE_ROUTES("AcceptDeclineRoutes");
    private final String value;

    MobileScreenComponentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobileScreenComponentType fromValue(String v) {
        for (MobileScreenComponentType c: MobileScreenComponentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
