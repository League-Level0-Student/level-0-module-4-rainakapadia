void setup(){
  size(800,600);
}
void draw(){
  
  PImage face=loadImage("spongebob.jpg");
  
  face.resize(width,height);
  background(face);
  if(mousePressed){
    println(mouseX, mouseY);
  }
  fill(#FFFCFC);
 ellipse(395, 146,80,80);
 fill(#080808);

 fill(#FFFCFC);
ellipse(447,179,80,80);
fill(#080808);
 //ellipse(447,179,20,20);

if(mouseX<410){
mouseX=409;
 }else if(mouseX>484){
   mouseX=484;
 }
if(mouseY<107){
  mouseY=107;
}else if(mouseY>182){
  mouseY=216;
}
ellipse(mouseX,mouseY,20,20);

  ellipse(mouseX-100,mouseY-50,20,20);
}
