//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// NullResult.java Copyright (c) 2009 Giovanni Azua Garcia
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
package j05Patterns.behavioral;

import j05Patterns.creational.ISingleton;

/**
 * Null Object Pattern implementation of Command <code>Result</code>. 
 * Prevents different <code>Receiver</code> implementations from pushing 
 * <code>null</code> back into the <code>Command</code>'s result value.
 * <br/><br/>
 * <code>NullResult</code> is a Singleton therefore it can not be directly 
 * instantiated, neither it may be extended.
 * <br/><br/>
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Jun 19, 2007 10:17:38 PM $
 */
public final
class NullResult
implements ISingleton
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Returns Singleton instance of <code>NullResult</code>.
     * 
     * @return Singleton instance of <code>NullResult</code>.
     */
    public static NullResult
    getInstance()
    {
        return INSTANCE;
    }
    
    //------------------------------------------------------------------------
    // private
    //------------------------------------------------------------------------
    private 
    NullResult()
    {        
        // do nothing
    }
    
    //------------------------------------------------------------------------
    // members
    //------------------------------------------------------------------------
    /**
     * Singleton instance of <code>NullResult</code>
     */
    private static final NullResult INSTANCE = new NullResult(); 
}
