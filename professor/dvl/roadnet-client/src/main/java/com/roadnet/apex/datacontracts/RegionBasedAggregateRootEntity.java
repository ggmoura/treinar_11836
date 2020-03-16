
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.MobileScreenConfiguration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.MobileTextAlias;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.WorkerLogEvent;


/**
 * <p>Classe Java de RegionBasedAggregateRootEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RegionBasedAggregateRootEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionBasedAggregateRootEntity", propOrder = {
    "regionEntityKey"
})
@XmlSeeAlso({
    Route.class,
    RouteTemplate.class,
    PerformanceMonitoringData.class,
    Cell.class,
    CellSet.class,
    SignatureCapture.class,
    TelematicsPosition.class,
    CustomFormResponse.class,
    ResourceEventSet.class,
    ScorecardTemplate.class,
    OrderBase.class,
    Territory.class,
    Pass.class,
    PassTemplate.class,
    ResourceException.class,
    ResourceExceptionRule.class,
    RouteNote.class,
    RouteTemplateSet.class,
    RoutingSession.class,
    UnassignedOrderGroup.class,
    ServiceLocationSubstitution.class,
    WorkerLogEvent.class,
    MobileTextAlias.class,
    MobileScreenConfiguration.class
})
public class RegionBasedAggregateRootEntity
    extends AggregateRootEntity
{

    @XmlElement(name = "RegionEntityKey")
    protected Long regionEntityKey;

    /**
     * Obtém o valor da propriedade regionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegionEntityKey() {
        return regionEntityKey;
    }

    /**
     * Define o valor da propriedade regionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegionEntityKey(Long value) {
        this.regionEntityKey = value;
    }

}
