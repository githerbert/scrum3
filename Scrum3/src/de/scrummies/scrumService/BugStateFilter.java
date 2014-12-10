
package de.scrummies.scrumService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BugStateFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BugStateFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fuldaai.de}BugFilter">
 *       &lt;sequence>
 *         &lt;element name="BugStates" type="{http://www.fuldaai.de}ArrayOfBugState" minOccurs="0"/>
 *         &lt;element name="BugStatesExclude" type="{http://www.fuldaai.de}ArrayOfBugState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BugStateFilter", namespace = "http://www.fuldaai.de", propOrder = {
    "bugStates",
    "bugStatesExclude"
})
public class BugStateFilter
    extends BugFilter
{

    @XmlElementRef(name = "BugStates", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBugState> bugStates;
    @XmlElementRef(name = "BugStatesExclude", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBugState> bugStatesExclude;

    /**
     * Gets the value of the bugStates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBugState }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBugState> getBugStates() {
        return bugStates;
    }

    /**
     * Sets the value of the bugStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBugState }{@code >}
     *     
     */
    public void setBugStates(JAXBElement<ArrayOfBugState> value) {
        this.bugStates = value;
    }

    /**
     * Gets the value of the bugStatesExclude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBugState }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBugState> getBugStatesExclude() {
        return bugStatesExclude;
    }

    /**
     * Sets the value of the bugStatesExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBugState }{@code >}
     *     
     */
    public void setBugStatesExclude(JAXBElement<ArrayOfBugState> value) {
        this.bugStatesExclude = value;
    }

}
