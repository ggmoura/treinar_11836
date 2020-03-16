
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BinaryExpressionBase complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BinaryExpressionBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}SimpleExpressionBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Left" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}SimpleExpressionBase" minOccurs="0"/&gt;
 *         &lt;element name="Right" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}SimpleExpressionBase" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryExpressionBase", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", propOrder = {
    "left",
    "right"
})
@XmlSeeAlso({
    ArithmeticExpressionBase.class,
    ComparisonExpressionBase.class
})
public class BinaryExpressionBase
    extends SimpleExpressionBase
{

    @XmlElementRef(name = "Left", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleExpressionBase> left;
    @XmlElementRef(name = "Right", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleExpressionBase> right;

    /**
     * Obtém o valor da propriedade left.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public JAXBElement<SimpleExpressionBase> getLeft() {
        return left;
    }

    /**
     * Define o valor da propriedade left.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public void setLeft(JAXBElement<SimpleExpressionBase> value) {
        this.left = value;
    }

    /**
     * Obtém o valor da propriedade right.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public JAXBElement<SimpleExpressionBase> getRight() {
        return right;
    }

    /**
     * Define o valor da propriedade right.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public void setRight(JAXBElement<SimpleExpressionBase> value) {
        this.right = value;
    }

}
