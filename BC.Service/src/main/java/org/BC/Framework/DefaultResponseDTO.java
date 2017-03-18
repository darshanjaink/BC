/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Framework;

/**
 *
 * @author gibs
 */
public class DefaultResponseDTO {
    

    public Boolean IsAnyException=false;
    
    //Unique Code for the message
    public int ResponseMessageCode;
    
    //Message which display back to end user
    public String UserMessage;
  
    //User message in what format,
    //public String LOCALID;
    
    //IsLocalisedMessage =true => Message Localised ,no need to convert
    //public Boolean IsLocalisedMessage;
    
    //for detail debugg
    public String InternalMessage;
    //URL for refferance
    public String MoreInfo;
    public int HTTPResponseCode;
    
    public void SetErrorMessage(APErrors AppError)
    {
        this.IsAnyException=true;
        this.UserMessage=AppError.toString();
        this.ResponseMessageCode=AppError.getCode();
    }
}
