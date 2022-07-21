Kate Maschmeyer,
Partner: Sam Lojacono

## Instructions for activity

Draw your design plan on your coordinate grid paper or on coordinate grid slides (see Google classroom)! [Coordinate grid paper & digital copy provided to all.]

At least:
+ 1 rectangle or square
+ 1 circle or oval
+ 1 line
+ Fill & stroke colors: 1 fill & 1 stroke color

Color picker: https://htmlcolorcodes.com/color-picker/

Then try to recreate your plan with code!

If you'd like to play with the coordinate grid, try:  
https://p5coordinategrid.katemaschmeyer.repl.co/

You are expected to keep working during class, so add to your design and then your code as you have time!

---
## Additional Scaffolding

May assign additional scaffolding for students via self-create Desmos activity: https://teacher.desmos.com/activitybuilder/custom/6262c6d33dccd434db579d6f?collections=602fed4058b0f132804a9aa1

---
## Code

```Javascript
function setup() {
  createCanvas(400, 400);
}

function draw() {

	background(220);
	
	// REMINDERS:
	// Fill in color (always *before* your shape!): 
	// fill(r, g, b);

	// Rectangle or square
	// rect(x, y, width, height);

	// Oval or circle:
	// ellipse(x, y, width, height);

	// Line:
	// line(x1, y1, x2, y2);

	// Write code below to make your designs!

}
``` 

### Examples of Completed Work 

* https://4-Coding-from-a-Plan-AndresC8.6a1-spring2022.repl.co

```Javascript
function setup() {
  createCanvas(400, 400);
}

function draw() {

	background(220);
	
	// REMINDERS:
	// Fill in color (always *before* your shape!): 
	// fill(r, g, b);

	// Rectangle or square
	// rect(x, y, width, height);

	// Oval or circle:
	// ellipse(x, y, width, height);

	// Line:
	// line(x1, y1, x2, y2);

	// Write code below to make your designs!
fill(200, 80, 50)
rect(160, 100, 80 , 160)
fill(251, 251, 251)
ellipse(180, 130, 20 , 20)
ellipse(220, 130, 20, 20)
ellipse(200, 210, 40, 20)
fill(38, 248, 4)
line(200, 160, 190, 180)
line(190, 180, 200, 178)
fill(00)
textSize(20)
text("The Appalled Man", 120, 50)
fill(64, 176, 22)
text("$1,000,000", 155, 290)
fill(22, 152, 176)
textSize(10)
text("By -------", 157, 80) // redacted student name
}

```

* https://4-coding-from-a-plan-miah2.6a1-spring2022.repl.co/

```Javascript
function setup() {
  createCanvas(400, 400);
}

function draw() {

	background(250);
	
	// REMINDERS:\cdot2
	// Fill in color (always *before* your shape!): 
	// fill(r, g, b);

	// Rectangle or square
	// rect(x, y, width, height);
  strokeWeight(7);
  stroke(255, 178, 55 );
fill(251, 194, 103);
rect(10,10,320,100);
	// Oval or circle:
	// ellipse(x, y, width, height);
  strokeWeight(7);
  stroke(252, 254, 162 );
fill(253, 255, 194);
ellipse(200,200,360,360);
	// Line:
	// line(x1, y1, x2, y2);
   strokeWeight(7);
  stroke(173, 250, 158 );
line(40,40,360,360);
	// Write code below to make your designs!
  strokeWeight(7);
  stroke(253, 153, 139);
fill(254, 202, 195);
rect(110,60,100,180,20);

 strokeWeight(7);
  stroke(54, 137, 48 );
fill(171, 255, 165);
rect(180,140,160,200,20);

strokeWeight(7);
  stroke(54, 137, 48);
fill(171, 255, 165);
ellipse(210,80,50,80);

strokeWeight(7);
  stroke(253, 153, 139);
fill(254, 202, 195);
ellipse(180,290,50,80);
	
}
```