
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SearchResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResult")
@XmlSeeAlso({
    EquipmentSearchResult.class,
    LocationSearchResult.class,
    OrderSearchResult.class,
    PackageTypeSearchResult.class,
    RouteSearchResult.class,
    RouteTemplateSearchResult.class,
    ServiceableStopSearchResult.class,
    ServiceableStopTemplateSearchResult.class,
    SharingUserGroupSearchResult.class,
    SkuSearchResult.class,
    TelematicsDeviceSearchResult.class,
    UnassignedOrderGroupSearchResult.class,
    UserSearchResult.class,
    WorkerSearchResult.class
})
public class SearchResult
    extends DataTransferObject
{


}
