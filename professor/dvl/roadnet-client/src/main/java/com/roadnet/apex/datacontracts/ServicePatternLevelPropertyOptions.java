
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ServicePatternLevelPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServicePatternLevelPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PatternEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePatternLevelPropertyOptions", propOrder = {
    "minQuantity",
    "patternEntityKeys"
})
public class ServicePatternLevelPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "MinQuantity")
    protected Boolean minQuantity;
    @XmlElement(name = "PatternEntityKeys")
    protected Boolean patternEntityKeys;

    /**
     * Obtém o valor da propriedade minQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinQuantity() {
        return minQuantity;
    }

    /**
     * Define o valor da propriedade minQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinQuantity(Boolean value) {
        this.minQuantity = value;
    }

    /**
     * Obtém o valor da propriedade patternEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPatternEntityKeys() {
        return patternEntityKeys;
    }

    /**
     * Define o valor da propriedade patternEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPatternEntityKeys(Boolean value) {
        this.patternEntityKeys = value;
    }

}
