
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.ArrayOfViewport;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de NetworkChangedAreas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkChangedAreas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangedAreas" type="{http://roadnet.com/apex/DataContracts/}ArrayOfViewport" minOccurs="0"/&gt;
 *         &lt;element name="LastChangedAreaEditTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkChangedAreas", propOrder = {
    "changedAreas",
    "lastChangedAreaEditTime"
})
public class NetworkChangedAreas
    extends DataTransferObject
{

    @XmlElementRef(name = "ChangedAreas", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfViewport> changedAreas;
    @XmlElementRef(name = "LastChangedAreaEditTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastChangedAreaEditTime;

    /**
     * Obtém o valor da propriedade changedAreas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfViewport }{@code >}
     *     
     */
    public JAXBElement<ArrayOfViewport> getChangedAreas() {
        return changedAreas;
    }

    /**
     * Define o valor da propriedade changedAreas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfViewport }{@code >}
     *     
     */
    public void setChangedAreas(JAXBElement<ArrayOfViewport> value) {
        this.changedAreas = value;
    }

    /**
     * Obtém o valor da propriedade lastChangedAreaEditTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastChangedAreaEditTime() {
        return lastChangedAreaEditTime;
    }

    /**
     * Define o valor da propriedade lastChangedAreaEditTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastChangedAreaEditTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastChangedAreaEditTime = value;
    }

}
