
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RetrievalResults;


/**
 * <p>Classe Java de LocationCommentResults complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LocationCommentResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RetrievalResults"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationComments" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts}ArrayOfLocationCommentInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCommentResults", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", propOrder = {
    "locationComments"
})
public class LocationCommentResults
    extends RetrievalResults
{

    @XmlElementRef(name = "LocationComments", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLocationCommentInfo> locationComments;

    /**
     * Obtém o valor da propriedade locationComments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLocationCommentInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLocationCommentInfo> getLocationComments() {
        return locationComments;
    }

    /**
     * Define o valor da propriedade locationComments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLocationCommentInfo }{@code >}
     *     
     */
    public void setLocationComments(JAXBElement<ArrayOfLocationCommentInfo> value) {
        this.locationComments = value;
    }

}
