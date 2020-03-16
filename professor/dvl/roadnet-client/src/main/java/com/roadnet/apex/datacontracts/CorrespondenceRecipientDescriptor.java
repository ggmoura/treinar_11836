
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de CorrespondenceRecipientDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CorrespondenceRecipientDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondenceRecipientDescriptor", propOrder = {
    "activeOnly"
})
@XmlSeeAlso({
    CorrespondenceRecipientRegionDescriptor.class,
    CorrespondenceRecipientDepotDescriptor.class,
    CorrespondenceRecipientRouteDescriptor.class,
    CorrespondenceRecipientWorkerDescriptor.class,
    CorrespondenceRecipientMailingListDescriptor.class
})
public class CorrespondenceRecipientDescriptor
    extends DomainEntity
{

    @XmlElement(name = "ActiveOnly")
    protected Boolean activeOnly;

    /**
     * Obtém o valor da propriedade activeOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveOnly() {
        return activeOnly;
    }

    /**
     * Define o valor da propriedade activeOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveOnly(Boolean value) {
        this.activeOnly = value;
    }

}
