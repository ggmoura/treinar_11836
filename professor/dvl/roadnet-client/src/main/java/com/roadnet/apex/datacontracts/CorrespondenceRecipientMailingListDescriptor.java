
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CorrespondenceRecipientMailingListDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CorrespondenceRecipientMailingListDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}CorrespondenceRecipientDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailingListEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondenceRecipientMailingListDescriptor", propOrder = {
    "mailingListEntityKey"
})
public class CorrespondenceRecipientMailingListDescriptor
    extends CorrespondenceRecipientDescriptor
{

    @XmlElement(name = "MailingListEntityKey")
    protected Long mailingListEntityKey;

    /**
     * Obtém o valor da propriedade mailingListEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMailingListEntityKey() {
        return mailingListEntityKey;
    }

    /**
     * Define o valor da propriedade mailingListEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMailingListEntityKey(Long value) {
        this.mailingListEntityKey = value;
    }

}
