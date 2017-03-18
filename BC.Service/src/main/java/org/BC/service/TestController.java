
package org.BC.service;

/**
 *
 * @author gibs
 */



import org.BC.DTO.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    
    @RequestMapping(value="/hello", method = RequestMethod.GET, produces="application/json")
    public @ResponseBody RestTestDTO getTest1(){
        RestTestDTO oRestTestDTO = new RestTestDTO();
        oRestTestDTO.setId(1);
        oRestTestDTO.setName("haii");
        return oRestTestDTO;
    }
    
    @RequestMapping(value="/hello/{id}/{name}", method = RequestMethod.GET, produces="application/json")
    public @ResponseBody RestTestDTO getTest2(@PathVariable int id, @PathVariable String name){
        RestTestDTO flower = new RestTestDTO();
        flower.setId(id);
        flower.setName(name);
        return flower;
    }
    
    @RequestMapping(value="/helloqry", method = RequestMethod.GET, produces="application/json")
    public @ResponseBody RestTestDTO getTest3(@RequestParam(required = false, value = "sortby") String sortBy,
            @RequestParam(required = false, value = "Name") String Name){
        RestTestDTO flower = new RestTestDTO();
        flower.setId(1);
        String msg ="From Server , sortby ww: '" + sortBy + "' , Name : '" +Name+"'";
        flower.setName(msg);
         return flower;
    }
    
    
    
    
   @RequestMapping(value="/hellopost1", method = RequestMethod.POST, produces="application/json")
    public @ResponseBody RestTestDTO PostTest1(){
        RestTestDTO flower = new RestTestDTO();
        flower.setId(1);
        flower.setName("simple post : no input parm");
        return flower;
    }
    
    
      //@RequestMapping(value = "/flowerpost2", method = RequestMethod.POST, produces = "application/json", consumes="application/json")
    @RequestMapping(value = "/hellopost2", method = RequestMethod.POST)
    public @ResponseBody RestTestDTO PostTest2 (@RequestBody String  Name) {
        RestTestDTO flower = new RestTestDTO();
        flower.setId(1);
         flower.setName(Name + ":  From Server resp");
         return flower;
    }
    
    
   //@RequestMapping(value = "/flowerpost2", method = RequestMethod.POST, produces = "application/json", consumes="application/json")
    @RequestMapping(value = "/hellopost3", method = RequestMethod.POST)
    public @ResponseBody RestTestDTO PostTest3 (@RequestBody RestTestDTO  oRestTestDTO) {
        RestTestDTO flower = new RestTestDTO();
         flower.setId(oRestTestDTO.getId());
         flower.setName(oRestTestDTO.getName() + ":  From Server resp");
         flower.setAddress(oRestTestDTO.getAddress()+ ":  From Server resp");
         flower.setCreationDate(oRestTestDTO.getCreationDate());
         flower.setIsActive(oRestTestDTO.getIsActive());
         return flower;
    }
    
   
    
    
 
 
   
    
    
}
