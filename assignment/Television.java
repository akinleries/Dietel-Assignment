public class Television{

      private String productName;
      private int channel;
      private boolean isOn;
      private int volume;
      private String color;

  public void setProductName(String name){

     this.productName = name;

   }
  public String getProductName(){
     
        return productName;
  
   }

   public void setChannel(int channel){
    
   if (channel >= 1  &&  channel <= 20)
     this.channel = channel++;

  }

  public int getChannel(){

  return channel;

  }

    public void setVolume(int volume){
       this.volume = volume;
    }

  public int getVolume(){
     return volume;
  }

   public void SetIncreaseVolume(int volume){
    
     if (volume >= 1 && volume <= 100)
           this.volume = volume++;
   }

   public int getIncreaseVolume(){

       return this.volume;
  }
   public void setDecreaseVolume(int volume){

    if(volume <= 0 && volume < 100)
         	this.volume = volume--;
  }

   public int getDecreaseVolume(){

     return volume;
  }

   public void setProductColor(String color){
     
       	this.color = color;

   }
  
   public String getProductColor(){

       return this.color;
   }
  public void setPowerOn(boolean isOn){

    this.isOn = isOn;
   }

  public boolean getPowerOn(){

    return isOn;
  
   } 







}