
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NumericDimensionMetadata complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NumericDimensionMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}DimensionMetadata"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Precision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericDimensionMetadata", propOrder = {
    "max",
    "min",
    "name",
    "precision"
})
public class NumericDimensionMetadata
    extends DimensionMetadata
{

    @XmlElementRef(name = "Max", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> max;
    @XmlElementRef(name = "Min", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> min;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Precision", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> precision;

    /**
     * Obtém o valor da propriedade max.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMax() {
        return max;
    }

    /**
     * Define o valor da propriedade max.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMax(JAXBElement<Double> value) {
        this.max = value;
    }

    /**
     * Obtém o valor da propriedade min.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMin() {
        return min;
    }

    /**
     * Define o valor da propriedade min.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMin(JAXBElement<Double> value) {
        this.min = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade precision.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrecision() {
        return precision;
    }

    /**
     * Define o valor da propriedade precision.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrecision(JAXBElement<Integer> value) {
        this.precision = value;
    }

}
