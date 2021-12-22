/*Step 1: Checkout system which only sells apples & oranges
	Apples cost 60p, oranges are 25p
	Build checkout system tha takes list of items scanned at till and outputs total cost*/

//Item costs
val checkoutList : List[String] = List("Apple","Apple","Orange","Apple","Orange");

def checkoutPrice(itemList: List[String]): String = {
  var Apple : Double= 0.6;
  var Orange : Double = 0.25;
  var Totalcost : Double = 0.0;


  for (item <- checkoutList)
    if (item == "Apple") {
        Totalcost+=Apple
    };
    else if( item == "Orange"){
        Totalcost +=Orange
    };


  return "Your total cost is; £"+Totalcost;
};


print(checkoutPrice(checkoutList));

