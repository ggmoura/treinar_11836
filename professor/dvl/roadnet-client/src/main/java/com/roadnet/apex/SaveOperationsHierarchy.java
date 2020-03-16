
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operationsUnits" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operationsUnits"
})
@XmlRootElement(name = "SaveOperationsHierarchy")
public class SaveOperationsHierarchy {

    @XmlElementRef(name = "operationsUnits", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi> operationsUnits;

    /**
     * Obtém o valor da propriedade operationsUnits.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi> getOperationsUnits() {
        return operationsUnits;
    }

    /**
     * Define o valor da propriedade operationsUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi }{@code >}
     *     
     */
    public void setOperationsUnits(JAXBElement<ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi> value) {
        this.operationsUnits = value;
    }

}
