package com.example.school.service.agent.staticAgent;

public class ProxyDisplayImage implements Image{
 
   private DisplayImage displayImage;
 
   @Override
   public void display() {
      if(displayImage == null){
         displayImage = new DisplayImage();
      }
	  System.out.println("代理-图片显示");
      displayImage.display();
   }
}
