/**
 * Copyright (c) 2009
 * Philipp Giese, Sven Wagner-Boysen
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.hpi.bpmn2_0.model.event;

import de.hpi.bpmn2_0.model.Definitions;
import de.hpi.bpmn2_0.model.RootElement;
import de.hpi.bpmn2_0.model.misc.Signal;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for tSignalEventDefinition complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="tSignalEventDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/bpmn20}tEventDefinition">
 *       &lt;attribute name="signalRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSignalEventDefinition")
public class SignalEventDefinition
        extends EventDefinition {

    @XmlAttribute
    @XmlIDREF
    protected Signal signalRef;

    /**
     * Put Signal into the {@link RootElement} list.
     *
     * @param definitions
     */
    public void insertSignalIntoDefinitions(Definitions definitions) {
        definitions.getRootElement().add(signalRef);
    }

    /* Getter & Setter */

    /**
     * Gets the value of the signalRef property.
     *
     * @return possible object is
     *         {@link Signal }
     */
    public Signal getSignalRef() {
        return signalRef;
    }

    /**
     * Sets the value of the signalRef property.
     *
     * @param value allowed object is
     *              {@link Signal }
     */
    public void setSignalRef(Signal value) {
        this.signalRef = value;
    }

}
