// CODE EXAMPLE, see .md file

// Variables go up here
var rectW = 200;

function setup() {
	createCanvas(400, 400);
}

function draw() {

	// Set your background to a color of your choice
	background(233, 255,0);

	// Make a rectangle that covers the left half of your canvas.  Fill it with your second color, then use noStroke() to remove the outline.
  noStroke();
	fill(13, 243, 238);
	rect(0, 0, rectW, 400);




// If we have time: write code to display who wins!
if(rectW < 0) { 
	fill(0);
	text("YELLOW WINS!🧨 ", 100, 100);
}

	


	

	text("x: " + int(mouseX) + ", y:" + int(mouseY), 50, 50 )


}





// use this function to change the width of your rectangle!
function keyPressed() {

	if(key == "o") {
		rectW += 10;
	}

	if(key == "w") {
		rectW -= 10;
	}

	
}