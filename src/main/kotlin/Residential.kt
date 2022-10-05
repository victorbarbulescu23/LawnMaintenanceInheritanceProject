class Residential (propertyName: String,
                  senior: Boolean,
                  customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: Double):
    Customer(customerName, customerPhone, customerAddress, squareFootage) { //Variables declared in the Commercial
    //constructor are supered up to Customer in this line

    //Name of property being treated
    var propertyName: String = propertyName
        get() = field
        set(value) {
            field = value
        }
    //Boolean that tells if the customer is a senior citizen
    var senior: Boolean = senior
        get() = field
        set(value) {
            field = value
        }

    private val rateForThousand: Double = 6.0


    fun weeklyCharge(): Double{

        //If statement checks if the resident is a senior
        if (!senior){ //Not senior means no discount
            print("Customer Name: $customerName \n" +
                    "Customer Phone: $customerPhone \n" +
                    "Customer Address: $customerAddress \n" +
                    "Property Name: $propertyName \n" +
                    "Square Footage: $squareFootage \n" +
                    "Rate Per Thousand Square Feet: $$rateForThousand \n" +
                    "Total Price per Week: $${(squareFootage/1000.0) * rateForThousand}")
            return (squareFootage/1000.0) * 5.0
        } else { //Not not senior means you are a senior, so a 15% discount is applied after the calculations
            print("Customer Name: $customerName \n" +
                    "Customer Phone: $customerPhone \n" +
                    "Customer Address: $customerAddress \n" +
                    "Property Name: $propertyName \n" +
                    "Square Footage: $squareFootage \n" +
                    "Rate Per Thousand Square Feet: $$rateForThousand \n" +
                    "Senior Discount: 15% \n" +
                    "Total Price per Week: $${((squareFootage/1000.0) * rateForThousand) * 0.85}")
            return ((squareFootage/1000.0) * 5.0) * 0.85
        }
    }





}