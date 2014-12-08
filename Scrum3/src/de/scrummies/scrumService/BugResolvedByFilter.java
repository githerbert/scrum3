
package de.scrummies.scrumService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BugResolvedByFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BugResolvedByFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fuldaai.de}BugFilter">
 *       &lt;sequence>
 *         &lt;element name="LikeSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ResolvedBy" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BugResolvedByFilter", namespace = "http://www.fuldaai.de", propOrder = {
    "likeSearch",
    "resolvedBy"
})
public class BugResolvedByFilter
    extends BugFilter
{

    @XmlElement(name = "LikeSearch")
    protected Boolean likeSearch;
    @XmlElementRef(name = "ResolvedBy", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> resolvedBy;

    /**
     * Gets the value of the likeSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLikeSearch() {
        return likeSearch;
    }

    /**
     * Sets the value of the likeSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLikeSearch(Boolean value) {
        this.likeSearch = value;
    }

    /**
     * Gets the value of the resolvedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getResolvedBy() {
        return resolvedBy;
    }

    /**
     * Sets the value of the resolvedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setResolvedBy(JAXBElement<ArrayOfstring> value) {
        this.resolvedBy = value;
    }

}
