
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de UpdateDailyRoutesJobParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateDailyRoutesJobParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClearSessionsPriorToUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreateSingleSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MoveToDispatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="SessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeekStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDailyRoutesJobParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.UpdateDailyRoutes", propOrder = {
    "clearSessionsPriorToUpdate",
    "createSingleSession",
    "moveToDispatch",
    "routeKeys",
    "sessionDescription",
    "weekStartDate"
})
public class UpdateDailyRoutesJobParameters
    extends DataTransferObject
{

    @XmlElement(name = "ClearSessionsPriorToUpdate")
    protected Boolean clearSessionsPriorToUpdate;
    @XmlElement(name = "CreateSingleSession")
    protected Boolean createSingleSession;
    @XmlElement(name = "MoveToDispatch")
    protected Boolean moveToDispatch;
    @XmlElementRef(name = "RouteKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.UpdateDailyRoutes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> routeKeys;
    @XmlElementRef(name = "SessionDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.UpdateDailyRoutes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionDescription;
    @XmlElement(name = "WeekStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar weekStartDate;

    /**
     * Obtém o valor da propriedade clearSessionsPriorToUpdate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClearSessionsPriorToUpdate() {
        return clearSessionsPriorToUpdate;
    }

    /**
     * Define o valor da propriedade clearSessionsPriorToUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClearSessionsPriorToUpdate(Boolean value) {
        this.clearSessionsPriorToUpdate = value;
    }

    /**
     * Obtém o valor da propriedade createSingleSession.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateSingleSession() {
        return createSingleSession;
    }

    /**
     * Define o valor da propriedade createSingleSession.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateSingleSession(Boolean value) {
        this.createSingleSession = value;
    }

    /**
     * Obtém o valor da propriedade moveToDispatch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoveToDispatch() {
        return moveToDispatch;
    }

    /**
     * Define o valor da propriedade moveToDispatch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoveToDispatch(Boolean value) {
        this.moveToDispatch = value;
    }

    /**
     * Obtém o valor da propriedade routeKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getRouteKeys() {
        return routeKeys;
    }

    /**
     * Define o valor da propriedade routeKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setRouteKeys(JAXBElement<ArrayOflong> value) {
        this.routeKeys = value;
    }

    /**
     * Obtém o valor da propriedade sessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionDescription() {
        return sessionDescription;
    }

    /**
     * Define o valor da propriedade sessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionDescription(JAXBElement<String> value) {
        this.sessionDescription = value;
    }

    /**
     * Obtém o valor da propriedade weekStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWeekStartDate() {
        return weekStartDate;
    }

    /**
     * Define o valor da propriedade weekStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWeekStartDate(XMLGregorianCalendar value) {
        this.weekStartDate = value;
    }

}
