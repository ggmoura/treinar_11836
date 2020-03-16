
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Quantities complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Quantities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Size1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Size2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Size3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantities", propOrder = {
    "size1",
    "size2",
    "size3"
})
public class Quantities
    extends DataTransferObject
{

    @XmlElement(name = "Size1")
    protected Double size1;
    @XmlElement(name = "Size2")
    protected Double size2;
    @XmlElement(name = "Size3")
    protected Double size3;

    /**
     * Obtém o valor da propriedade size1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSize1() {
        return size1;
    }

    /**
     * Define o valor da propriedade size1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSize1(Double value) {
        this.size1 = value;
    }

    /**
     * Obtém o valor da propriedade size2.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSize2() {
        return size2;
    }

    /**
     * Define o valor da propriedade size2.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSize2(Double value) {
        this.size2 = value;
    }

    /**
     * Obtém o valor da propriedade size3.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSize3() {
        return size3;
    }

    /**
     * Define o valor da propriedade size3.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSize3(Double value) {
        this.size3 = value;
    }

}
