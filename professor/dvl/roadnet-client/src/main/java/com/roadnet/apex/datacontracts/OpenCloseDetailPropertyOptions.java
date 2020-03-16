
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OpenCloseDetailPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OpenCloseDetailPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}TimeWindowDetailPropertyOptions"&gt;
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
@XmlType(name = "OpenCloseDetailPropertyOptions")
@XmlSeeAlso({
    OrderClassifiedOpenCloseDetailPropertyOptions.class
})
public class OpenCloseDetailPropertyOptions
    extends TimeWindowDetailPropertyOptions
{


}
