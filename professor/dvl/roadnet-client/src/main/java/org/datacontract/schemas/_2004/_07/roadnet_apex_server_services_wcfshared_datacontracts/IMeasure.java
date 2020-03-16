
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de IMeasure complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IMeasure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsAbsoluteMeasure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSortingMeasure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMeasure", propOrder = {
    "isAbsoluteMeasure",
    "isSortingMeasure"
})
@XmlSeeAlso({
    UserDefinedMeasure.class,
    AtomicMeasure.class,
    CompositeMeasure.class,
    DayCountMeasure.class,
    MultiMeasure.class,
    PredefinedCompositeMeasure.class,
    ScoreMeasure.class,
    SecondaryDimensionCountMeasure.class,
    ValueMeasure.class
})
public class IMeasure
    extends DataTransferObject
{

    @XmlElement(name = "IsAbsoluteMeasure")
    protected Boolean isAbsoluteMeasure;
    @XmlElement(name = "IsSortingMeasure")
    protected Boolean isSortingMeasure;

    /**
     * Obtém o valor da propriedade isAbsoluteMeasure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAbsoluteMeasure() {
        return isAbsoluteMeasure;
    }

    /**
     * Define o valor da propriedade isAbsoluteMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAbsoluteMeasure(Boolean value) {
        this.isAbsoluteMeasure = value;
    }

    /**
     * Obtém o valor da propriedade isSortingMeasure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSortingMeasure() {
        return isSortingMeasure;
    }

    /**
     * Define o valor da propriedade isSortingMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSortingMeasure(Boolean value) {
        this.isSortingMeasure = value;
    }

}
