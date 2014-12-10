
package de.scrummies.scrumService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BugFindAllResult" type="{http://www.fuldaai.de}ArrayOfBug" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bugFindAllResult"
})
@XmlRootElement(name = "BugFindAllResponse")
public class BugFindAllResponse {

    @XmlElementRef(name = "BugFindAllResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBug> bugFindAllResult;

    /**
     * Gets the value of the bugFindAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBug }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBug> getBugFindAllResult() {
        return bugFindAllResult;
    }

    /**
     * Sets the value of the bugFindAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBug }{@code >}
     *     
     */
    public void setBugFindAllResult(JAXBElement<ArrayOfBug> value) {
        this.bugFindAllResult = value;
    }

}
