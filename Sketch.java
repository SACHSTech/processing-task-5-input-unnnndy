import processing.core.PApplet;
// pac mans eats

public class Sketch extends PApplet {
  float[] starsx = new float[10]; 
  float[] starsy = new float[10];
  int holder;

  String message = "";

  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;

  boolean inprox = false;

  float circleX = 200;
  float circleY = 200;

  float counter = 20;
  int colour = 0;

  public void settings() {
    size(500, 500);
  }

  public void setup(){
    background(colour);
  }

  public void draw() {

    background(colour);
  
    if(counter>10){
      for(int i = 0; i<10; i++){
        starsx[i] = random(0,width);
        starsy[i] = random(0,width);
        counter--;
      }
    }

    for(int y = 0; y<10; y++){
      fill(255, 255, 0);
      noStroke();
      ellipse(starsx[y], starsy[y], 15, 15);
    }

    if (upPressed) {
      circleY--;
    }
    
    if (downPressed) {
      circleY++;
    }
    
    if (leftPressed) {
      circleX--;
    }
    
    if (rightPressed) {
      circleX++;
    }


    for(int h = 0; h != 10; h++){    
      if((mouseX <= starsx[h]+50) && (mouseX >= starsx[h]-50)){ 
        if((mouseY <= starsy[h]+50) && (mouseY >= starsy[h]-50)){ 
          inprox = true;
          holder = h;
      }
    }
    if(inprox = true){
      fill(colour);
      noStroke();
      ellipse(starsx[holder], starsy[holder], 20, 20);
    }
      if((circleX <= starsx[h]+50) && (circleX >= starsx[h]-50)){ 
        if((circleY <= starsy[h]+50) && (circleY >= starsy[h]-50)){ 
          inprox = true;
          holder = h;
      }
    }
    if(inprox = true){
      fill(colour);
      noStroke();
      ellipse(starsx[holder], starsy[holder], 20, 20);
    }
    }
      //arrow pacman
      fill(255,255,0);
      noStroke();
      ellipse(circleX,circleY,50,50);
  
      fill(0,0,0);
      noStroke();
      ellipse(circleX+2,circleY-12,10,10);
  
      fill(colour);
      noStroke();
      triangle(circleX,circleY,circleX+25,circleY-16,circleX+25,circleY+16);
  
      //mouse pacman
      fill(255,255,0);
      noStroke();
      ellipse(mouseX,mouseY,50,50);
  
      fill(0,0,0);
      noStroke();
      ellipse(mouseX+2,mouseY-12,10,10);
  
      fill(colour);
      noStroke();
      triangle(mouseX,mouseY,mouseX-25,mouseY-16,mouseX-25,mouseY+16);
    
    int nextLine = 100;
    fill(255,255,0);
    text(message,25,nextLine);
  
}

  public void keyPressed() {
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    else if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }
  }

  public void mousePressed() {
    if(mouseY<250){
      colour = colour + 5;
      }
    if(mouseY>250){
      colour = colour - 5;
    }
  }
  
  public void keyReleased() {
    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
    }
  }

  public void keyTyped(){
    message += key;
  }
  
}




