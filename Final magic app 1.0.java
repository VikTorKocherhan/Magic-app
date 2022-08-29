import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       
       Scanner scnr = new Scanner(System.in);
       int n =0;
       String numSet1 = "\tЧи бачиш тут своє число? \n 01 03 05 07 09 11 13 15 \n 17 19 21 23 25 27 29 31 \n 33 35 37 39 41 43 45 47 \n 49 51 53 55 57 59 61 63 \n\t y/n";
       String numSet2 = "\n 02 03 06 07 10 11 14 15 \n 18 19 22 23 26 27 30 31 \n 34 35 38 39 42 43 45 47 \n 50 51 54 55 58 59 62 63 \n\t y/n";
       String numSet3= "\n 04 05 06 07 12 13 14 15 \n 20 21 22 23 28 29 30 31 \n 36 37 38 39 44 45 46 47 \n 52 53 54 54 60 61 62 63 \n\t y/n";
       String numSet4= "\n 08 09 10 11 12 13 14 15 \n 24 25 26 27 28 29 30 31 \n 40 41 42 43 44 45 46 47 \n 56 57 58 59 60 61 62 63 \n\t y/n";
       String numSet5="\n 16 17 18 19 20 21 22 23 \n 24 25 26 27 28 29 30 31 \n 48 49 50 51 52 53 54 55 \n 56 57 58 59 60 61 62 63 \n\t y/n";
       String numSet6="\n 32 33 34 35 36 37 38 39 \n 40 41 42 43 44 45 46 47 \n 48 49 50 51 52 53 54 55 \n 56 57 58 59 60 61 62 63 \n\t y/n";
     
      System.out.println (numSet1) ;
      String yn = scnr.next();
      if (yn.equals("y")) {
      n=n+1;
      System.out.println (numSet2);
          yn = scnr.next();
         if (yn.equals("y")) {
         n=n+2;
         System.out.println (numSet3);         
              yn = scnr.next();
            if (yn.equals("y")) {
            n=n+4;
            System.out.println (numSet4);          
                yn = scnr.next();
               if (yn.equals("y")) {
               n=n+8;
               System.out.println (numSet5);               
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);                 
                         yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                   
                  }else{
                  System.out.println (numSet6);                 
                    yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                     
                  }                
               }else{
               System.out.println (numSet5);                
                  yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);                 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                  
                  }else{
                  System.out.println (numSet6);                 
                    yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                    
                  }                 
               }             
            }else{
            System.out.println (numSet4);          
               yn = scnr.next();
               if (yn.equals("y")) {
               n=n+8;
               System.out.println (numSet5);               
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);                 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                  
                  }else{
                  System.out.println (numSet6);                 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                      
                  }                
               }else{
               System.out.println (numSet5);               
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);                                      yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                   
                  }else{
                  System.out.println (numSet6); 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                   
                  }                
               }               
            }         
         }else{
         System.out.println (numSet3);             
              yn = scnr.next();
            if (yn.equals("y")) {
            n=n+4;
            System.out.println (numSet4);            
               yn = scnr.next();
               if (yn.equals("y")) {
               n=n+8;
               System.out.println (numSet5);              
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);                 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                  
                  }else{
                  System.out.println (numSet6);                 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                     
                  }               
               }else{
               System.out.println (numSet5);                
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);                 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                   
                  }else{
                  System.out.println (numSet6);                 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                  
                  }                
               }             
            }else{
            System.out.println (numSet4);             
               yn = scnr.next();
               if (yn.equals("y")) {
               n=n+8;
               System.out.println (numSet5);               
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);                 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }            
                  }else{
                  System.out.println (numSet6);                 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                
                  }                
               }else{
               System.out.println (numSet5);               
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);                
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }          
                  }else{
                  System.out.println (numSet6); 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }         
                  }                    
               }              
            }          
         }      
      }else{
      System.out.println (numSet2); 
         yn = scnr.next();
         if (yn.equals("y")) {
         n=n+2;
         System.out.println (numSet3);         
             yn = scnr.next();
            if (yn.equals("y")) {
            n=n+4;
            System.out.println (numSet4);            
                yn = scnr.next();
               if (yn.equals("y")) {
               n=n+8;
               System.out.println (numSet5);               
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }               
                  }else{
                  System.out.println (numSet6);     
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }                    
                  }                 
               }else{
               System.out.println (numSet5);               
                  yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }         
                  }else{
                  System.out.println (numSet6);
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }         
                  }                       
               }             
            }else{
            System.out.println (numSet4);             
                yn = scnr.next();
               if (yn.equals("y")) {
               n=n+8;
               System.out.println (numSet5);               
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }   
                  }else{
                  System.out.println (numSet6);
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }          
                  }                
               }else{
               System.out.println (numSet5);               
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }       
                  }else{
                  System.out.println (numSet6);
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }              
                  }                     
               }             
            }          
         }else{
         System.out.println (numSet3);       
        yn = scnr.next();
            if (yn.equals("y")) {
            n=n+4;
            System.out.println (numSet4);            
                yn = scnr.next();
               if (yn.equals("y")) {
               n=n+8;
               System.out.println (numSet5);               
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }  
                  }else{
                  System.out.println (numSet6);
                      yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }       
                  }                 
               }else{
               System.out.println (numSet5);                
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }       
                  }else{
                  System.out.println (numSet6); 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }      
                  }                   
               }             
            }else{
            System.out.println (numSet4);             
                yn = scnr.next();
               if (yn.equals("y")) {
               n=n+8;
               System.out.println (numSet5);               
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }         
                  }else{
                  System.out.println (numSet6);
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }      
                  }                
               }else{
               System.out.println (numSet5);               
                   yn = scnr.next();
                  if (yn.equals("y")) {
                  n=n+16;
                  System.out.println (numSet6);
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     } 
                  }else{
                  System.out.println (numSet6); 
                     yn = scnr.next();
                     if (yn.equals("y")) {
                     n=n+32;
                     System.out.println (("Ти загадав число")+" "+n);
                     }else{
                     System.out.println (("Ти загадав число")+" "+n); 
                     }    
                  }                    
               }             
            }                    
         }
      }
	}
}