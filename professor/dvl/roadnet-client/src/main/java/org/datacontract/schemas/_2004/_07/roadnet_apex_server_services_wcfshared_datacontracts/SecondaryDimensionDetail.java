
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SecondaryDimensionDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SecondaryDimensionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DimensionDetail"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryDimensionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryDimensionDetail", propOrder = {
    "display",
    "secondaryDimensionKey",
    "text"
})
public class SecondaryDimensionDetail
    extends DimensionDetail
{

    @XmlElementRef(name = "Display", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> display;
    @XmlElement(name = "SecondaryDimensionKey")
    protected Long secondaryDimensionKey;
    @XmlElementRef(name = "Text", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;

    /**
     * Obtém o valor da propriedade display.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplay() {
        return display;
    }

    /**
     * Define o valor da propriedade display.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplay(JAXBElement<String> value) {
        this.display = value;
    }

    /**
     * Obtém o valor da propriedade secondaryDimensionKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSecondaryDimensionKey() {
        return secondaryDimensionKey;
    }

    /**
     * Define o valor da propriedade secondaryDimensionKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSecondaryDimensionKey(Long value) {
        this.secondaryDimensionKey = value;
    }

    /**
     * Obtém o valor da propriedade text.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getText() {
        return text;
    }

    /**
     * Define o valor da propriedade text.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setText(JAXBElement<String> value) {
        this.text = value;
    }

}
