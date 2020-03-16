
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ScorecardKpiMeasurePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ScorecardKpiMeasurePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}KpiMeasureBasePropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardKpiMeasurePropertyOptions", propOrder = {
    "criteria"
})
public class ScorecardKpiMeasurePropertyOptions
    extends KpiMeasureBasePropertyOptions
{

    @XmlElement(name = "Criteria")
    protected Boolean criteria;

    /**
     * Obtém o valor da propriedade criteria.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCriteria() {
        return criteria;
    }

    /**
     * Define o valor da propriedade criteria.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCriteria(Boolean value) {
        this.criteria = value;
    }

}
