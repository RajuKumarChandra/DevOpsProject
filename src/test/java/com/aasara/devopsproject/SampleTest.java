/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aasara.devopsproject;

import junit.framework.TestCase;

/**
 *
 * @author kumara1
 */


public class SampleTest extends TestCase {

   
    public void testAdd(){
        assertEquals(9, Sample.add(5, 4));
    }
}
