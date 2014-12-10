
package de.scrummies.scrumService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBugState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBugState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BugState" type="{http://www.fuldaai.de}BugState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBugState", namespace = "http://www.fuldaai.de", propOrder = {
    "bugState"
})
public class ArrayOfBugState {

    @XmlElement(name = "BugState")
    protected List<BugState> bugState;

    /**
     * Gets the value of the bugState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bugState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBugState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BugState }
     * 
     * 
     */
    public List<BugState> getBugState() {
        if (bugState == null) {
            bugState = new ArrayList<BugState>();
        }
        return this.bugState;
    }

}
