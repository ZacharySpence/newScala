/*Step 1: Checkout system which only sells apples & oranges
	Apples cost 60p, oranges are 25p
	Build checkout system tha takes list of items scanned at till and outputs total cost*/

/*Step2: Simple offers
Shop decides to introduce 2 offers
buy one get one free Apples
3 for 2 oranges*/
/
//Item costs
val checkoutList : List[String] = List("Apple","Apple","Orange","Apple","Orange");

def checkoutPrice(itemList: List[String]): String = {
	var Apple : Double= 0.6;
	var Orange : Double = 0.25;
	var Totalcost : Double = 0.0;
	var orangeAmount : Integer = 0;
	var appleAmount : Integer = 0;


	for (item <- checkoutList)
		if (item == "Apple"){
			appleAmount+=1;
			if (appleAmount%2==0){ //2 for 1 apples (doesn't add each 2nd apple (buy 1 get one free))
				Unit;
			}
			else{
				Totalcost+=Apple;
			}
		}	
		else if( item == "Orange"){
			orangeAmount += 1;
			if (orangeAmount%3 == 0){ //3 for 2 oranges (doesn't add each 3rd orange))
				Unit;
			}
			else{
				Totalcost +=Orange;
			}
		}
		

	return "Your total cost is; £"+Totalcost;
}
	

print(checkoutPrice(checkoutList));

