
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ArrayOfDimensionDescriber;


/**
 * <p>Classe Java de Grouping complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Grouping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DimensionDescribers" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDimensionDescriber" minOccurs="0"/&gt;
 *         &lt;element name="GroupByRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GroupByTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grouping", propOrder = {
    "dimensionDescribers",
    "groupByRoute",
    "groupByTransaction"
})
public class Grouping
    extends DataTransferObject
{

    @XmlElementRef(name = "DimensionDescribers", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDimensionDescriber> dimensionDescribers;
    @XmlElement(name = "GroupByRoute")
    protected Boolean groupByRoute;
    @XmlElement(name = "GroupByTransaction")
    protected Boolean groupByTransaction;

    /**
     * Obtém o valor da propriedade dimensionDescribers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionDescriber }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDimensionDescriber> getDimensionDescribers() {
        return dimensionDescribers;
    }

    /**
     * Define o valor da propriedade dimensionDescribers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionDescriber }{@code >}
     *     
     */
    public void setDimensionDescribers(JAXBElement<ArrayOfDimensionDescriber> value) {
        this.dimensionDescribers = value;
    }

    /**
     * Obtém o valor da propriedade groupByRoute.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupByRoute() {
        return groupByRoute;
    }

    /**
     * Define o valor da propriedade groupByRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupByRoute(Boolean value) {
        this.groupByRoute = value;
    }

    /**
     * Obtém o valor da propriedade groupByTransaction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupByTransaction() {
        return groupByTransaction;
    }

    /**
     * Define o valor da propriedade groupByTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupByTransaction(Boolean value) {
        this.groupByTransaction = value;
    }

}
