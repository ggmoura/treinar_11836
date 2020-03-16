
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CorrespondenceAttachment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CorrespondenceAttachment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}FileAttachment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorrespondenceGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondenceAttachment", propOrder = {
    "correspondenceGuid"
})
public class CorrespondenceAttachment
    extends FileAttachment
{

    @XmlElement(name = "CorrespondenceGuid")
    protected String correspondenceGuid;

    /**
     * Obtém o valor da propriedade correspondenceGuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceGuid() {
        return correspondenceGuid;
    }

    /**
     * Define o valor da propriedade correspondenceGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceGuid(String value) {
        this.correspondenceGuid = value;
    }

}
