
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ImmutableObject;


/**
 * <p>Classe Java de ResourceEvent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResourceEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}ImmutableObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceEvent", propOrder = {
    "startTimestamp"
})
@XmlSeeAlso({
    NavRoutePathDeviationResourceEvent.class,
    NavSpeedAlertResourceEvent.class,
    PowerTakeOffResourceEvent.class,
    NavMapVersionChangedEvent.class,
    NavWorkerChangedResourceEvent.class,
    NavAppStateChangedResourceEvent.class,
    NavRecalculationResourceEvent.class,
    NavCancellationResourceEvent.class,
    HarshDrivingResourceEvent.class,
    PositionResourceEvent.class,
    StationaryResourceEvent.class,
    IdlingResourceEvent.class
})
public class ResourceEvent
    extends ImmutableObject
{

    @XmlElement(name = "StartTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTimestamp;

    /**
     * Obtém o valor da propriedade startTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * Define o valor da propriedade startTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimestamp(XMLGregorianCalendar value) {
        this.startTimestamp = value;
    }

}
