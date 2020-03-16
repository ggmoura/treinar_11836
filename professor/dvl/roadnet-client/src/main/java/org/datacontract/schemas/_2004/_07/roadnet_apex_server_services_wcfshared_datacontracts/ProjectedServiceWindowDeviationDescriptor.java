
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.ArrayOfServiceableStopOpenCloseDetail;
import com.roadnet.apex.datacontracts.ArrayOfServiceableStopServiceWindowDetail;


/**
 * <p>Classe Java de ProjectedServiceWindowDeviationDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProjectedServiceWindowDeviationDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionSpecialDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OpenCloseDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceableStopOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedServiceStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceableStopServiceWindowDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectedServiceWindowDeviationDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "openCloseDetails",
    "projectedDepartureTime",
    "projectedServiceStartTime",
    "serviceWindowDetails"
})
public class ProjectedServiceWindowDeviationDescriptor
    extends ResourceExceptionSpecialDescriptor
{

    @XmlElementRef(name = "OpenCloseDetails", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceableStopOpenCloseDetail> openCloseDetails;
    @XmlElement(name = "ProjectedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar projectedDepartureTime;
    @XmlElement(name = "ProjectedServiceStartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar projectedServiceStartTime;
    @XmlElementRef(name = "ServiceWindowDetails", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceableStopServiceWindowDetail> serviceWindowDetails;

    /**
     * Obtém o valor da propriedade openCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceableStopOpenCloseDetail> getOpenCloseDetails() {
        return openCloseDetails;
    }

    /**
     * Define o valor da propriedade openCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopOpenCloseDetail }{@code >}
     *     
     */
    public void setOpenCloseDetails(JAXBElement<ArrayOfServiceableStopOpenCloseDetail> value) {
        this.openCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade projectedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectedDepartureTime() {
        return projectedDepartureTime;
    }

    /**
     * Define o valor da propriedade projectedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectedDepartureTime(XMLGregorianCalendar value) {
        this.projectedDepartureTime = value;
    }

    /**
     * Obtém o valor da propriedade projectedServiceStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectedServiceStartTime() {
        return projectedServiceStartTime;
    }

    /**
     * Define o valor da propriedade projectedServiceStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectedServiceStartTime(XMLGregorianCalendar value) {
        this.projectedServiceStartTime = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopServiceWindowDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceableStopServiceWindowDetail> getServiceWindowDetails() {
        return serviceWindowDetails;
    }

    /**
     * Define o valor da propriedade serviceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopServiceWindowDetail }{@code >}
     *     
     */
    public void setServiceWindowDetails(JAXBElement<ArrayOfServiceableStopServiceWindowDetail> value) {
        this.serviceWindowDetails = value;
    }

}
