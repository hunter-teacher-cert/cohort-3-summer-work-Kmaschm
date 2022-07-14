// Paired Programming with Maxwell Yearwood 
// (He was driving, so I lated copied & pasted from https://replit.com/@mecpsTealsJava/cohort-3-summer-work-Maxwoodi#methods/PairedP.java)


public class PairedP
  {

   // takes in array of ints and prints out bar graph s.t. for eahc index i in nums, there are nums[i] # of equals signs  
   public static void barGraphify(int [] nums)
    {

      for( int i = 0; i< nums.length; i++)
        {
          System.out.print( i + ": " );
          for( int j = 0; j < nums[i]; j++)
            {
             System.out.print("=");
              
            }
            System.out.println();
          
        }
      
    }

    // vertical bar graph version
 public static void vBarGraphify( int [] nums)
    { 
      int max =nums[0];
      
      for( int i = 0; i < nums.length; i++)
        {
          if(nums[i] > max)
          {
            max = nums[i];
          }
        }

      for(int i = 0; i < max; i++)
        {
           for(int j = 0; j< nums.length; j++)
             {
               if(max - i <= nums[j])
               {
                 System.out.print("* ");
               }
               else
               {
                 System.out.print("  ");
               }
               
             }
            System.out.println();
        }
       for(int l = 0; l< nums.length; l++)
         {
           System.out.print(l + " ");
         }
        System.out.println();
    }

    
    
   public static void main(String [] args)
    {
      int[] nums = {5,7,2};
       barGraphify(nums);
       vBarGraphify(nums);
      
    }
    
  }