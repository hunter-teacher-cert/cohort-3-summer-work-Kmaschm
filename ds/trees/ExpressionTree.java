public class ExpressionTree{

  // INSTANCE VARIABLES
  private double value;
  private ExpressionTree left,right;
  private char operator;

  // YOU WILL FILL IN 2 METHODS: toString() and evaluate() -- see end of code
  // ALSO COMPLETED: toStringPrefix()


  //  ************** CONSTRUCTORS ****************
  // Constructor - tree can be just a value
  public ExpressionTree(double val){
   value = val;
   left = null;
   right = null;
  }

  // Constructor - Tree can be an operator that connects two sub-trees
  public ExpressionTree(char op, ExpressionTree l, ExpressionTree r){
    operator = op;
    left = l;
    right =r;
  }

  //  ************* PROVIDED METHODS ****************
  // checks if the expressionTree is a value (as opposed to an operator with subtrees)
  private boolean isValue(){
    return left==null && right ==null;
  }

  //Return false when the node is a value, true when it is an operator
  private boolean isOperator(){
    return !isValue();
  }

  //To simplify things, you get a method to use to convert the
  //operator and two values into a result.
  private double apply(double a, double b, char op){
   if(op == '+'){
    return a+b;
   } else if(op == '-'){
    return a-b;
   } else if(op == '*'){
    return a*b;
   } else if(op =='^') {
     return Math.pow(a,b);
   } else if(op == 'r') {
     return Math.pow(a, 1/b);  
   } else{ //  if(op == '/'){ //or any invalid operators
    return a/b;
   }

  }


   //  ************* METHODS TO WRITE ****************
    

    /* Return a string representation of the tree
    EXAMPLES:
    "12.5"  //just a value
    "(5.0-8.0)" //a tree with 2 value children
    "(12.5*(5.0-8.0)) //a tree that is the product of the previous two example trees
    "(((2.0+1.0)/(8.0*0.43)) - 1.0)" //a tree with more 
    */
    public String toString(){
      // Set up empty String, as we will need to return one
       String s = "";
      // What is the base case?  Set it up here
       if(this.isValue()) {
        s += this.value;
      } else {
        s += "(" + left.toString() + " " + this.operator + " " + right.toString() + ")";
      }
      return s;
    } 
      
    //Calculate the value of the entire tree
    // Your thinking from toString() may help here
    // This method will also be recursive
    // Also, use provided method: apply(double a, double b, char op)
    public double evaluate(){
      double result = 0.0; // instantiating just for set up
      
      if(this.isValue()) {
        result = this.value;
      } else {
        result = this.apply(left.evaluate(), right.evaluate(), this.operator); 
      }
      return result;
    }

    // return a prefix notation String representation of the tree
    public String toStringPrefix() {
      String s = "";
      if(this.isValue()) {
        s += this.value;
      } else {
        s += "(" + this.operator + " "  + left.toStringPrefix() + " "  + right.toStringPrefix() + ")";
      }
      return s;    
  }

 }


