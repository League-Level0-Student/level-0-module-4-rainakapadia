int x=376;
int y=100;
//int a=mouseX>360&&mouseX<400;
//int b=mouseY>104&&mouseY<120;
PImage creeper;
PImage minecraft;
void setup() {
  size(500, 500);
  creeper=loadImage("creeper.png");
  creeper.resize(20, 20);
  minecraft=loadImage("minecraft.png");
  minecraft.resize(width, height);
}
void draw() {
  background(minecraft);
  image(creeper, x, y);
  if (mousePressed) {
    println(mouseX, mouseY);
  }
  if (mousePressed) {

    fill(#FF0000);
    ellipse(mouseX, mouseY, 10, 10);
    if (mouseX>0 && mouseX<50 &&mouseY>0&&mouseY<50) {
      fill(#29FF00);
      ellipse(mouseX, mouseY, 10, 10);
    }
    for (int i=0;i<10;i++){
    if(isNear(mouseX, x) && isNear(mouseY, y)){
      fill(#29FF00);
    ellipse(mouseX,mouseY,10,10);
      println("you found the creeper");
      x=x-1;
      y=y+1;
      image(creeper,x,y);
    }
    
    //if(mouseX>360&&mouseX<400&& mouseY>104&&mouseY<120);
    // 
  }}
  }
  boolean isNear(int a, int b) {
    if (abs(a - b) < 50)
      return true;
    else
      return false;
  }
