
void setup() {
 
  // set the size of your sketch
  size(500, 500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  int a = 500;
  for(int i = 0; i < 9; i++){
    a = a - 50;
    if(i % 2 == 0){
      fill(#FA1717);
      ellipse(250, 250, a, a);
    }
    else{
      fill(#FFFFFF);
      ellipse(250, 250, a, a);
    }
}
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
