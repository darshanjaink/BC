/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Entities;

import java.util.Date;

/**
 *
 * @author gibs
 */
public class Book {
    
    public class BookMaster
    {    
        // <editor-fold defaultstate="collapsed" desc="Common">
        public long Id;
        public String Code;
        public Date CreatedDate;
        public Date TimeStamp;
        public int VersionId;
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="base Book  Info">
        public Boolean   IsISBNCodeAvailable;
        
        public String	 Isbn13	;
        public String	 Isbn10	;
        
        public String	 Title	;
        
        public String SmallThumbnail;
        public String Thumbnail;
        
        //If have multiple Categories ,seperated my $sp$
        public String Categories;
        public String Language;
        
        //If have multiple authers ,seperated my $sp$
        public String Authors	;
        
        
       /* 
        public String	 Authors	;
        public AuthorMaster	 author_id	;
        public String	 author_bio	;
        public String	 authors	;
        public String	 title_slug	;
        public String	 author_slug	;

        public String	 price	;
        public String	 format	;
        public String	 publisher	;
        public String	 pubdate	;
        public String	 edition	;
        public String	 subjects	;
        public String	 lexile	;
        public String	 pages	;
        public String	 dimensions	;
        public String	 overview	;
        public String	 excerpt	;
        public String	 synopsis	;
        public String	 toc	;
        public String	 editorial_reviews	;
        
        */
        
        // </editor-fold>
    }
    
    public class AuthorMaster
    {
 
    // <editor-fold defaultstate="collapsed" desc="Common">
    public long Id;
    public String Code;
    public Date CreatedDate;
    public Date TimeStamp;
    public int VersionId;
    // </editor-fold>
    
     public String title;
     public String slug;
     public String biography;
             
    }
    
   // <editor-fold defaultstate="collapsed" desc="Remove : TODO Later">
   /*
    public class Book2subjects
    {
     public String book;
     public Sub_subjectMasterEntity Sub_subject;
     public Sub_sub_subjectMasterEntity sub_sub_subject;  
    }
    
    
    public class Sub_subjectMasterEntity
    {
     public String title    ;
     public String subject;
     public String slug;
     public int count;
    }
    public class Sub_sub_subjectMasterEntity
    {
     public String title;
     public String sub_subject;
     public String slug;
     public int count;
    }
    */
     // </editor-fold>
    
   }

