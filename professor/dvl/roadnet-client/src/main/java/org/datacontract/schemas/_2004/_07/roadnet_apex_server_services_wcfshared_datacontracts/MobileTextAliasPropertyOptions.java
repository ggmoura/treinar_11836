
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RegionBasedAggregateRootEntityPropertyOptions;


/**
 * <p>Classe Java de MobileTextAliasPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MobileTextAliasPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AliasKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AliasText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileTextAliasPropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", propOrder = {
    "aliasKey",
    "aliasText"
})
public class MobileTextAliasPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "AliasKey")
    protected Boolean aliasKey;
    @XmlElement(name = "AliasText")
    protected Boolean aliasText;

    /**
     * Obtém o valor da propriedade aliasKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAliasKey() {
        return aliasKey;
    }

    /**
     * Define o valor da propriedade aliasKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAliasKey(Boolean value) {
        this.aliasKey = value;
    }

    /**
     * Obtém o valor da propriedade aliasText.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAliasText() {
        return aliasText;
    }

    /**
     * Define o valor da propriedade aliasText.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAliasText(Boolean value) {
        this.aliasText = value;
    }

}
