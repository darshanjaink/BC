/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author gibs
 */
public class DateTimeUtil {
  
        private static String DefaultDateformat = "dd-MM-yyyy";   
        //Input String Format
        public static Date StringToDateTime(String dateString, String DateFormat) throws Exception
        {
            try{
            DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
            Date date = format.parse(dateString);
            return date;
            }catch(Exception ex)
            {
                throw ex;
            }
        }
        
        //Input string format must want to be 'DefaultDateformat'
        public static Date StringToDate(String dateString) throws Exception
        {
            try{
            DateFormat format = new SimpleDateFormat(DefaultDateformat, Locale.ENGLISH);
            Date date = format.parse(dateString);
            return date;
            }catch(Exception ex)
            {
                throw ex;
            }
        }
     
}


