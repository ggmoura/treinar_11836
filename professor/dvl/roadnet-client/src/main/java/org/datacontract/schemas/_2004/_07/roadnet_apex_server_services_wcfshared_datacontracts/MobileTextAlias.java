
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RegionBasedAggregateRootEntity;


/**
 * <p>Classe Java de MobileTextAlias complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MobileTextAlias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AliasKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AliasText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileTextAlias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", propOrder = {
    "aliasKey",
    "aliasText"
})
public class MobileTextAlias
    extends RegionBasedAggregateRootEntity
{

    @XmlElementRef(name = "AliasKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aliasKey;
    @XmlElementRef(name = "AliasText", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aliasText;

    /**
     * Obtém o valor da propriedade aliasKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAliasKey() {
        return aliasKey;
    }

    /**
     * Define o valor da propriedade aliasKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAliasKey(JAXBElement<String> value) {
        this.aliasKey = value;
    }

    /**
     * Obtém o valor da propriedade aliasText.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAliasText() {
        return aliasText;
    }

    /**
     * Define o valor da propriedade aliasText.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAliasText(JAXBElement<String> value) {
        this.aliasText = value;
    }

}
