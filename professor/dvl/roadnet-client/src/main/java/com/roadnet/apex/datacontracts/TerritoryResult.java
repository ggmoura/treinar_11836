
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de TerritoryResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TerritoryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Deltas" type="{http://roadnet.com/apex/DataContracts/}TerritoryDeltas" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerritoryResult", propOrder = {
    "deltas",
    "territoryEntityKey"
})
public class TerritoryResult
    extends DataTransferObject
{

    @XmlElementRef(name = "Deltas", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TerritoryDeltas> deltas;
    @XmlElement(name = "TerritoryEntityKey")
    protected Long territoryEntityKey;

    /**
     * Obtém o valor da propriedade deltas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerritoryDeltas }{@code >}
     *     
     */
    public JAXBElement<TerritoryDeltas> getDeltas() {
        return deltas;
    }

    /**
     * Define o valor da propriedade deltas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerritoryDeltas }{@code >}
     *     
     */
    public void setDeltas(JAXBElement<TerritoryDeltas> value) {
        this.deltas = value;
    }

    /**
     * Obtém o valor da propriedade territoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTerritoryEntityKey() {
        return territoryEntityKey;
    }

    /**
     * Define o valor da propriedade territoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTerritoryEntityKey(Long value) {
        this.territoryEntityKey = value;
    }

}
