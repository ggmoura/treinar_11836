
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSortingDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSortingDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SortingDetail" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared}SortingDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSortingDetail", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", propOrder = {
    "sortingDetail"
})
public class ArrayOfSortingDetail {

    @XmlElement(name = "SortingDetail", nillable = true)
    protected List<SortingDetail> sortingDetail;

    /**
     * Gets the value of the sortingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortingDetail }
     * 
     * 
     */
    public List<SortingDetail> getSortingDetail() {
        if (sortingDetail == null) {
            sortingDetail = new ArrayList<SortingDetail>();
        }
        return this.sortingDetail;
    }

}
