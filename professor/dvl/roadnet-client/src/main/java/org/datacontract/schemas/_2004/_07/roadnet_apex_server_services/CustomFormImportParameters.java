
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CustomFormImportParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomFormImportParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}ImportParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessUnitKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFormImportParameters", propOrder = {
    "businessUnitKey"
})
public class CustomFormImportParameters
    extends ImportParameters
{

    @XmlElement(name = "BusinessUnitKey")
    protected Long businessUnitKey;

    /**
     * Obtém o valor da propriedade businessUnitKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessUnitKey() {
        return businessUnitKey;
    }

    /**
     * Define o valor da propriedade businessUnitKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessUnitKey(Long value) {
        this.businessUnitKey = value;
    }

}
