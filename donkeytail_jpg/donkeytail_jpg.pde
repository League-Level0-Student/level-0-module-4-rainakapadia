PImage donkey;
PImage tail;
//int x=
void setup(){
 donkey = loadImage("donkey.jpg");
 size(338,338);
tail= loadImage("tail.png");
}
void draw(){
if(dist(0, 0, mouseX, mouseY) < 30){
background(donkey);
}else{
 background(#DE3636);
if( mousePressed){
  println(mouseX, mouseY);
}
image(tail, mouseX-10,mouseY+10,100,100);
rect(0,0,40,40);
rect(250,140,40,40);
}
}
