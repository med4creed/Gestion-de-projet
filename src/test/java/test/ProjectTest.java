/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import programme.Project;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author matailia
 */

public class ProjectTest {

    @Test
    public void test(){

        Project projectA= new Project();
        Assert.assertNotNull(projectA);
    }
}
