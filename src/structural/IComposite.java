//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// IComposite.java Copyright (c) 2009 Giovanni Azua Garcia
// bravegag@hotmail.com
//  
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 3
// of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, see <http://www.gnu.org/licenses/>.
//
//----------------------------------------------------------------------
package j05Patterns.structural;

import java.util.*;

/**
 * <b>Composite Design Pattern</b>: Compose objects into tree structures to 
 * represent part-whole hierarchies. Composite lets clients treat individual 
 * objects and compositions of objects uniformly. (Gamma et al, Design Patterns)
 * <br/><br/>
 * 
 * <b>Responsibility</b> Abstract definition of the "Composite": <br/>
 * <br/>
 * <ul>
 * <li>defines behavior for components having children.</li> 
 * <li>stores child components.</li>
 * <li>implements child-related operations in the Component interface.</li>
 * </ul>
 * 
 * <br/>
 * Example usage:
 * <pre><code>
 *   //
 *   // Define a Component type interface (or use an existing one).
 *   //
 *   interface IComponent
 *   {
 *       //--------------------------------------------------------------------
 *       public void 
 *       printValue(String aValue);
 *   }
 *   
 *   //
 *   // Implement a simple component. 
 *   //
 *   class Component
 *   implements IComponent
 *   {
 *       //--------------------------------------------------------------------
 *       public void 
 *       printValue(String aValue)
 *       {
 *           System.out.println(aValue);
 *       }        
 *   }
 *
 *   // create four Component instances
 *   IComponent myComponent1 = new Component();
 *   IComponent myComponent2 = new Component();
 *   IComponent myComponent3 = new Component();
 *   IComponent myComponent4 = new Component();
 *               
 *   // create Composite instance 1
 *   IComposite&lt;IComponent&gt; myComposite1 = 
 *      new Composite&lt;IComponent&gt;(IComponent.class);  
 *
 *   // create Composite instance 2
 *   IComposite&lt;IComponent&gt; myComposite2 = 
 *      new Composite&lt;IComponent&gt;(IComponent.class);  
 *
 *   // build compositions
 *   myComposite1.addAll(myComponent1, myComponent2);
 *   
 *   // also nest compositions
 *   myComposite2.addAll(myComponent3, myComponent4, myComposite1.
 *      getComponent());
 *        
 *   // call method on the Composite Component view that triggers 
 *   // execution over the complete composition
 *   myComposite2.getComponent().printValue("Hello World!");
 *   
 * </code></pre>
 * 
 * @param <C> Component element type
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Nov 18, 2007 9:51:14 PM $
 */
public 
interface IComposite<C>
extends ISurrogate<C>, List<C>
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Appends all of the elements in the specified array to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator (optional operation).  The behavior of this
     * operation is undefined if the specified collection is modified while
     * the operation is in progress.  (Note that this will occur if the
     * specified collection is this list, and it's nonempty.)
     *
     * @param anElements Array containing elements to be added to this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>addAll</tt> operation
     *         is not supported by this list
     * @throws IllegalArgumentException if the specified collection contains one
     *         or more null elements, or if the specified collection is null
     * @throws IllegalArgumentException if some property of an element of the
     *         specified collection prevents it from being added to this list
     * @throws IllegalArgumentException 'anElements' must not be null
     * @throws IllegalArgumentException 'anElements' must not be empty
     * @throws IllegalArgumentException 'anElements' must not contain null 
     *         Elements
     * @see #add(Object)
     */
    public boolean
    addAll(C ... anElements)
    throws IllegalArgumentException;    
}
