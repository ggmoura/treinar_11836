
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.NetworkArcPropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de MapNodePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MapNodePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachedArcs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AttachedArcsOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkArcPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapNodePropertyOptions", propOrder = {
    "attachedArcs",
    "attachedArcsOptions"
})
@XmlSeeAlso({
    IntersectionNodePropertyOptions.class,
    ImpasseNodePropertyOptions.class
})
public class MapNodePropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "AttachedArcs")
    protected Boolean attachedArcs;
    @XmlElementRef(name = "AttachedArcsOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArcPropertyOptions> attachedArcsOptions;

    /**
     * Obtém o valor da propriedade attachedArcs.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttachedArcs() {
        return attachedArcs;
    }

    /**
     * Define o valor da propriedade attachedArcs.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachedArcs(Boolean value) {
        this.attachedArcs = value;
    }

    /**
     * Obtém o valor da propriedade attachedArcsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkArcPropertyOptions> getAttachedArcsOptions() {
        return attachedArcsOptions;
    }

    /**
     * Define o valor da propriedade attachedArcsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}
     *     
     */
    public void setAttachedArcsOptions(JAXBElement<NetworkArcPropertyOptions> value) {
        this.attachedArcsOptions = value;
    }

}
