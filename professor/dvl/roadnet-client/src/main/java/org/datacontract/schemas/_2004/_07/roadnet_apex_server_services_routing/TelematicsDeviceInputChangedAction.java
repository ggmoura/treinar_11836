
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TelematicsDeviceInputChangedAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelematicsDeviceInputChangedAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Input0Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input1Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input2Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input3Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input4Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input5Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input6Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelematicsDeviceInputChangedAction", propOrder = {
    "input0Value",
    "input1Value",
    "input2Value",
    "input3Value",
    "input4Value",
    "input5Value",
    "input6Value"
})
public class TelematicsDeviceInputChangedAction
    extends MobileDeviceAction
{

    @XmlElement(name = "Input0Value")
    protected Boolean input0Value;
    @XmlElement(name = "Input1Value")
    protected Boolean input1Value;
    @XmlElement(name = "Input2Value")
    protected Boolean input2Value;
    @XmlElement(name = "Input3Value")
    protected Boolean input3Value;
    @XmlElement(name = "Input4Value")
    protected Boolean input4Value;
    @XmlElement(name = "Input5Value")
    protected Boolean input5Value;
    @XmlElement(name = "Input6Value")
    protected Boolean input6Value;

    /**
     * Obtém o valor da propriedade input0Value.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput0Value() {
        return input0Value;
    }

    /**
     * Define o valor da propriedade input0Value.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput0Value(Boolean value) {
        this.input0Value = value;
    }

    /**
     * Obtém o valor da propriedade input1Value.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput1Value() {
        return input1Value;
    }

    /**
     * Define o valor da propriedade input1Value.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput1Value(Boolean value) {
        this.input1Value = value;
    }

    /**
     * Obtém o valor da propriedade input2Value.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput2Value() {
        return input2Value;
    }

    /**
     * Define o valor da propriedade input2Value.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput2Value(Boolean value) {
        this.input2Value = value;
    }

    /**
     * Obtém o valor da propriedade input3Value.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput3Value() {
        return input3Value;
    }

    /**
     * Define o valor da propriedade input3Value.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput3Value(Boolean value) {
        this.input3Value = value;
    }

    /**
     * Obtém o valor da propriedade input4Value.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput4Value() {
        return input4Value;
    }

    /**
     * Define o valor da propriedade input4Value.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput4Value(Boolean value) {
        this.input4Value = value;
    }

    /**
     * Obtém o valor da propriedade input5Value.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput5Value() {
        return input5Value;
    }

    /**
     * Define o valor da propriedade input5Value.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput5Value(Boolean value) {
        this.input5Value = value;
    }

    /**
     * Obtém o valor da propriedade input6Value.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput6Value() {
        return input6Value;
    }

    /**
     * Define o valor da propriedade input6Value.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput6Value(Boolean value) {
        this.input6Value = value;
    }

}
