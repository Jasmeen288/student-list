/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author mydev
 */
public class Cylinder extends Circle {//cylinder ias a subclass
    public double height ;
    public Cylinder()
    {   super();//to call superclass no arg constructor
    
        height=5.5;
    } 
    public double areaCylinder()
    {
        return(2*3.14*radius*height)+(2*areaCircle());
        
    }
    public String toStruing(
            {
                return super.toString(+"height+"area of cylinder());
            })
    
}
