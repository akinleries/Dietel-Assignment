 public class TelevisionTest{


      public static void main(String args[]){

	Television device = new Television();
         device.setPowerOn(true);
      

       
	 device.setProductName("SAMSUNG");
         device.setProductColor("Black");
         device.setVolume(65);
	 device.setChannel(13);

 
    System.out.print("your Television state are :"+"\n"+"samsung 4k-300 is On");
    System.out.print( device.getPowerOn()+"\n" + "The Brand name is"+ " " +device.getProductName()+"\n" + "color is"+" "+device.getProductColor()+"\n"+"volume is"+" "+device.getVolume()+"\n"+"current channel is"+" "+device.getChannel());




      }




   }