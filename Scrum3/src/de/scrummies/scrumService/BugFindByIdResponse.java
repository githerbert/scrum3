
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
 *         &lt;element name="BugFindByIdResult" type="{http://www.fuldaai.de}Bug" minOccurs="0"/>
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
    "bugFindByIdResult"
})
@XmlRootElement(name = "BugFindByIdResponse")
public class BugFindByIdResponse {

    @XmlElementRef(name = "BugFindByIdResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Bug> bugFindByIdResult;

    /**
     * Gets the value of the bugFindByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Bug }{@code >}
     *     
     */
    public JAXBElement<Bug> getBugFindByIdResult() {
        return bugFindByIdResult;
    }

    /**
     * Sets the value of the bugFindByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Bug }{@code >}
     *     
     */
    public void setBugFindByIdResult(JAXBElement<Bug> value) {
        this.bugFindByIdResult = value;
    }

}
