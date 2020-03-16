
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OperationsUnitDimensionDescriber complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OperationsUnitDimensionDescriber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DimensionDescriber"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LevelEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OperationsUnitGranularity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsUnitDimensionDescriber", propOrder = {
    "levelEntityKey",
    "operationsUnitGranularity"
})
public class OperationsUnitDimensionDescriber
    extends DimensionDescriber
{

    @XmlElement(name = "LevelEntityKey")
    protected Long levelEntityKey;
    @XmlElement(name = "OperationsUnitGranularity")
    protected Integer operationsUnitGranularity;

    /**
     * Obtém o valor da propriedade levelEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLevelEntityKey() {
        return levelEntityKey;
    }

    /**
     * Define o valor da propriedade levelEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLevelEntityKey(Long value) {
        this.levelEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade operationsUnitGranularity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationsUnitGranularity() {
        return operationsUnitGranularity;
    }

    /**
     * Define o valor da propriedade operationsUnitGranularity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationsUnitGranularity(Integer value) {
        this.operationsUnitGranularity = value;
    }

}
