
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ImmutableObject;


/**
 * <p>Classe Java de TimeOfWeek complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TimeOfWeek"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}ImmutableObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElapsedMilliseconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeOfWeek", propOrder = {
    "elapsedMilliseconds"
})
public class TimeOfWeek
    extends ImmutableObject
{

    @XmlElement(name = "ElapsedMilliseconds")
    protected Integer elapsedMilliseconds;

    /**
     * Obtém o valor da propriedade elapsedMilliseconds.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElapsedMilliseconds() {
        return elapsedMilliseconds;
    }

    /**
     * Define o valor da propriedade elapsedMilliseconds.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElapsedMilliseconds(Integer value) {
        this.elapsedMilliseconds = value;
    }

}
