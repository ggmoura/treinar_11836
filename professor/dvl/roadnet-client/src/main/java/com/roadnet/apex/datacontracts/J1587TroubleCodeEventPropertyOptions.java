
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de J1587TroubleCodeEventPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="J1587TroubleCodeEventPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}DiagnosticTroubleCodeEventPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OccurrenceCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "J1587TroubleCodeEventPropertyOptions", propOrder = {
    "occurrenceCount"
})
public class J1587TroubleCodeEventPropertyOptions
    extends DiagnosticTroubleCodeEventPropertyOptions
{

    @XmlElement(name = "OccurrenceCount")
    protected Boolean occurrenceCount;

    /**
     * Obtém o valor da propriedade occurrenceCount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOccurrenceCount() {
        return occurrenceCount;
    }

    /**
     * Define o valor da propriedade occurrenceCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOccurrenceCount(Boolean value) {
        this.occurrenceCount = value;
    }

}
